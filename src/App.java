/**
 * Copyright (C) 2024
 * Matemáticas Computacionales y Teoría de la Computación
 * @author Ruth Rueda
 * @version 1.0
 */

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        Matriz matriz =  new Matriz();
        Operacion  operacion = new Operacion();

        int ordenMatriz = matriz.getOrden();
        int[][] matriz1 = matriz.generarMatrizAleatoria(ordenMatriz);
        int[][] matriz2 = matriz.generarMatrizAleatoria(ordenMatriz);
        
        System.out.println("\nMatriz 1:");
        matriz.imprimirMatriz(matriz1);
        System.out.println("Matriz 2:");
        matriz.imprimirMatriz(matriz2);
        
        // Se inicia el temporizador
        long tiempoInicio = System.nanoTime();

        // int[][] matrizSuma = operacion.sumarMatrices(matriz1, matriz2);
        int[][] matrizMultiplicacion = operacion.multiplicarMatrices(matriz1, matriz2);
        
        // Finaliza el temporizador
        long tiempoFinal = System.nanoTime();
        
        // System.out.println("\nMatriz Suma:");
        // matriz.imprimirMatriz(matrizSuma);

        System.out.println("\nMatriz Multiplicación:");
        matriz.imprimirMatriz(matrizMultiplicacion);

        // Calcula el tiempo transcurrido
        long tiempoTranscurrido = tiempoFinal - tiempoInicio;
        // Convierte el tiempo a segundos
        double milisegundos = (double) tiempoTranscurrido / 1_000_000.0;
        System.out.println("\nTiempo de ejecución: " + milisegundos + " milisegundos");
        
    }
}