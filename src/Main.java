import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int minNum = 0;
        int maxNum = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter number to run code or invalid number to exit code:");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int userInput = scanner.nextInt();

                //check maximum and minimum number
                if (userInput > maxNum){
                    maxNum = userInput;
                } else if (userInput < minNum){
                    minNum = userInput;
                } else {
                    //nothing to do
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
            //handle enter key issue
            scanner.nextLine();
        }

        //close the scanner
        scanner.close();

        //print max and min number that user entered
        System.out.println("Maximum number is " + maxNum);
        System.out.println("Minimum number is " + minNum);
    }
}
