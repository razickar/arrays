import java.util.*;
public class Transpose{
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
		
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		for(int j = 0; j < col; j++){
			for(int i = 0; i < row; i++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}