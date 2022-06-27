import java.util.*;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int sum= 0;
        System.out.print("Enter a number");
        int n = sc.nextInt();


        for (i = 1; i <= n; i++) {
            sum= i+sum;



        }

        System.out.println("Total= " +sum);
    }
}

