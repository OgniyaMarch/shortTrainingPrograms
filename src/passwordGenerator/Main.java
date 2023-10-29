package passwordGenerator;

public class Main {
    public static void main(String[] args) {
        int sizeOfPassword = 14;
        PasswordGenerator passwordGenerator = new PasswordGenerator(sizeOfPassword);

        System.out.println( passwordGenerator.getPassword());
    }
}
