import java.util.Scanner;

public class ciklai2 {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Įveskite intervalo pradžią:");
        int pradzia = skait.nextInt();
        System.out.println("Įveskite intervalo pabaigą:");
        int pabaiga = skait.nextInt();
        isvestiSkaiciusNuoIki(pradzia, pabaiga);



    }

    public static void isvestiSkaiciusNuoIki(int pradzia, int pabaiga) {
        for (int x = pradzia; x >= pabaiga; x--) {
            System.out.println(x);
        }


    }
}
