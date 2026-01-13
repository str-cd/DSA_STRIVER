package S1_Basics.S5Maths;

public class P4_GCDorHCF {
    public static void main(String[] args) {

        int n1 = 9, n2 = 8;

        int num =Math.min(n1,n2);

        int res =0;

        for(int i=num;i>0;i--){

            if(n1%i==0 && n2%i==0){
                res=i;
                break;
            }
        }

        System.out.println(res);
    }
}
