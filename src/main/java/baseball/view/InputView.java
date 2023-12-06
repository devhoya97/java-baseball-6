package baseball.view;

import java.util.List;

public class InputView {
    public List<Integer> getUserNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        return null;
    }

    public boolean doesRetry() {
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return false;
    }
}
