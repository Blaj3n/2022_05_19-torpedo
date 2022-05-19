package torpedo;
import java.util.Scanner;
public class Torpedo {

    public static void main(String[] args) {
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
        
    }
    public static int szambeker(){
        Scanner szam = new Scanner(System.in);
        System.out.print("Kérek egy tippet: ");
        return szam.nextInt();
        }

}
