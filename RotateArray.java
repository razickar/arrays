import java.util.*;
public class RotateArray{
	public static void main(String[] args){
		int[] arr= {1,2,3,4,5};
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of count rotate..");
		int count = sc.nextInt();
		count = count % arr.length;
		for(int i = 0; i < count; i++){
			for(int j = 0; j < arr.length-1; j++){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}

		}
		System.out.println(Arrays.toString(arr));
	}
}