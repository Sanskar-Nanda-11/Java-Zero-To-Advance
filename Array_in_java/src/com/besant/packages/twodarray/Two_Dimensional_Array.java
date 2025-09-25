package com.besant.packages.twodarray;

//import java.lang.reflect.Array;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] array1 = {
				{ 1 , 2 , 3 },
				{ 5 , 9 ,6 }
		};
		
		
		
		System.out.println(array1[1][0]);
		for(int i = 0; i<2; i++){
////			int i;
			for(int j = 0; j < array1[i].length; j++){
				System.out.print(array1[i][j] + " ");
//				
			}
			System.out.println();
		}
	}

}
