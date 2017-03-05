package main.arrays;

/**
 * Created by kgresmer on 3/3/2017.
 */
public class RotateMatrix {

    public static int[][] rotate(int[][] matrix) {
        int length = matrix[0].length;
        for (int layer = 0; layer < length /2; ++layer) {
            int last = length - 1 - layer;
            for(int i = layer; i < last; ++i) {
                System.out.println("Row: " + layer + " Index: " + i );
                int offset = i - layer;
                System.out.println("Offset: " + offset);
                //save top and wait for the rest to move around
                int top = matrix[layer][i];
                //move left to top
                matrix[layer][i] = matrix[last-offset][layer];
                System.out.println("Matrix["+ layer +"]["+ i+"] " + matrix[layer][i]);
                //move bottom to left
                matrix[last - offset][layer] = matrix[last][last - offset];
                System.out.println("Matrix["+(last - offset)+"]["+layer+"] " + matrix[last - offset][layer]);
                //move right to bottom
                matrix[last][last - offset] = matrix[i][last];
                System.out.println("Matrix["+last+"]["+(last - offset)+"] " + matrix[last][last - offset]);
                //move top to right
                matrix[i][last] = top;
                System.out.println("Matrix["+i+"]["+last+"] " + matrix[i][last]);
            }
        }
        return matrix;
    }
}
