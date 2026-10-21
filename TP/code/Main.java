
public class Main{
    public static void main(String[] aStrings){
        // #1
        String name = "SEAN Manutnithya";
        System.out.println("Hello" + name);
        displayP(aStrings);
        displayShapeA(aStrings);
        displayShapeB(aStrings);
        displayC(aStrings);
        tableA(aStrings);
        tableB(aStrings);
        System.out.print("Text length is: " + textLen(aStrings));
        System.out.print("Result: " + cutText(aStrings));
        findVowelIdx(aStrings);
        textCompare(aStrings);
        textContain(aStrings);
        Student std1 = new Student(0002, "Makara", 'F', 17, 88.3, 4);
        Student std2 = new Student(0001, "Tola", 'M', 15, 98.3, 3);
        std1.display();
        std2.display();
    } 
    // #2
    public  static void displayP(String[] aStrings){
        System.out.println("\n Line break");
        System.out.println("\t Tabulation");
        System.out.println("\' Single Quote");
        System.out.println("\" Double Quote");
        System.out.println("\\  \\Sign");
        System.out.println("\\\\ \\\\Sign");
        System.out.println("// Line command");
        System.out.println("/*...*/ Block command");
        System.out.println("\"\"\" \n \"\"\" text block");
        
    }
    // #3
    public static  void displayShapeA(String[] asStrings){
        String str = "*";
        int extraSt = 0;
        for(int i = 21; i > 0;i-=2){
            String repeat = str.repeat(i);
            System.out.println(" ".repeat(extraSt++) + repeat);
        }
    }
    public  static void displayShapeB(String[] aStrings){
        int len = 17;
        int height = 10;
        String str = "*";
        String strLen = "\n*\t\t*";
        System.out.print(str.repeat(len));
        System.out.print(strLen.repeat(height));
        System.out.print("\n" + str.repeat(len));
    }
    public static void displayC(String[] aStrings){
        for(int r = 0; r < 5; r++){
            for(int c = 0; c < 5 ; c++){
                System.out.print(r + c + 1 + " ");
            }
            System.out.println();
        }
    }
    // #4
    public static void tableA(String[] aStrings){
        System.out.print("\t |");
        for(int row=1; row<=10;row++){
            System.out.print("\t" + row + "|");
        }
        System.out.print("\n"+"-".repeat(90) + "\n");
        // System.out.println();
        int len = 0;
        for(int row = 1; row <= 5; row++){
            for(int col = 1; col <= 10; col++){
                int num = row * col;
                if(num < 10 && num % 10 != 0){
                    len = 1;
                }
                if(col == 1) System.out.print("\t" + row + "|");
                if(len == 1){
                    System.out.print("\t" + " " + num + "|");
                    len = 0;
                }else {
                    System.out.print("\t" + num + "|");
                }
            }
            System.out.println();
        }
    }
    public static void tableB(String[] aStrings){
        System.out.print("""
            +-----------------+-----------+---------------------+---------+
            | Country         | Name      | Professoin          | Age     |
            +-----------------+-----------+---------------------+---------+
            | Germany         | Micheal   | Computer Engineer   | 19      |
            +-----------------+-----------+---------------------+---------+
            | England         | Robert    | Artist              | 34      |
            +-----------------+-----------+---------------------+---------+
            | United Kingdom  | Julia     | Designer            | 42      |
            +-----------------+-----------+---------------------+---------+
            | United State    | Jo        | Actor               | 21      |
            +-----------------+-----------+---------------------+---------+
        """ );
        
    }
    // #5
    public static String textLen(String[] aStrings){
        String text = "I love my Home Country";
        
        int len =  text.length();
        return String.valueOf(len);
    }
    public static String cutText(String[] aStrings){
        String text = "I love my little country";
        String cutText = text.substring(7);
        
        return cutText;
    }
    public static void findVowelIdx(String[] aStrings){
        String text = "Hi Student!";
        String vols = "aeiouAEIOU"; 
        
        for(int t=0; t<text.length(); t++){
            char ch = text.charAt(t);
            if(vols.indexOf(ch) != -1){
                System.out.println("\"" + ch + "\" is at index: " + t);
            }
        }
    }
    public static void textCompare(String[] aStrings){
        String text1 = "Hi Students!";
        String text2 = "Students!";
        String text3 = "Hi Students!";
        System.out.println("text1 is eqaul to text2: " + text1.equals(text2));
        System.out.println("text1 is eqaul to text3: " + text1.equals(text3));
    }
    public static void textContain(String[] aStrings){
        String text1 = "Hi Students!";
        String text2 = "Students";
        String text3 = "Teacher";
        System.out.println("text1 contains text2: " + text1.contains(text2));
        System.out.println("text1 contains text3: " + text1.contains(text3));
    }
}
    // #7
    class Car{
        String model;
        String color;
        String year;
        int price;
        int warenty;
    }
    class Employee {
        String name;
        String Id;
        String DOB;
        String dept;
        String offi;        
    }
    class BankAccount {
        String name;
        String password;
        String accNum;
        int balance;
        int expense;
    }
    class Video{
        String name;
        String ext;
        int length;
        int resolution;
        int size;
    }
    class Student{
        int studentId;
        String name;
        char gender;
        int age;
        double score;
        int year;
        Student(int studentId, String name, char gender, int age, double score, int year){
            this.studentId = studentId;
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.score = score;
            this.year = year;
        }
        void display(){
            System.out.printf(
            """
                StudentId: %d
                Name:      %s
                Gender:    %c
                Age:       %d
                Score:     %.1f
                Year:      %d
            """,studentId,name,gender,age,score,year);
        }
    }    