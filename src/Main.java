import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number ,total =0;
        int digitCount;
        System.out.println("Enter a number : "); //Bir sayı al
        number = input.nextInt();

        while (number != 0){     //Girilen sayi 0 olana kadar döngü devam eder.
            digitCount = number % 10; // Sayinin son basamak sayısını alır
            number /=10;  //  Sayinin son basamak sayısını azaltır

            total += digitCount; Son basamk rakamını bir önceki basamak sayısıyla toplar

        }
        System.out.println("Total digitcounter : " + total);
    }

}

