public class Main{
    public static void main(String[] aStrings){
        String name = "SEAN Manutnithya";
        System.out.println("Hello" + name);
        // displayP(aStrings);
        displayShapeA(aStrings);
        displayShapeB(aStrings);
    } 
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
    }
}
