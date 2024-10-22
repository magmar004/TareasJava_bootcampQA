package TareasBootcampQA.QATesting24;

import java.util.Scanner;

public class CalculadoraOperacionesSecuenciales {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido a la calculadora de 5 repeticiones, ingresaras 2 numeros");
        
        for (int i = 0; i < 5; i++) {
            
            System.out.print("Ingrese el primer número: ");
            int numero1 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo número: ");
            int numero2 = scanner.nextInt();
            
            // Menu para que el usuario pueda seleccionar que desea hacer
            System.out.print("Ingrese lo que desea hacer:\n1) Sumar\n2) Restar\n3) Multiplicar\n4) Dividir\n5) Salir\nOpción: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    SumaNumero(numero1, numero2);
                    break;
                case 2:
                    RestaNumero(numero1, numero2);
                    break;
                case 3:
                    MultiplicarNumero(numero1, numero2);
                    break;
                case 4:
                    DivisioNumero(numero1, numero2);
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema.");
                    i = 5; 
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
        scanner.close();
    }
    
    static public void SumaNumero(int num1, int num2) {
        int suma = num1 + num2;
        System.out.printf("La suma de los números %d y %d es %d%n", num1, num2, suma);
    }
    
    static public void RestaNumero(int num1, int num2) {
        int resta = num1 - num2;
        System.out.printf("La resta de los números %d y %d es %d%n", num1, num2, resta);
    }
    
    static public void MultiplicarNumero(int num1, int num2) {
        int multiplicacion = num1 * num2;
        System.out.printf("La multiplicación de los números %d y %d es %d%n", num1, num2, multiplicacion);
    }
    
    static public void DivisioNumero(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            int division = num1 / num2;
            System.out.printf("La división de los números %d y %d es %d%n", num1, num2, division);
        }
    }
}
