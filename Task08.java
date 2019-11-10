package by.htp.les07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива

public class Task08 {
	public static void main(String[] args) {
		System.out.println("Enter n:");
		int n  = enterFromConsole();
		System.out.println("Enter m:");
		int m  = enterFromConsole();
		
int count = 0;
		int[][] array = new int[n][m];
		mas(array);
		System.out.println("--------------");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				if (array[i][j] == 7) {
				count= count+1;
				}
			System.out.println();

		}
		System.out.println("count = " + count);
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
