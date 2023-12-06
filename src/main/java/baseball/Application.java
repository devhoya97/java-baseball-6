package baseball;

import baseball.domain.Baseball;
import baseball.domain.Computer;
import baseball.domain.Judgement;
import baseball.domain.Player;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Baseball player = new Player(List.of(1, 2, 3));
        Baseball computer = new Computer();

        Judgement judgement = new Judgement();
        System.out.println("player : " + player.getNumbers());
        System.out.println("computer : " + computer.getNumbers());
        System.out.println("strike : " + judgement.calculateStrike(player.getNumbers(), computer.getNumbers()));
        System.out.println("ball : " + judgement.calculateBall(player.getNumbers(), computer.getNumbers()));
        System.out.println("isEnd(expected true) : " + judgement.isEnd(player.getNumbers(), player.getNumbers()));
    }
}
