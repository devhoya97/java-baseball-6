package baseball.domain;

import static baseball.domain.Constants.BASEBALL_NUMBERS_LENGTH;
import static baseball.domain.Constants.MAX_BASEBALL_NUMBER;
import static baseball.domain.Constants.MIN_BASEBALL_NUMBER;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class ComputerNumbers implements BaseballNumbers {
    private List<Integer> computerNumbers;
    public ComputerNumbers() {
        create();
    }

    public void create() {
        List<Integer> randomNumbers = new ArrayList<>();

        while (randomNumbers.size() < BASEBALL_NUMBERS_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(MIN_BASEBALL_NUMBER, MAX_BASEBALL_NUMBER);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }

        computerNumbers = randomNumbers;
    }

    @Override
    public List<Integer> getNumbers() {
        return computerNumbers;
    }
}
