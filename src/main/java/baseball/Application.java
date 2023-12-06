package baseball;

import baseball.domain.Baseball;
import baseball.domain.Computer;
import baseball.domain.Judgement;
import baseball.domain.Player;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        OutputView.printStart();

        Judgement judgement = new Judgement();

        do {
            Baseball computer = new Computer();
            playTurn(computer, judgement);
        } while (InputView.doesRetry());

        OutputView.printEnd();
    }

    private static void playTurn(Baseball computer, Judgement judgement) {
        while (true) {
            Baseball player = new Player(InputView.getUserNumbers());

            int strike = judgement.calculateStrike(player.getNumbers(), computer.getNumbers());
            int ball = judgement.calculateBall(player.getNumbers(), computer.getNumbers());

            OutputView.printResult(strike, ball);

            if (judgement.isEnd(player.getNumbers(), computer.getNumbers())) {
                break;
            }
        }
    }
}
