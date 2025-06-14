package com.beesion.ms.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class SecuenciaFibonacci {

    public static List<Integer> fibonacci(int[] inicio, int n) {
        List<Integer> resultado = new ArrayList<>();

        if (n == 0) {
            return resultado; //Devuelve array vacio
        }

        // Agregar los primeros elementos según el valor de n
        if (n >= 1) resultado.add(inicio[0]);
        if (n >= 2) resultado.add(inicio[1]);

        // Generar el resto de la secuencia
        for (int i = 2; i < n; i++) {
            int siguiente = resultado.get(i - 1) + resultado.get(i - 2);
            resultado.add(siguiente);
        }

        return resultado;
    }

    /* Para probarlo rápidamente
    public static void main(String[] args) {
        int[] inicio = {0, 1};
        int n = 9;
        System.out.println(fibonacci(inicio, n));
    } */
}
