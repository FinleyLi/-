
public class ArrayTotal {
	public static void main(String args[]) {
		int arrayX[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int arrayY[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int arrayZ[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;

		System.out.println("�ڬO�}�CY");
		RandomArray(arrayY);
		display(arrayY);
		System.out.println("----------------");

		System.out.println("�ڬO�}�CX");
		RandomArray(arrayX);
		display(arrayX);
		System.out.println("----------------");

		sum = sum(arrayZ, arrayX, arrayY);
		System.out.println("�ڬO�}�CZ=X+Y");
		display(arrayZ);
		System.out.println("----------------");

		System.out.println("�ڬO�`�M:" + sum);

	}

	public static void RandomArray(int[][] arrayc) {
		for (int i = 0; i < arrayc.length; i++) {
			for (int j = 0; j < arrayc[i].length; j++) {
				int r = (int) (30 * java.lang.Math.random());
				arrayc[i][j] = r;
			}

		}
	}

	public static int sum(int[][] arrayZ, int[][] arrayX, int[][] arrayY) {
		int sum = 0;
		for (int i = 0; i < arrayZ.length; i++) {

			for (int j = 0; j < arrayZ[i].length; j++) {
				arrayZ[i][j] = arrayX[i][j] + arrayY[i][j];
				sum += arrayZ[i][j];
			}
		}
		return sum;
	}

	public static void display(int[][] arrayb) {

		for (int k = 0; k < arrayb.length; k++) {
			for (int l = 0; l < arrayb[k].length; l++) {
				int t = arrayb[k][l];
				System.out.print(t + "  ");
			}
			System.out.println();

		}
	}
}