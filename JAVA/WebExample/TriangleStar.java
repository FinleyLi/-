
public class TriangleStar {

	public static void main(String args[]) {
		System.out.println("�еe�T����!");
		int count = 9; // �]�wcolum����(����)
		drawTriangle(count); // �I�s�e�Ϥ�k
		System.out.println("�e���٤���!");
	}

	public static void drawTriangle(int count) {
		int i, j, k; // �ŧiint�ܼ�

		for (i = 1; i <= count; i++) {// for�j��colum(����)�`�@��count��colum
			for (k = 1; k <= (count - i) / 2; k++) {// �C�L����ť�,(count-i)/2�O�b�C�@��row���`�@�|�C�Lcount��(���תťթ�*��)�*�Ӽƫ�,�O�����Ů檺�ƶq,���G�O��*�e�����ƶq
				System.out.print(" ");
			}

			if (i % 2 != 0) {// ���L�_�ƦC
				for (j = 1; j <= i; j++) {// �C�L*�����T����
					System.out.print("*");
				}
				System.out.println();
			} else {
				System.out.println();
			} // ���ƦC����
		}

	}

}
