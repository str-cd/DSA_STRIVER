package S1_Basics.S2Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N !!!");

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++ ){
                System.out.print(j+1);
            }
            System.out.println();
        }

    }
}
