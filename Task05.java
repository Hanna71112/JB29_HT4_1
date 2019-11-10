package by.htp.les07;

import java.util.Arrays;
import java.util.Random;

//Дана матрица. Вывести на экран все четные строки, то есть с четными номерами. 

public class Task05 {
	public static void main(String[] args) {

		int[][] array = new int[4][5];
		mas(array);
		System.out.println("--------------");
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) 
				if (i%2==0) {
				System.out.print(array[i][j]+ "," );
			}
			System.out.println();
		
		}
		
		
			}
		
		public static void mas (int[][] array) {

			Random rand = new Random();

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {

					array[i][j] = rand.nextInt(10);
					System.out.print(array[i][j]+ "," );
				}
				System.out.println();
			
			}

		
	
	}
}
