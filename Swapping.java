package TareasBootcampQA.QATesting24;

public class Swapping {

	public static void main(String[] args) {
        int x = 5614235;
        int y = 20;

        System.out.println("Valores iniciales: x = " + x + ", y = " + y);
        
        //Intercambiar sin variable temporal usando multiplicación y división
        x = x * y; // x ahora es el producto de ambos valores
        y = x / y; // y toma el valor original de x
        x = x / y; // x toma el valor original de y
        
        System.out.println("Valores intercambiados: x = " + x + ", y = " + y);
    }
	
}
