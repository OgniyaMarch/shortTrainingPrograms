package passwordGenerator;

import java.util.Random;

public class PasswordGenerator {
    private final String characters = "QWERTYUIOPASDFGHJKLZXCVBNM" +
            "qwertyuiopasdfghjklzxcvbnm" +
            "1234567890" +
            "!@#$%^&*()_+=-" +
            "[]{}:;\"'\\,<.>/?|";

    private Random random = new Random();
    private int sizeOfPassword;

    public PasswordGenerator(int sizeOfPassword) {
        this.sizeOfPassword = sizeOfPassword;
    }

    private char getChar(int index){
        char[] charArray = characters.toCharArray();
        return charArray[index];
    }
    public String getPassword(){
        StringBuilder passwordSB = new StringBuilder();

        int max_randomNumb = characters.length();
        for (int i = 0; i < sizeOfPassword; i++){
            passwordSB.append(getChar(random.nextInt(max_randomNumb)));
        }
        return passwordSB.toString();
    }
}
