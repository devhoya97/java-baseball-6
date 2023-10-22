package baseball.model;

import java.util.Objects;

public class BaseballNumber {
    private static final int MIN_BASEBALL_NUMBER = 1;
    private static final int MAX_BASEBALL_NUMBER = 9;
    private final int baseballNumber;


    public BaseballNumber(int baseballNumber) {
        validateBaseballNumber(baseballNumber);
        this.baseballNumber = baseballNumber;
    }

    private static void validateBaseballNumber(int baseballNumber) {
        if (baseballNumber < MIN_BASEBALL_NUMBER || baseballNumber > MAX_BASEBALL_NUMBER) {
            throw new IllegalArgumentException(
                    "[ERROR] 숫자가 " + MIN_BASEBALL_NUMBER + "~" + MAX_BASEBALL_NUMBER + " 사이가 아닙니다."
            );
        }
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof BaseballNumber)) {
            return false;
        }
        return baseballNumber == ((BaseballNumber) object).baseballNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseballNumber);
    }
}
