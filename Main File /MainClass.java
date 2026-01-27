import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        CircleRadInConstructor2 obj = new CircleRadInConstructor2();

        obj.setRadius(radius);

        System.out.println("The area of the circle with radius " +
                obj.getRadius() + " is: " + obj.computeArea());

        sc.close();
    }
}
