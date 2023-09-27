import java.util.Scanner;

public class lesson3hw {
    public static void main(String[] args) {
        Scanner inpit = new Scanner(System.in);
        //EX 2-3
    /*
     System.out.println("insert first number");
        int num1 = inpit.nextInt();
        System.out.println("insert second number");
        int num2 = inpit.nextInt();
        System.out.println("insert third number");
        int num3 = inpit.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing");
        }
        //check if equal or find the bigest
        if (num1 == num2 && num1 == num3) {

        } else if (num1 > num2 && num1 > num3) {
            System.out.println("the big num is: " + num1);

        } else if (num2 > num3) {
            System.out.println("the big num is: " + num2);

        } else {
            System.out.println("the big num is: " + num3);
        }*/
        //ex 4
        /*
        System.out.println("Enter number 1 between 9999");
        int number=inpit.nextInt();
        System.out.println("the number is:  "+number);
        System.out.println((Integer.toString(number)).length());*/
        //EX 5
        System.out.println("Enter self employed name");
        String name = inpit.nextLine();
        int salery = 100000;
        int task = 0;
        if (salery >= 23000) {
            task += 23000 * 0.1;
            salery = salery - 23000; //77000
            if (salery > 74000) {
                task += 74000 * 0.3;
                salery = salery - 74000; //3000
                if (salery > 100000) {
                    task += task * 0.5;
                } else {
                    task += task * 0.4;
                }
            } else {
                task += task * 0.2;
            }
            System.out.println("self employed " + name +" pay " + task + "$ task ");
        } else {
            task += salery * 0.1; //10%
        }


    }
}
