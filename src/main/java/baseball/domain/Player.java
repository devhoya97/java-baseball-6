package baseball.domain;

import static baseball.domain.Constants.BASEBALL_NUMBERS_LENGTH;
import static baseball.domain.Constants.MAX_BASEBALL_NUMBER;
import static baseball.domain.Constants.MIN_BASEBALL_NUMBER;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player implements Baseball {
    private final List<Integer> playerNumbers;
    public Player(List<Integer> playerNumbers) {
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
        for (Integer playerNumber : playerNumbers) {
            if (playerNumber < MIN_BASEBALL_NUMBER || playerNumber > MAX_BASEBALL_NUMBER) {
                throw new IllegalArgumentException();
            }
        }
    }

    private void validateDuplication(List<Integer> playerNumbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(playerNumbers);

        if (uniqueNumbers.size() != playerNumbers.size()) {
            throw new IllegalArgumentException();
        }
    }


    @Override
    public List<Integer> getNumbers() {
        return playerNumbers;
    }
}
