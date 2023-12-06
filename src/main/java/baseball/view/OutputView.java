package baseball.view;

import static baseball.domain.Constants.BASEBALL_NUMBERS_LENGTH;

public class OutputView {
    private static final String NEW_LINE = "\n";
    public static void printStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printResult(int strike, int ball) {
        StringBuilder message = new StringBuilder();
        if (ball != 0) {
            message.append(ball).append("볼 ");
        }
        if (strike != 0) {
            message.append(strike).append("스트라이크");
        }
        if (strike == BASEBALL_NUMBERS_LENGTH) {
            message.append(NEW_LINE).append(BASEBALL_NUMBERS_LENGTH)
                    .append("개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
        if (ball == 0 && strike == 0) {
            message.append("낫싱");
        }

        System.out.println(message);
    }
}
