package rockPaperScissors;

public class CheckingWinner {

    public static int checkWinner(String compHand, String userHand){


        if (compHand.equalsIgnoreCase("rock")){
            if (userHand.equalsIgnoreCase("scissors")){
                System.out.println("Computer win");
                return -1;
            }else if(userHand.equalsIgnoreCase("paper")){
                System.out.println("User win");
                return 1;
            }else{
                System.out.println("Draw");
                return 0;
            }
        }

        if (compHand.equalsIgnoreCase("scissors")){
            if (userHand.equalsIgnoreCase("paper")){
                System.out.println("Computer win");
                return -1;
            }else if(userHand.equalsIgnoreCase("rock")){
                System.out.println("User win");
                return 1;
            }else{
                System.out.println("Draw");
                return 0;
            }
        }

        if (compHand.equalsIgnoreCase("paper")){
            if (userHand.equalsIgnoreCase("rock")){
                System.out.println("Computer win");
                return -1;
            }else if(userHand.equalsIgnoreCase("scissors")){
                System.out.println("User win");
                return 1;
            }else{
                System.out.println("Draw");
                return 0;
            }
        }

        return 0;
    }



}
