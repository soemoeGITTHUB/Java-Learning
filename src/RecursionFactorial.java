public class RecursionFactorial {
    public static  int Factorial(int n){
        if(n==0){
            return 1;
        }
        int ft=Factorial(n-1);
        int fnt=n* Factorial(n-1);
        return fnt;
    }

    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }
}
