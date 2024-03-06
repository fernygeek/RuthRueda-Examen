import java.util.Random;
import java.util.Scanner;

public class Matriz {

    public int  getOrden() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ANÁLISIS DE COMPLEJIDAD ");
        int ordenMatriz = validarEntero(scanner, ">>Ingrese el orden de las matrices: ");
        while(ordenMatriz <= 0){
            System.out.println("El orden no debe ser negativo o cero.\n");
            ordenMatriz = validarEntero(scanner, ">>Ingrese el orden de las matrices: ");
        }
        scanner.close();
        return ordenMatriz;
    }

    public int validarEntero(Scanner scanner, String mensaje) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                break;
            } else {
                System.out.println("Error! Debe ingresar un número entero mayor a cero.\n");
                scanner.next();
            }
        }
        return numero;
    }

    public static int[][] generarMatrizAleatoria(int ordenMatriz) {
        Random random = new Random();
        int[][] matriz = new int[ordenMatriz][ordenMatriz];
        
        for (int i = 0; i < ordenMatriz; i++) {
            for (int j = 0; j < ordenMatriz; j++) {
                matriz[i][j] = random.nextInt(100 + 100 + 1) -100;
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        int ordenMatriz = matriz.length;
        
        for (int i = 0; i < ordenMatriz; i++) {
            for (int j = 0; j < ordenMatriz; j++) {
                // System.out.print(matriz[i][j] + "\t");
                System.out.print(String.format("%6d", matriz[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}
