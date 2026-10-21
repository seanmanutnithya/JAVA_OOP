package lecture_2;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;




public class Main {
        public static void main(String[] aStrings){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = input.nextLine();
            System.out.println("HI " + name.substring(0,1).toUpperCase() + name.substring(1));
            // input.close();

            // widening type casting
            int num = 10;
            System.out.println("The integer value:" + num);
            double data = num;
            System.out.println("The double vlaue: " + data);

            // narrow type casting
            double pi = 3.14;
            System.out.println("The double value: " + pi);
            int num1 = (int)pi;
            System.out.println("The integer value:" + num1);

            // arithmetic operations
            int a = 12, b = 5;
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));

            System.out.print("Enter day: " );
            int day = input.nextInt();
            String dayName = switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                default -> "Other day";
            };

            System.out.println(dayName);

            String[] names = new String[]{"dara","nithya","Sokheng"};

            for(String n: names){
                System.out.println(n);
            }
        }

}
