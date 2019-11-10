package by.htp.les07;

import java.util.Arrays;
import java.util.Random;

//Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов. 

public class Task07 {
	public static void main(String[] args) {
int sum = 0;
		int[][] array = new int[5][5];
		mas(array);
		System.out.println("--------------");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				if (array[i][j] % 2 != 0 && array[i][j] < 0) {
					System.out.print(array[i][j] + ",");
					sum +=Math.abs(array[i][j]);
				}
			System.out.println();

		}
		System.out.println("sum = " + sum);
	}
	
	public static void mas(int[][] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = (int) ((Math.random() * 11) - 5);
				System.out.print(array[i][j] + ",");
			}
			System.out.println();

		}

	}
}
