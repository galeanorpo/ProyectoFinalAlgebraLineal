package logic;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Matriz {

    private int[][] matriz;
    private int longitud;
    private final String ecuaciones[] = {"x", "y", "z"};

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public Matriz(int ecuaciones) {
        this.matriz = new int[ecuaciones][ecuaciones];
    }

    public Matriz() {

    }

    public void llenarMatriz(int op) {
        Random nums = new Random();
        if (op == 1) {
            for (int i = 0; i < this.matriz.length; i++) {
                for (int j = 0; j < this.matriz.length; j++) {
                    this.matriz[i][j] = nums.nextInt(10);
                }
            }
        } else if (op == 2) {
            for (int i = 0; i < this.matriz.length; i++) {
                for (int j = 0; j < this.matriz.length; j++) {
                    int valores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de " + ecuaciones[j] + " en la ecuacion " + (i + 1)));
                    this.matriz[i][j] = valores;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta");
        }
    }

    public void mostrarMatriz() {
        if (this.matriz != null) {
            System.out.println("********************************");
            for (int i = 0; i < this.matriz.length; i++) {
                for (int j = 0; j < this.matriz.length; j++) {
                    System.out.print(this.matriz[i][j] + " ");
                }
                System.out.println(" ");
            }
            System.out.println("********************************");
        } else {
            JOptionPane.showMessageDialog(null, "La matriz esta vacia");
        }
    }

    public javax.swing.JTextArea mostrarMatrizJte(int matriz[][], JTextArea area) {
        area.append("*****************************".concat("\n"));
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                area.append(String.valueOf(matriz[i][j]) + "\t");
            }
            area.append("\n");
        }
        area.append("*****************************".concat("\n"));
        return area;
    }

    public void mostarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public void sumaMatrices(int m1[][], int m2[][], JTextArea area) {
        int matrizResult[][] = new int[m1.length][m1.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                matrizResult[i][j] = m1[i][j] + m2[i][j];
            }
        }
        mostarMatriz(m1);
        area.append(" + ".concat("\n"));
        mostarMatriz(m2);
        area.append(" = ".concat("\n"));
        mostrarMatrizJte(matrizResult, area);
    }

    public void restaMatrices(int m1[][], int m2[][], JTextArea area) {
        int matrizResult[][] = new int[m1.length][m1.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                matrizResult[i][j] = m1[i][j] - m2[i][j];
            }
        }
        mostarMatriz(m1);
        area.append(" - ".concat("\n"));
        mostarMatriz(m2);
        area.append(" = ".concat("\n"));
        mostrarMatrizJte(matrizResult, area);
    }

    public void multiplicacionDeMatrices(int m1[][], int m2[][], JTextArea area) {
        int matrizResult[][] = new int[m1.length][m2.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                for (int k = 0; k < m2.length; k++) {
                    matrizResult[i][j] = matrizResult[i][j] + m1[i][k] * m2[k][j];
                }
            }
        }
        area.append("Multiplicacion de matrices".concat("\n"));
        mostrarMatrizJte(matrizResult, area);
    }

    public void productoEscalar(int m1[][], int escalar, JTextArea area) {
        int matrizResult[][] = new int[m1.length][m1.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                matrizResult[i][j] = m1[i][j] * escalar;
            }
        }
        area.append("Matriz con el escalar de: " + escalar + "\n");
        mostrarMatrizJte(matrizResult, area);
    }

    public void transpuesta(int m[][], JTextArea area) {
        int matrizResult[][] = new int[m.length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                matrizResult[i][j] = m[j][i];
            }
        }
        area.append("La matriz transpuesta quedo de la siguiente manera: ".concat("\n"));
        mostrarMatrizJte(matrizResult, area);
    }

    public void gaussJordan() {

    }

    public void determinante() {

    }
}
