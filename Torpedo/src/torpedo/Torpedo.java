package torpedo;
import java.util.Scanner;
public class Torpedo {

    public static void main(String[] args) {
        szambeker();
    }

    public static void general() {
        String[] vonalak;
        for (int i = 0; i < 7; i++) {
            System.out.print("_");
        }

    }

    public static void hajo_helyzet() {

    }
    public static int szambeker(){
        Scanner szam = new Scanner(System.in);
        System.out.print("Kérek egy tippet: ");
        return szam.nextInt();
        }

}
