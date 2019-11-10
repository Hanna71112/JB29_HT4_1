package by.htp.les07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия: 
//а) вычислить сумму отрицательных элементов в каждой строке;  
//б) определить максимальный элемент в каждой строке; 
//в) переставить местами максимальный и минимальный элементы матрицы.

class Task26 {
	public static void main(String[] args) {

		System.out.println("Enter n:");
		int n = enterFromConsole();
		System.out.println("Enter m:");
		int m = enterFromConsole();
		int[][] array = new int[n][m];
		mas(array);
		SumOtricElement(array);
		maxElement(array);
		replaseElements(array);
	}

	public static void SumOtricElement(int[][] array) {
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)

				if (array[i][j] < 0) {
					sum = sum + array[i][j];
					sum1 = sum;
				}
			sum = 0;
			System.out.println("sum = " + sum1);

		}

	}

	public static void maxElement(int[][] array) {
		int max = -10;
		int max1 = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)

				if (max < array[i][j]) {
					max = array[i][j];
					max1 = max;
				}
			max = -10;
			System.out.println("max = " + max1);

		}

	}

	public static void replaseElements(int[][] array) {
		int max = -10;
		int min = 10;
		int max1 = 0;
	int	maxi = 0;
	int	maxj =0;
	int	minj =0;
		int mini =0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				if (max < array[i][j]) {
					max = array[i][j];
					maxi = i;
					maxj = j;
					
				}
				if (min > array[i][j]) {
					min = array[i][j];
					mini =i;
					minj =j;
				}

			}

		}

		System.out.println("maxEl = " + max);
		System.out.println("minEl = " + min);
		max1 = array[mini][minj]; 
		array[mini][minj] = array[maxi][maxj];
		array[maxi][maxj] = max1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				System.out.print(array[i][j] + ",");
			}
			System.out.println();

		}
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