package homo;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Trapezium t1 = new Trapezium(1, 1);
        Trapezium t2 = new Trapezium(3, 5);
        Trapezium t3 = new Trapezium(8, 2);

        System.out.println("Площадь первой трапеции: " + t1.getArea());
        System.out.println("Периметр первой трапеции: " + t1.getPerimeter());
        System.out.println("Площадь второй трапеции: " + t2.getArea());
        System.out.println("Периметр второй трапеции: " + t2.getPerimeter());
        System.out.println("Площадь третей трапеции: " + t3.getArea());
        System.out.println("Периметр теретей трапеции: " + t3.getPerimeter());

        System.out.println("Количество созданных трапеций: " + Trapezium.getCount());
        System.out.println("---------------------------------------");

        Scanner scanner = new Scanner(System.in);
        Trapezium[] trapeziums;
        System.out.print("Введите количество трапеций: ");
        trapeziums = createTrapeziumArray(scanner.nextInt());
        sumTrapeziumArray(trapeziums);
        allSumTrapeziumArray(trapeziums);
        vivod(trapeziums);
        dovodila(trapeziums);
        perevodila(trapeziums);
    }


    public static Trapezium[] createTrapeziumArray(int sizeArray) {
        Random random = new Random();
        Trapezium[] trapeziums = new Trapezium[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            double width = random.nextDouble() * 100;
            double height = random.nextDouble() * 100;
            trapeziums[i] = new Trapezium(width, height);
        }
        return trapeziums;
    }

    public static double sumTrapeziumArray(Trapezium[] trapeziums) {
        double totalArea = 0;
        double totalPerimeter = 0;
        for (int i = 0; i < trapeziums.length; i++) {
            totalArea += trapeziums[i].getArea();


        }
        return totalArea;
    }


    public static double allSumTrapeziumArray(Trapezium[] trapeziums) {
        double totalPerimeter = 0;
        for (int i = 0; i < trapeziums.length; i++) {
            totalPerimeter += trapeziums[i].getPerimeter();
        }
        return totalPerimeter;
    }


    public static void vivod(Trapezium[] trapeziums) {
        for (int i = 0; i < trapeziums.length; i++) {
            System.out.println("Трапеция " + (i + 1) + ":");
            System.out.println("Площадь: " + trapeziums[i].getArea());
            System.out.println("Периметр: " + trapeziums[i].getPerimeter());
        }
    }
    public static double dovodila(Trapezium[] trapeziums) {
        double totalArea = 0;
        for (int i = 0; i < trapeziums.length; i++) {
            totalArea += trapeziums[i].getArea();

        }
        System.out.println("Общая площадь :" + totalArea);
        return totalArea;
    }
    public static double perevodila(Trapezium[] trapeziums) {
        double totalPerimetr = 0;
        for (int i = 0; i < trapeziums.length; i++) {
            totalPerimetr += trapeziums[i].getPerimeter();

        }
        System.out.println("Общий периметр: " + totalPerimetr);
        return totalPerimetr;
    }

}