import java.util.Scanner; //import Scanner �i��

public class TriangleStar2 {
	public static void main(String args[]) {

		try {
			System.out.println("�Q�e�X��T���ΡH");
			Scanner sc = new Scanner(System.in);// new�@��scanner����
			int count = 2 * (Integer.parseInt(sc.nextLine()));// �N��J���Ʀr�নint�Φ��A*2�O�]�����ƦC�|�R���A�ڷQ���X��J�h�ִN�X�{�X��
			drawTriangle(count); // �I�s�e�Ϥ�k
			System.out.println("�e���٤���!");
		} catch (NumberFormatException e) {
			System.out.print("�j���S��");
		}
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
			} // ���Ʀ}C����
		}

	}
}
