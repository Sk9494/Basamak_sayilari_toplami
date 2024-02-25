import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number ,total =0;
        int digitCount;
        System.out.println("Enter a number : ");
        number = input.nextInt();

        while (number != 0){
            digitCount = number % 10;
            number /=10;

            total += digitCount;

        }
        System.out.println("Total digitcounter : " + total);
    }

}

