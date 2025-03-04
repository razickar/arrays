import java.util.*;

public class JaggedArray {
    public static int[][] weights; 
     

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        weights = new int[n][];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of weights for person " + (i + 1) + ": ");
            int size = sc.nextInt();
            weights[i] = new int[size]; 

            System.out.println("Enter weights for person " + (i + 1) + ": ");
            for (int j = 0; j < size; j++) {
                weights[i][j] = sc.nextInt();
            }
        }

        while (true) {
            System.out.println("\n1. Add weight for a person");
            System.out.println("2. Find minimum weight of a person");
            System.out.println("\n choose a number");
            int sec = sc.nextInt();
            
            
            switch(sec){
		case 1:
		System.out.print("\n which person do you want change weight....____");
		int person = sc.nextInt();
		System.out.println("enter weight.....");
		int addweight = sc.nextInt();
		JaggedArray.AddWeight(person-1,addweight);break;
		
		case 2:
		System.out.print("\n which person minumum weight you want....____");
		int personminimum = sc.nextInt();
		int min = weights[personminimum-1][0];
		for(int i = 1; i < weights[personminimum-1].length; i++){
			
		if(weights[personminimum-1][i] < min ){
			min = weights[personminimum-1][i];
		} 
		
		System.out.println(min);
		
		}
		
	    }
            
            
            
            
            
            
	}
	
	
	
	
	
     }
    public static void AddWeight(int per,int we){
		
		int[] arr = Arrays.copyOf(weights[per],weights[per].length + 1);
		
		arr[arr.length - 1] = we;
		
		weights[per] = arr;
		
		
	
	}
	
     
     
     
     
     
     
}     	
