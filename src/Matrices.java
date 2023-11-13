
import java.util.Arrays;
import java.util.Random;

public class Matrices {

    public static void main(String[] args) {

        int[][] matriz= new int[3][3];
        int[][] matriz1 = new int[3][3];
        
        crearMatrices(matriz);
        crearMatrices(matriz1);
        
        System.out.println(" Matriz 1");
        mostrarMatrices(matriz);
        
        System.out.println("\n Matriz 2 ");
        mostrarMatrices(matriz1);
        
        System.out.println("\nsuma de las dos matrices");
        mostrarMatrices(sumarMatrices(matriz, matriz1));

        
    }
    
    private static void crearMatrices(int[][] matrices){
        Random r = new Random();
        for (int f = 0; f < matrices.length; f++) {
            for (int c = 0; c < matrices.length; c++) {
                matrices[f][c] = r.nextInt(100,400);
            }
        }
    }
    
    private static void mostrarMatrices(int[][] matrices){
        for (int[] mostrar : matrices) {
            System.out.println(Arrays.toString(mostrar));
        }
    }
    
    private static int [][] sumarMatrices(int[][] matriz, int[][] matriz1){
        int[][] resultado = new int[3][3];
        for(int i =0; i < matriz.length; i++){
            for(int c = 0; c < matriz1.length; c++){
                resultado[i][c] = matriz[i][c] + matriz1[i][c];
            }
        }
        return resultado;
    }

}
