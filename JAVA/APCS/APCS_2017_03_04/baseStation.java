package APCS_2017_03_04;

import java.util.Arrays;
import java.util.Scanner;

public class baseStation {
	
	//public static string getData(int N, int K, int[])
	public static void main(String[] argv) {
		Scanner input = new Scanner(System.in);
		
		// ��JN�ӪA���I
		int N = input.nextInt();
		// ��JK�Ӱ�a�x
		int K = input.nextInt();
		
		// ��JN�ӪA���I�y��Coordinate[]
		int[] Corrdinate = new int[N];
		for (int i = 0; i < N; i++)
			Corrdinate[i] = input.nextInt();
		
		// �ƧǨ��̤j�̤p��Arrays.sort
		Arrays.sort(Corrdinate);
		
		// ��X�̤p���|Diameter
		int Min = Corrdinate[0];
		int Max = Corrdinate[N-1];
		double Diameter = (Max - Min) / K;
		System.out.println((int)Math.ceil(Diameter));// �L����i��
	}

}
