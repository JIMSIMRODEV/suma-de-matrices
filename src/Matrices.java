//link de githud     
//https://github.com/JIMSIMRODEV/suma-de-matrices/tree/master
import java.util.Arrays;
import java.util.Random;

public class Matrices {

    public static void main(String[] args) {

        int[][] matriz1= new int[3][3];
        int[][] matriz2 = new int[3][3];
        
        crearMatrices(matriz1);
        crearMatrices(matriz2);
        
        System.out.println(" Matriz 1");
        mostrarMatrices(matriz1);
        
        System.out.println("\n Matriz 2 ");
        mostrarMatrices(matriz2);
        
        System.out.println("\nsuma de las dos matrices");
        mostrarMatrices(sumarMatrices(matriz1, matriz2));

        
    }
    
    private static void crearMatrices(int[][] matrices){
        Random r = new Random();
        for (int f = 0; f < matrices.length; f++) {
            for (int c = 0; c < matrices.length; c++) {
                matrices[f][c] = r.nextInt(9);
            }
        }
    }
    
    private static void mostrarMatrices(int[][] matrices){
        for (int[] mostrar : matrices) {
            System.out.println(Arrays.toString(mostrar));
        }
        System.out.println(" ");
    }
    
    private static int [][] sumarMatrices(int[][] matriz1, int[][] matriz2){
        int[][] resultado = new int[3][3];
        for(int i =0; i < matriz1.length; i++){
            for(int c = 0; c < matriz1.length; c++){
                resultado[i][c] = matriz1[i][c] + matriz2[i][c];
            }
        }
        return resultado;
    }
}
