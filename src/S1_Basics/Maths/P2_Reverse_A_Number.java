package S1_Basics.Maths;

public class P2_Reverse_A_Number {

    public static void main(String[] args) {
        int a = 123456;
        int res =0;
        while(a>0){
            int rem=a%10;
            res=res*10+rem;
            a=a/10;
        }

        System.out.println(res);
    }
}
