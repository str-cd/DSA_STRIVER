package S1_Basics.S5Maths;

public class P3_Check_Palindrome {
    public static void main(String[] args) {

        int a =121;

        int n=a;
        int res =0;
        while(a>0){
            int rem=a%10;
            res=res*10+rem;
            a=a/10;
        }

        if(n==res){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}
