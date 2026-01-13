package S1_Basics.S1ThinstoKnow;

import java.util.Scanner;

public class P1_UserInput_Output {
    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number!!!");

        int a = sc.nextInt();

        //output
        System.out.println("The number you have entered is : "+ a);

    }
}
