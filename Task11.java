package by.htp.les07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево,
//вторая строка слева направо, третья строка справа налево и так далее.
class Task11 {
	public static void main(String[] args) {

		System.out.println("Enter m:");
		int m = enterFromConsole();
		System.out.println("Enter n:");
		int n = enterFromConsole();
		int[][] array = new int[m][n];
		mas(array);

		reverse(array);
	}

	public static void mas(int[][] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = (int) ((Math.random() * 10));
				System.out.print(array[i][j] + ",");
			}
			System.out.println();

		}
		System.out.println("--------------");
	}

	public static void reverse(int[][] array) {
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = array[i].length - 1; j >= 0; j--) {
					System.out.print(array[i][j] + " ");
				}
			} else {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + " ");
				}
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
