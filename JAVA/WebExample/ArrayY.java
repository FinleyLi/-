
public class ArrayY implements ArrayInterface {// implements ArrayInterface

	public int[][] CreateRandomArray(int rowSize, int columSize) {// ���Ͷü�row*colum�x�}
		int[][] randomArray = new int[rowSize][columSize];// ���ͤ@�Ӱ}�C�Ŷ�size�̷Ӥ޼�
		for (int i = 0; i < rowSize; i++) {// �̧ǱN�üƶ�J�x�}
			for (int j = 0; j < columSize; j++) {
				int r = (int) (30 * java.lang.Math.random());// �üƲ��͡A�]���Odouble���A�n�j���ഫ��int
				randomArray[i][j] = r;
			}
		}
		return randomArray;// �^�ǯx�}
	}

	public int sum(int[][] arrayZ) {// �N�x�}��J�^���`�M
		int sum = 0;
		for (int i = 0; i < arrayZ.length; i++) {// �̧ǱNarray���ȥ�Jsum
			for (int j = 0; j < arrayZ[i].length; j++) {
				sum += arrayZ[i][j];
			}
		}
		return sum;
	}

	public void display(int[][] arrayb) { // �L�X�x�}�C�@�Ӥ���
		for (int k = 0; k < arrayb.length; k++) {
			for (int l = 0; l < arrayb[k].length; l++) {
				int t = arrayb[k][l];
				System.out.print(t + "  ");
			}
			System.out.println();

		}
	}

	public int[][] combine(int[][] arrayX, int[][] arrayY) {// �ۥ[��ӯx�}
		int sum = 0;
		int[][] arrayZ = new int[3][3];
		for (int i = 0; i < arrayZ.length; i++) {
			for (int j = 0; j < arrayZ[i].length; j++) {
				arrayZ[i][j] = arrayX[i][j] + arrayY[i][j];
				sum += arrayZ[i][j];
			}
		}
		return arrayZ;// �^�ǯx�}
	}
}