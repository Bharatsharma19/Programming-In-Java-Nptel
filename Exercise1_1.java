import java.util.Scanner;

public class Exercise1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double perimeter;
        double area;

        // Calculate the perimeter
        perimeter = 2 * Math.PI * radius;

        // Calculate the area
        area = perimeter * radius;

        System.out.println("Perimeter : " + perimeter);
        System.out.println("Area : " + area);
    }
}
