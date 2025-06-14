package com.beesion.ms.ejercicios;

public class ValidarSudoku {
        public static boolean isValidSudoku(char[][] board) {
            // Verificar filas, columnas y subcuadros
            for (int i = 0; i < 9; i++) {
                boolean[] rowCheck = new boolean[9];
                boolean[] colCheck = new boolean[9];
                boolean[] boxCheck = new boolean[9];

                for (int j = 0; j < 9; j++) {
                    // Verifica fila
                    if (board[i][j] != '.') {
                        int num = board[i][j] - '1'; // convierte char '1'-'9' a int 0-8
                        if (rowCheck[num]) return false;
                        rowCheck[num] = true;
                    }

                    // Verifica columna
                    if (board[j][i] != '.') {
                        int num = board[j][i] - '1';
                        if (colCheck[num]) return false;
                        colCheck[num] = true;
                    }

                    // Verifica subcuadro 3x3
                    int boxRow = 3 * (i / 3) + j / 3;
                    int boxCol = 3 * (i % 3) + j % 3;
                    if (board[boxRow][boxCol] != '.') {
                        int num = board[boxRow][boxCol] - '1';
                        if (boxCheck[num]) return false;
                        boxCheck[num] = true;
                    }
                }
            }
            return true;
        }
}

