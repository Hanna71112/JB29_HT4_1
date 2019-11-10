package by.htp.les07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task10 {
	public static void main(String[] args) {
		int k, p;
		System.out.println("Enter n:");
		int n  = enterFromConsole();

		int[][] array = new int[n][n];
		mas(array);
		System.out.println("--------------");
		System.out.println("Enter k:");
		 k  = enterFromConsole();
		System.out.println("Enter p:");
		 p  = enterFromConsole();
			for (int j=0; j < array.length; j++) 
			{
						
		System.out.print(array[k-1][j]+ ",");}
							for (int i = 0; i < array.length; i++) {
						System.out.println(array[i][p-1]+ ",");
					}
		
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

	}
	public static int enterFromConsole() {
		int n;
		Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter n:");
		while (!sc.hasNextInt()) {
			System.out.print(">");
			sc.next();
		}
		n = sc.nextInt();
		return n;
	}
}
