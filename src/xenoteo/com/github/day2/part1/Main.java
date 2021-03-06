package xenoteo.com.github.day2.part1;

import xenoteo.com.github.day2.InputReader;

public class Main {
    public static void main(String[] args) {
        String filePath = "../input/input.txt";
        InputReader reader = new InputReader();
        reader.readInputFile(Main.class.getResource(filePath));
        System.out.println(new Solution()
                .countValidPasswords(
                        reader.getLowests(),
                        reader.getHighests(),
                        reader.getLetters(),
                        reader.getPasswords()
                ));
    }
}
