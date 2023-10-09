package passwordStrengthChecker;

public class PasswordStrengthChecker {
    private static int passwordStrengthScore = 0;
    public static int checkPasswordStrength(String password){
        String tempUserPassword = password;

        //the first criterion
        //Minimum length (e.g., 8 characters)
        if (password.length() >= 8){
            System.out.println("Your password more than 8 symbols");
            passwordStrengthScore++;
        }

        //Presence of at least one uppercase letter
        if (!password.equals(tempUserPassword.toLowerCase())){
            passwordStrengthScore++;
            System.out.println("Your password contains uppercase letter");
        }

        //Presence of at least one lowercase letter
        if(!password.equals(tempUserPassword.toUpperCase())){
            passwordStrengthScore++;
            System.out.println("Your password contains lowercase letter");
        }

        //Presence of at least one digit (0-9)
        for (int i = 0; i <= 9; i++){
            String integerInPassword = "" + i + "";
            if(password.contains(integerInPassword)){
                passwordStrengthScore++;
                System.out.println("Your password contains digit");
                break;
            }
        }

        return passwordStrengthScore;
    }

}



/*
        //Presence of at least one special character (e.g., !@#$%^&*)

        // Define a regular expression pattern to match special characters
        Pattern specialCharPattern = Pattern.compile("[!@#$%^&*()]");

        // Create a Matcher object to find matches in the password
        Matcher matcher = specialCharPattern.matcher(password);

        // Check if at least one special character is found
        boolean hasSpecialChar = matcher.find();

        // Determine the result based on whether a special character is found
        if (hasSpecialChar) {
            System.out.println("Password contains at least one special character.");
        } else {
            System.out.println("Password does not contain any special characters.");
        }
 */
