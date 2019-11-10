package by.htp.les07;

import java.util.Arrays;
import java.util.Random;

// Дана матрица. Вывести на экран первую и последнюю строки. 

public class Task04 {
	public static void main(String[] args) {

		int[][] array = new int[3][5];
		mas(array);
		
			for (int j = 0; j < array[0].length; j++) {

				System.out.print(array[0][j]+ "," );
			}
			System.out.println();
			
			for (int j = 0; j < array[0].length; j++) {

				System.out.print(array[(array.length - 1)][j]+ "," );
			}
			System.out.println();
			
				
			
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
