import java.sql.SQLOutput;

public class PrintIncreasingNum {
    public static void PrintInc(int n){
        if (n==1){
            System.out.print(1+" ");
            return;

        }
        PrintInc(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        PrintInc(10);
    }
}
