package by.htp.les07;

import java.util.Arrays;

//Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9]. 

public class Task02 {
	public static void main(String[] args) {

		int[][] array = new int[2][3];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j]=(int)(Math.random()*10);
				System.out.print(array[i][j]+ "," );
			}
			System.out.println();
		}}
}
