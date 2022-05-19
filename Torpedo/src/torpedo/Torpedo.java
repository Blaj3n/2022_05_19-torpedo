package torpedo;

import java.util.Random;
import java.util.Scanner;

public class Torpedo {

    public static void main(String[] args) {
        general();
        hajo_helyzet();
        szambeker();
    }

    public static void general() {
        String[] vonalak = new String[7];
        String vonal = "_";
        for (int i = 0; i < 7; i++) {
            vonalak[i] = vonal;
            System.out.print(vonalak[i]);
        }
    }

    public static void hajo_helyzet() {
        Random rnd = new Random();
        for (int i = 0; i < 7; i++) {
            int randomszam = rnd.nextInt(8);
            System.out.print("\n" + randomszam);
        }

    }

    public static int szambeker() {
        Scanner szam = new Scanner(System.in);
        System.out.print("Kérek egy tippet: ");
        return szam.nextInt();
    }
}
