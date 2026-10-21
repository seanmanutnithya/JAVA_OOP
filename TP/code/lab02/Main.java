package lab02;
import java.util.ArrayList;
import java.util.Scanner;


// part1
public class Main {
    public static void main(String[] aStrings){
        // greeting(aStrings);
        // convertCur();
        // healthScreening(aStrings);
        // convertTime(aStrings);
        // findX(aStrings);
        // checkPrime();
        // countChar(aStrings);
        // findMin();
        // findMax();
        calculator();
    }
    public static void message(String mes){
        System.out.print(mes);
    }
    // #2.1
    public static void greeting(String[] aStrings){
        message("Input your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.printf("Hello %s!",name);
        input.close();
    }

    // #2.2
    public static void convertCur(){
        message("Progam for converting money in Riels to Dollars.\n");
        message("Please input conversion rate of 1 dollar in Riels: ");
        Scanner input = new Scanner(System.in);
        int rate = input.nextInt();
        message("Please input money to exchange in Riels: ");
        int money = input.nextInt();
        
        float result = (float)money / (float)rate;
        System.out.printf("%d RIELS = %.2f USD",money,result);
        input.close();
    }

    // #2.3 
    public static void healthScreening(String[] aStrings){

        message("==== Covid-19 Screen Health ===\n");

        Scanner input = new Scanner(System.in);
        String[] questions = new String[] {
            "Feeling feverish and/or having chills?",
            "Has there been any use of fever reducing medication within the last 24 hours not due to another health condition?",
            "A new cough that is not due to another health condition?",
            "New chills that are not due to another health condition?",
            "A new sore throat that is not due to another health condition?",
            "A new loss of taste or smell?",
            "Have you had a positive test for the virus that causes COVID-19 disease within the past 10 days?",
            "In the past 14 days, have you had close contact (within about 6 feet for 15 minutes or more) with someone with suspected or confirmed COVID-19?"
        };
        int size = questions.length;
        String[] results = new String[size];
        int idx = 0;
        int order = 0;
        for(String quese : questions){
            order++;
            message("Q" + order + ". " + quese + " ");
            results[idx] = input.nextLine();
            idx++;
        }
        input.close();

        int len = 41;   

        System.out.print("=".repeat(len) + "\n");
        System.out.print("| Questions\t\t | Answers\t|\n");
        System.out.print("=".repeat(len) + "\n");
        for(int i = 0; i < size; i++){
            System.out.printf("| Q%d\t\t\t | %s\t\t|\n",i+1,results[i]);
            System.out.println("-".repeat(len));
        }
    }
    // #2.4
    public static void convertTime(String[] aStrings){
        message("Input number of seconds: ");
        Scanner input = new Scanner(System.in);
        int second = input.nextInt();

        
        float fHour = (float)second / 3600;
        int iHour = (int)fHour;

        float fMin = (float)(fHour - iHour) * 60;
        int iMin = (int)fMin;

        int sec = Math.round((fMin - iMin) * 60);

        message("Time corresponding to 1259 seconds is:: ");
        System.out.printf("%02d:%02d:%02d",iHour,iMin,sec);

        input.close();
    }

    // #2.5
    public static void findX(String[] aStrings){

        Scanner input = new Scanner(System.in);

        message("Program for calculating equation 1/x = 1/y + 1/z to find value of x\n");
        message("Please input y: ");
        float y = input.nextFloat();
        message("Please input z: ");
        float z = input.nextFloat();

        if(y <= 0 || z <=0){
            message("y, z must be greater than 0!\n");
            input.close();
            return;
        }

        float x =(y*z) / (y + z);
        System.out.printf("Result x = %f",x);

        input.close();
    }
    //  #2.6
    public static void checkPrime(){
        message("Input a number to check wethever it is a prime number: ");
        // int[] nums = new int[]{97, 100, 53, 1, 0, 37, 49, 2, 81, 13, 29, 45, 7, 2, 91, 127,19};
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        boolean isPrime = false;
        int count = 0;
        int division = 0;
        if(num <= 2)isPrime = false;
        if(num == 3)isPrime = true;

        for(int i = 3 ; i < num; i++){
            if(num % i == 0){
                division = i;
                isPrime = false;
                break;
            }
            if(count > 1){
                isPrime = false;
            }
            isPrime = count == 0;
        }

        if(isPrime)System.out.println(num + " is prime number.");
        if(!isPrime)System.out.println(num + " is not a prime number, because it divisible by " + division);
    
        // for(int num : nums){
        //     boolean isPrime = false;
        //     int count = 0;

        //     if(num <= 2)isPrime = false;
        //     for(int i = 2 ; i <= num ; i++){
        //         int sqrI = (int)Math.sqrt((double)i);
        //         if(num % sqrI == 0)count++;
        //         isPrime = count == 2;
        //     }
        input.close();
    }

    // #2.7
    public static void countChar(String[] aStrings){
        message("Input sentence: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String vowels = "aeiouAEIOU";
        int vol = 0;
        int space = 0;
        int con = 0;
        for(int i = 0; i < str.length(); i++){
            for(int v =0; v < vowels.length(); v++){
                if(str.charAt(i) == vowels.charAt(v))vol++;
            }
            if(str.charAt(i) == ' ')space++;
        }
        con = str.length() - vol - space;
        System.out.println("Count of volwel: " + vol);
        System.out.println("Count of consonant: " + con);
        System.out.println("Count of space: " + space);
        input.close();
    }

    // #2.8
    public static void findMin(){
        String order = "ABCDE";
        int[] nums = new int[order.length()];
        int min = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i<order.length(); i++){
            System.out.printf("Input value of %c: ",order.charAt(i));
            int num = input.nextInt();
            nums[i] = num;
        }

        for(int num: nums){
            if(min > num) min = num;
        }
        
        System.out.println("The smalleset number amoung A, B, C, D and E is: "+min);
        input.close();
    }
    // # 2.9
    public  static  void findMax(){
        Scanner input = new Scanner(System.in);
        int idx = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        while(true){
            System.out.print("Input value in Array at index " + idx + ": ");
            int num = input.nextInt();
            System.out.print("Do you want to add more (y/n)?: ");
            char ans = input.next().charAt(0);
            nums.add(num);
            if(ans != 'y')break;
            
            idx++;
        }
        input.close();
        int max = nums.get(0);
        for(int num : nums){
            if(num > max) max = num;
        }
        System.out.println("The biggest number amoung in Array is : " + max);
    }

    // #2.10
    public static void calculator() {
    String[] operations = {
        "Addition (+)",
        "Substraction (-)",
        "Multiplication (X)",
        "Division (/)",
        "Quit"
    };
    String ops = "+-*/";
    Scanner input = new Scanner(System.in);

    while (true) {
        message("=== Math Menu ===\n");
        for (int i = 0; i < operations.length; i++) {
            System.out.println((i + 1) + " " + operations[i]);
        }

        int op = input.nextInt();

        if (op == 5) {
            break;
        } else if (op < 1 || op > 4) {
            System.out.println("Invalid option!!!");
            continue;
        }

        char sign = ops.charAt(op - 1);

        message("Please input value A: ");
        int A = input.nextInt();
        message("Please input value B: ");
        int B = input.nextInt();

        int res = 0;
        switch (op) {
            case 1:
                res = A + B;
                break;
            case 2:
                res = A - B;
                break;
            case 3:
                res = A * B;
                break;
            case 4:
                if (B == 0) {
                    System.out.println("Can't divide with 0!!!");
                    continue;
                }
                res = A / B;
                break;
        }

        System.out.printf("Answer of A %c B = %d%n", sign, res);
    }
    input.close();
}
}