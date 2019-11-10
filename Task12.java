package by.htp.les07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Получить квадратную матрицу порядка n: 

class Task12 {
	public static void main(String[] args) {
	
		int a=0;
		int b=0;
	
		System.out.println("Enter n:");
		int n = enterFromConsole();
		int[][] array = new int[n][n];
		mas(array);
		for (int c= 0; c<array.length; c++) {
array[a][b] =c;
a= a+1;
b=b+1;
		}
for (int i = 0; i < array.length; i++) {
	for (int j = 0; j < array[i].length; j++) {

		System.out.print(array[i][j] + ",");
			}
	System.out.println();}}


	public static void mas(int[][] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = 0;
				// array[i][j] = (int) ((Math.random() * 10));
				System.out.print(array[i][j] + ",");
			}
			System.out.println();

		}
		System.out.println("--------------");
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
