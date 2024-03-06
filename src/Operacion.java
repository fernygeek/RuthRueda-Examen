public class Operacion {

    public int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int ordenMatriz = matriz1.length;
        int[][] resultado = new int[ordenMatriz][ordenMatriz];
        for (int i = 0; i < ordenMatriz; i++) {
            for (int j = 0; j < ordenMatriz; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    public int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int ordenMatriz = matriz1.length;
        int[][] resultado = new int[ordenMatriz][ordenMatriz];
        for (int i = 0; i < ordenMatriz; i++) {
            for (int j = 0; j < ordenMatriz; j++) {
                for (int k = 0; k < ordenMatriz; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return resultado;
    }
}
