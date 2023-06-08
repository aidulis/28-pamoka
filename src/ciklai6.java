import java.util.Scanner;
public class ciklai6 {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Įveskite skaičių, kurio skaitmenų sumą norite apskaičiuoti:");
        int skaicius = skait.nextInt();
        System.out.println("Skaičiaus skaitmenų suma yra: " + returnSumOfDigits(skaicius));
    }

    public static int returnSumOfDigits(int x){
        int suma = 0;
        while (x > 0){
            suma = suma + x % 10;
            x = x/10;
        }
        return (int)suma;
    }
}
