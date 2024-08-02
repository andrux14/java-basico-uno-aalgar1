import java.util.Scanner;

public class ejercicioCaseCalificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la calificacion");
        int calificacion =scanner.nextInt();
        if (calificacion < 1 || calificacion > 10){
            System.out.println("Ingrese un numero de 1 a 10");
        }
        else
            switch (calificacion){
                case 1:
                case 2:
                    System.out.println("Su calificación es: F");
                    break;
                case 3:
                case 4:
                    System.out.println("Su calificación es: D");
                    break;
                case 5:
                case 6:
                    System.out.println("Su calificación es: C");
                    break;
                case 7:
                case 8:
                    System.out.println("Su calificación es: B");
                    break;
                case 9:
                case 10:
                    System.out.println("Su calificación es: A");
                    break;
            }
    }
}