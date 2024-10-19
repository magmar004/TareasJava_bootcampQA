package TareasBootcampQA.QATesting24;

import java.util.Scanner;

/**
 * Clase que representa una calculadora con múltiples funciones matemáticas básicas.
 * Permite al usuario calcular áreas de figuras geométricas, factoriales,
 * determinar si un número es par o impar, identificar números positivos,
 * negativos o cero, y sumar todos los números anteriores a un número ingresado.
 */

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; // Bandera para controlar el bucle del menú

        while (continuar) {
            // Menú para gestionar acciones
            System.out.print("1) Área de un círculo\n2) Área de un cuadrado\n3) Área de un triángulo\n4) Factorial de un número\n5) Determinar si un número es par o impar\n6) Determinar si un número es -, + o 0\n7) Calcular la suma de todos los números anteriores al número ingresado\n8) Salir\nIngrese lo que desea hacer: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    areaCirculo(scanner);
                    break;
                case 2:
                    areaCuadrado(scanner);
                    break;
                case 3:
                    areaTriangulo(scanner);
                    break;
                case 4:
                    factorial(scanner);
                    break;
                case 5:
                    parOImpar(scanner);
                    break;
                case 6:
                    posNegCer(scanner);
                    break;
                case 7:
                    sumaNumeros(scanner);
                    break;
                case 8:
                	System.out.print("Gracias por usar la calculadora :)");
                    continuar = false; // Salir del bucle
                    break;
                default:
                    System.out.println("Opción inválida.");
                    
            }
        }
        scanner.close(); // cierra el Scanner al finalizar
    }

    public static void areaCirculo(Scanner scanner) {
        System.out.print("Ingrese el radio: ");
        int radio = scanner.nextInt();

        float pi = 3.1416f;
        float area = pi * (float) Math.pow(radio, 2);

        System.out.printf("El área del círculo es: %.2f\n", area);
    }

    public static void areaCuadrado(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        int lado = scanner.nextInt();

        float area = (float) Math.pow(lado, 2);

        System.out.printf("El área del cuadrado es: %.2f\n", area);
    }

    public static void areaTriangulo(Scanner scanner) {
        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();
        System.out.print("Ingrese la altura: ");
        int altura = scanner.nextInt();

        float area = (base * altura) / 2;

        System.out.printf("El área del triángulo es: %.2f\n", area);
    }

    public static void factorial(Scanner scanner) {
        System.out.print("Ingrese el número para sacar su factorial: ");
        int numero = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i; 
        }
        System.out.printf("El factorial de %d es %d\n", numero, factorial);
    }

    public static void parOImpar(Scanner scanner) {
        System.out.print("Ingrese el número a verificar: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("El número %d es par\n", numero);
        } else {
            System.out.printf("El número %d es impar\n", numero);
        }
    }

    public static void posNegCer(Scanner scanner) {
        System.out.print("Ingrese el número a verificar: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.printf("El número %d es positivo\n", numero);
        } else if (numero == 0) {
            System.out.println("El número ingresado es 0");
        } else {
            System.out.printf("El número %d es negativo\n", numero);
        }
    }

    public static void sumaNumeros(Scanner scanner) {
        System.out.print("Ingrese el número: ");
        int numero = scanner.nextInt();

        int suma = 0;

        for (int i = 1; i < numero; i++) {
            suma += i;
        }
        System.out.printf("La suma de los números anteriores a %d es %d\n", numero, suma);
    }
}
