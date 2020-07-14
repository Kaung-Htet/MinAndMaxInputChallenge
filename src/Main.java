import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int minNum = 0;
        int maxNum = 0;

        //တကယ်လို့ boolean first = true method ကိုမသုံးချင်ရင်
        //ဒီအောက်ကနည်းနဲ့လည်းသုံးလို့ရတယ်
//        int minNum = Integer.MAX_VALUE;
//        int maxNum = Integer.MIN_VALUE;
        
        boolean first = true;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter number to run code or invalid number to exit code:");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int userInput = scanner.nextInt();

                //to solve minimum zero value
                //ပထမအကြိမ်ထည့်တဲ့တန်ဖိုးကို အနည်းဆုံးနဲ့အများဆုံးတန်ဖိုးအဖြစ် သတ်မှတ်လိုက်တာ
                if (first){
                    first = false;
                    minNum = userInput;
                    maxNum = userInput;
                }

                //check maximum and minimum number
                if (userInput > maxNum){
                    maxNum = userInput;
                } else if (userInput < minNum){
                    minNum = userInput;
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
