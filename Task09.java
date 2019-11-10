package by.htp.les07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали. 

public class Task09 {
	public static void main(String[] args) {
		int c = 0;
		System.out.println("Enter n:");
		int n  = enterFromConsole();
	int count = 0;
		int[][] array = new int[n][n];
		mas(array);
		System.out.println("--------------");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++);
				
			//System.out.println();
		}
		for (int i = 0; i < n; i++) {
		
			
			
		System.out.println(array[i][c]);
		c++;
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
