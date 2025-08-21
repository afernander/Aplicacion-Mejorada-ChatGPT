import java.util.Scanner;

public class Calculadora {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> sumar();
                case 2 -> restar();
                case 3 -> multiplicar();
                case 4 -> dividir();
                case 5 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Ingrese su opción: ");
    }

    private static int leerNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    private static void sumar() {
        int a = leerNumero("Ingrese el primer número: ");
        int b = leerNumero("Ingrese el segundo número: ");
        System.out.println("El resultado de la suma es: " + (a + b));
    }

    private static void restar() {
        int a = leerNumero("Ingrese el primer número: ");
        int b = leerNumero("Ingrese el segundo número: ");
        System.out.println("El resultado de la resta es: " + (a - b));
    }

    private static void multiplicar() {
        int a = leerNumero("Ingrese el primer número: ");
        int b = leerNumero("Ingrese el segundo número: ");
        System.out.println("El resultado de la multiplicación es: " + (a * b));
    }

    private static void dividir() {
        int a = leerNumero("Ingrese el primer número: ");
        int b = leerNumero("Ingrese el segundo número: ");

        if (b == 0) {
            System.out.println("Error: no se puede dividir por cero.");
        } else {
            System.out.println("El resultado de la división es: " + (a / b));
        }
    }
}
