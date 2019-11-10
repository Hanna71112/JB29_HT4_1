package by.htp.les07;

import java.util.Arrays;

//Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и вывести на экран. 

public class Task01 {
	public static void main(String[] args) {

		int[][] array = new int[3][4];
		array[0][0] = 1;
		array[1][1] = 1;
		array[2][2] = 1;
	
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+ "," );
			}
			System.out.println();
		}}
}
