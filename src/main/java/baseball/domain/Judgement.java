package baseball.domain;

import static baseball.domain.Constants.BASEBALL_NUMBERS_LENGTH;

import java.util.List;
import java.util.Objects;

public class Judgement {
    public int calculateStrike(Baseball player, Baseball computer) {
        List<Integer> playerNumbers = player.getNumbers();
        List<Integer> computerNumbers = computer.getNumbers();

        int strike = 0;
        for (int baseballIndex = 0; baseballIndex < BASEBALL_NUMBERS_LENGTH; baseballIndex++) {
            if (Objects.equals(playerNumbers.get(baseballIndex), computerNumbers.get(baseballIndex))) {
                strike++;
            }
        }

        return strike;
    }

    public int calculateBall(Baseball baseballNumbers1, Baseball baseballNumbers2 ) {
        return 0;
    }

    public boolean isEnd(Baseball baseballNumbers1, Baseball baseballNumbers2 ) {
        return false;
    }
}
