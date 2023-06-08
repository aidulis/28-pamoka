import java.util.Scanner;
public class ciklai3 {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Įveskite skaičių:");
        int skaicius = skait.nextInt();
        isvestiBruksniukus(skaicius);
        System.out.println();
    }
    public static void isvestiBruksniukus(int x){
        String bruksniukas = "";
        for (int n = 0; n < x; n++){
            bruksniukas += "-";
        }
        System.out.println(bruksniukas);
    }
}
