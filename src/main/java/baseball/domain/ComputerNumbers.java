package baseball.domain;

import java.util.List;

public class ComputerNumbers implements BaseballNumbers {
    private List<Integer> computerNumbers;
    public ComputerNumbers() {
        create();
    }

    private void create() {

    }

    public void recreate() {

    }

    @Override
    public List<Integer> getNumbers() {
        return null;
    }
}
