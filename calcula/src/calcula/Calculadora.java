package calcula;

public class Calculadora {

			
		    // Método para sumar dos números
		    public static int sumar(int a, int b) {
		        return a + b;
		    }

		    // Método para restar dos números
		    public static int restar(int a, int b) {
		        return a - b;
		    }

		    // Método principal para probar la calculadora
		    public static void main(String[] args) {
		        int num1 = 10;
		        int num2 = 5;

		        // Realizar suma
		        int resultadoSuma = sumar(num1, num2);
		        System.out.println("Suma: " + resultadoSuma);

		        // Realizar resta
		        int resultadoResta = restar(num1, num2);
		        System.out.println("Resta: " + resultadoResta);
		    }
		


	}

