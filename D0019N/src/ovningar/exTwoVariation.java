package ovningar;
import java.util.Scanner;

public class exTwoVariation {
    public static void main(String[] args) {
        int tal1, tal2, tal3, storst, produkt;
        Scanner input = new Scanner(System.in);
        System.out.print("Ange ett värde för första talet: ");
        tal1 = storst = input.nextInt();
        System.out.print("Ange ett värde för andra talet: ");
        tal2 = input.nextInt();
        if(tal2 > storst) {
            storst = tal2;
        }
        System.out.print("Ange ett värde för tredje talet: ");
        tal3 = input.nextInt();
        if(tal3 > storst) {
            storst = tal3;
        }
        produkt = tal1 * tal2 * tal3;
        System.out.println("Produkten blev: " + produkt);
        System.out.println("Största talet blev: " + storst);
    }
}