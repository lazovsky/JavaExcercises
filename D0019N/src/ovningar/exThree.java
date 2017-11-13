package ovningar;
import java.util.Scanner;

public class exThree {
    public static void main(String[] args) {
        float sum = 0.0f;
        System.out.print("Skriv in köpessumma: ");
        Scanner lasin = new Scanner(System.in);
        sum = lasin.nextFloat();
        if(sum >= 750) {
            sum = (float) (sum * 0.9);
        }
        System.out.println("Summa att betala är: " + sum);
    }
}