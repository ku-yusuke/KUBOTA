package jp.co.scsk.kyushu.arraySample;

public class ArraySample6 {

	public static void main(String[] args) {
		int array[][] = {{11, 12, 13}, {21, 22, 23}};
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(array[i][j]);
			}
		}
	}

}
