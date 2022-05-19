package torpedo;
import java.util.Scanner;
public class Torpedo {

    public static void main(String[] args) {
        szambeker();
    }
    public static void general(){
        
    }
    public static void hajo_helyzet(){
        
    }
    public static int szambeker(){
        Scanner szam = new Scanner(System.in);
        System.out.print("Kérek egy tippet: ");
        if (szam < 0 && szam > 7){
            return szam.nextInt();
        }else{
        Scanner szam = new Scanner(System.in);
        System.out.print("A tipp 1 és 7 között legyen!: ");
        }
    }
    
    
}
