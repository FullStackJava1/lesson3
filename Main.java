import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//Exercise 1
        /**
        System.out.println("Enter frist String:");
        String txt =input.nextLine();
        System.out.println("Enter second String:");
        String txt1 =input.nextLine();
        String txtUpper=txt.toUpperCase();
        String txtUpper1=txt1.toUpperCase();
        System.out.println(txtUpper.equals(txtUpper1));

        //String txt =new String( "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        //String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());
        System.out.println("Substring: " + txt.substring(1, 4));
        String s = "120";
        int num = 20;
        System.out.println(txt == txt1); // comper with Address
        System.out.println(txt.equals(txt1)); //compar with values
         */

        //Exercise 2
        /**
        System.out.println("Enter FullName:");
        String fullName =input.nextLine();
        int indx=fullName.indexOf(" ");
        String lastName=fullName.substring(indx+1).toUpperCase();
        String fristName=fullName.substring(0,indx).toUpperCase();
        System.out.println(lastName+" , "+fristName);

        //System.out.println(fullName.substring(indx+1).toUpperCase()+" , "+fullName.substring(0,indx).toUpperCase());
         */
        // Math
/**
        int maz=Math.max(10 ,5);
        System.out.println(maz);
        //random number between 3-8
        int rand=(int)(Math.random()*6+3);
        System.out.println(rand);
        System.out.println("Enter your speed car:");
        int speed=input.nextInt();
        //if else
        if (speed>=120){
            System.out.println("to fast");

        }
        else if (speed>100) {
            System.out.println("greate");
        }
        else
            System.out.println("to slow ");
 */

/**
    int _TomyAge=20;
    int _DannyAge=30;
    if (_TomyAge>_DannyAge){
        System.out.println("Tomer is an older brother");
    } else if (_DannyAge>_TomyAge) {
        System.out.println("Dany is an older brother");
    }
    else
        System.out.println("Tomer and Dany is  twins");



        String variable = (1<10) ? "true" : "false";
        System.out.println(variable);
        int grade=input.nextInt();
        if (grade<55){
            System.out.println("not enough");
        }else if(grade<=64 && grade>=55){
            System.out.println("not enough");

        }
        else if(grade<75 && grade>64) {
            System.out.println("almost good");
        }
        else if(grade<84 && grade>75){
        System.out.println("GOOD");
        }
        else if(grade<94 && grade>84){
            System.out.println("very good");
        }
        else {
            System.out.println("great");
        }
    */

int day=input.nextInt();
switch (day){
    case 1:
        System.out.println("Sunday");
        break;
    case 2:
        System.out.println("monday");
        break;
    case 3:
        System.out.println("Tuesday");
        break;
    case 4:
        System.out.println("Wednesday");
        break;
    case 5:
        System.out.println("Thursday");
        break;
    case 6:
        System.out.println("Friday");
        break;
    case 7:
        System.out.println("Saturday");
        break;
    default:
        System.out.println("Bad day");

}










    }
}