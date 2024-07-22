import java.util.Scanner;
//Codigo mejorado con ChatGPT
public class Calculadora {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            ejecutarOperacion(opcion);
        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Ingrese su opción: ");
    }

    public static void ejecutarOperacion(int opcion) {
        switch (opcion) {
            case 1:
                sumar();
                break;
            case 2:
                restar();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                dividir();
                break;
            case 5:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    public static void sumar() {
        int numero1, numero2;
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void restar() {
        int numero1, numero2;
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextInt();
        int resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void multiplicar() {
        int numero1, numero2;
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextInt();
        int resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static void dividir() {
        int numero1, numero2;
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextInt();
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero");
        } else {
            int resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }
}
