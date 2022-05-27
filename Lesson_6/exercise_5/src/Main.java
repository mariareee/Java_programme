import java.util.Scanner;

/*Task:
* Given the number n, not greater than 100. Create the matrix of size n×n
* and fill it by the following rule. Numbers 0 should be stored on the
* primary diagonal. The two diagonals, adjacent to the primary one,
* should contain numbers 1. The next two diagonals - numbers 2, etc.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                int temp = j - i;
                int a = temp < 0 ? - temp : temp;
                matrix[i][j] = a;
            }
        }
        // for each component in matrix -> array of ints
        for(int[] ints : matrix){
            for(int temp : ints){
                System.out.print(temp+ " ");
            }
            System.out.println();
        }
    }
}
