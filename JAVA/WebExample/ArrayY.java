
public class ArrayY implements ArrayInterface {// implements ArrayInterface

	public int[][] CreateRandomArray(int rowSize, int columSize) {// 產生亂數row*colum矩陣
		int[][] randomArray = new int[rowSize][columSize];// 產生一個陣列空間size依照引數
		for (int i = 0; i < rowSize; i++) {// 依序將亂數填入矩陣
			for (int j = 0; j < columSize; j++) {
				int r = (int) (30 * java.lang.Math.random());// 亂數產生，因為是double型態要強制轉換至int
				randomArray[i][j] = r;
			}
		}
		return randomArray;// 回傳矩陣
	}

	public int sum(int[][] arrayZ) {// 將矩陣丟入回傳總和
		int sum = 0;
		for (int i = 0; i < arrayZ.length; i++) {// 依序將array的值丟入sum
			for (int j = 0; j < arrayZ[i].length; j++) {
				sum += arrayZ[i][j];
			}
		}
		return sum;
	}

	public void display(int[][] arrayb) { // 印出矩陣每一個元素
		for (int k = 0; k < arrayb.length; k++) {
			for (int l = 0; l < arrayb[k].length; l++) {
				int t = arrayb[k][l];
				System.out.print(t + "  ");
			}
			System.out.println();

		}
	}

	public int[][] combine(int[][] arrayX, int[][] arrayY) {// 相加兩個矩陣
		int sum = 0;
		int[][] arrayZ = new int[3][3];
		for (int i = 0; i < arrayZ.length; i++) {
			for (int j = 0; j < arrayZ[i].length; j++) {
				arrayZ[i][j] = arrayX[i][j] + arrayY[i][j];
				sum += arrayZ[i][j];
			}
		}
		return arrayZ;// 回傳矩陣
	}
}