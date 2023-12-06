package baseball.domain;

import static baseball.domain.Constants.BASEBALL_NUMBERS_LENGTH;

import java.util.List;
import java.util.Objects;

public class Judgement {
    public int calculateStrike(List<Integer> playerNumbers, List<Integer> computerNumbers) {
        int strike = 0;
        for (int baseballIndex = 0; baseballIndex < BASEBALL_NUMBERS_LENGTH; baseballIndex++) {
            if (Objects.equals(playerNumbers.get(baseballIndex), computerNumbers.get(baseballIndex))) {
                strike++;
            }
        }

        return strike;
    }

    public int calculateBall(List<Integer> playerNumbers, List<Integer> computerNumbers) {
        int ball = 0;
        for (int baseballIndex = 0; baseballIndex < BASEBALL_NUMBERS_LENGTH; baseballIndex++) {
            if (Objects.equals(playerNumbers.get(baseballIndex), computerNumbers.get(baseballIndex))) {
                continue;
            }
            if (computerNumbers.contains(playerNumbers.get(baseballIndex))) {
                ball++;
            }
        }

        return ball;
    }

    public boolean isEnd(List<Integer> playerNumbers, List<Integer> computerNumbers) {
        return playerNumbers.equals(computerNumbers);
    }
}
