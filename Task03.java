package by.htp.les07;

import java.util.Arrays;
import java.util.Random;

//Дана матрица. Вывести на экран первый и последний столбцы

public class Task03 {
	public static void main(String[] args) {

		int[][] array = new int[2][5];
		mas(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i][0]);
	}

	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i][(array[i].length - 1)]);
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
