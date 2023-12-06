package baseball.domain;

import static baseball.domain.Constants.BASEBALL_NUMBERS_LENGTH;

import java.util.List;

public class PlayerNumbers implements BaseballNumbers {
    private final List<Integer> playerNumbers;
    public PlayerNumbers(List<Integer> playerNumbers) {
        validate(playerNumbers);
        this.playerNumbers = playerNumbers;
    }

    private void validate(List<Integer> playerNumbers) {
        validateLength(playerNumbers);
        validateRange(playerNumbers);
        validateDuplication(playerNumbers);
    }

    private void validateLength(List<Integer> playerNumbers) {
        if (playerNumbers.size() != BASEBALL_NUMBERS_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    private void validateRange(List<Integer> playerNumbers) {

    }

    private void validateDuplication(List<Integer> playerNumbers) {

    }


    @Override
    public List<Integer> getNumbers() {
        return null;
    }
}
