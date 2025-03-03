import java.util.*;
public class MatrixMultipication{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Rows");
		int row = sc.nextInt();
		System.out.println("Enter number of Column");
		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.println("arr["+i+"]["+j+"] ");arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter number of Rows");
		int row2 = sc.nextInt();
		System.out.println("Enter number of Column");
		int col2 = sc.nextInt();
		
		int[][] arr2 = new int[row2][col2];
		 if (col != row2) {
            System.out.println("Matrix multiplication is not possible! Columns of first matrix must be equal to rows of second matrix.");
			return;
        }
		
		for(int i = 0; i < row2; i++){
			for(int j = 0; j < col2; j++){
				System.out.println("arr["+i+"]["+j+"] ");arr2[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < row; i++){
			
			for(int j = 0; j < col2; j++){
				
			System.out.print(arr[i][j] * arr2[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}
}