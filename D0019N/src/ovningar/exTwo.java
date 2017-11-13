package ovningar;
import java.util.Scanner;

public class exTwo {
    public static void main(String[] args) {
        int tal1, tal2, tal3, produkt;
        Scanner input = new Scanner(System.in);
        System.out.print("Ange ett värde för första talet: ");
        tal1 = input.nextInt();
        System.out.print("Ange ett värde för andra talet: ");
        tal2 = input.nextInt();
        System.out.print("Ange ett värde för tredje talet: ");
        tal3 = input.nextInt();
        produkt = tal1 * tal2 * tal3;
        System.out.println("Produkten blev: " + produkt);
    }
}