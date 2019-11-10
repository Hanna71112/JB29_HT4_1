package by.htp.les07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

class Task14 {
	public static void main(String[] args) {

		System.out.println("Enter n:");
		int n = enterFromConsole();
		int[][] array = new int[n][n];
		mas(array);
	}

	public static void mas(int[][] array) {
		int a = 0;
		int b = 0;

		for (int c = 1; c < array.length + 1; c++) {
			array[a][b] = c;
			a = a + 1;
			b = b + 1;
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = array[i].length - 1; j >= 0; j--) {

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