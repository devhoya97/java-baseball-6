package baseball.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputView {
    private static final int RETRY = 1;
    private static final int GAME_END = 2;
    public static List<Integer> getUserNumbers() {
        System.out.print("숫자를 입력해주세요 : ");

        char[] inputs = Console.readLine().toCharArray();

        List<Integer> userNumbers = new ArrayList<>();
        for (char input : inputs) {
            Integer userNumber = customParseInt(String.valueOf(input));
            userNumbers.add(userNumber);
        }

        return userNumbers;
    }

    public static boolean doesRetry() {
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        String input = Console.readLine();
        int parsedInput = customParseInt(input);

        if (parsedInput == RETRY) {
            return true;
        }
        if (parsedInput == GAME_END) {
            return false;
        }

        throw new IllegalArgumentException();
    }

    public static Integer customParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException();
        }
    }
}
