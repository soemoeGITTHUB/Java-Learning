public class RecursionSum {
    public static int CalcSum(int n){
        if(n==1){
            return 1;
        }
        int sum=CalcSum(n-1);
        int summ=n+CalcSum(n-1);
        return summ;
    }

    public static void main(String[] args) {
        System.out.print(CalcSum(2));
    }
}
