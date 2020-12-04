package pgdp.math;

import static pgdp.MiniJava.*;

class Pascal {
    public static int[][] pascalTriangle(int n) {
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++)
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
        }
        return triangle;
    }

    public static void main(String[] args) {
        int numberOfLines = read("Gib die Zeilenzahl an:");
        int[][] triangle = pascalTriangle(numberOfLines);
        for (int i = 0; i < numberOfLines; i++) {
            writeConsole("n=" + i);
            for (int j = 0; j < triangle[i].length; j++) {
                writeConsole("\t");
                writeConsole(triangle[i][j]);
            }
            writeLineConsole();
        }
    }
}