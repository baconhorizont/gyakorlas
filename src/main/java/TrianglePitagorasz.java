import java.util.Scanner;

public class TrianglePitagorasz {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a háromszög \"A\" oldalt:");
        int sideA = scanner.nextInt();


        System.out.println("Adja meg a háromszög \"B\" oldalt:");
        int sideB = scanner.nextInt();


        Triangle triangle = new Triangle(sideA, sideB);


        System.out.println("A háromszög \"C\" oldalának hossza: " + triangle.calculateCSide());

    }

}


