package by.htp.les07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

class Task20 {
	public static void main(String[] args) {

		System.out.println("Enter n:");
		int n = enterFromConsole();
		int[][] array = new int[n][n];
		mas(array);
	}

	public static void mas(int[][] array) {
		
		for (int a = 0; a < array.length; a++) {
			int c = 1;
			array[a][0] = 1;
						}

			
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= array[i].length - 1; j++) {

				System.out.print(array[i][j] + ",");
			}
			System.out.println();
		}
	}

	public static int enterFromConsole() {
		int n;
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.print(">");
			sc.next();
		}
		n = sc.nextInt();
		return n;
	}
}