
public class ArrayTest {
	public static void main(String args[]) {
		int arrayX[][] = new int[3][3];
		int arrayY[][] = new int[3][3];
		int arrayZ[][] = new int[3][3];

		System.out.println("�ڬO�}�CX");
		ArrayInterface x = new ArrayX();
		arrayX = x.CreateRandomArray(3, 3);
		x.display(arrayX);
		System.out.println("----------------");

		System.out.println("�ڬO�}�CY");
		ArrayInterface y = new ArrayY();
		arrayY = y.CreateRandomArray(3, 3);
		y.display(arrayY);
		System.out.println("----------------");

		System.out.println("�ڬO�}�CZ");
		ArrayInterface z = new ArrayZ();
		arrayZ = z.combine(arrayX, arrayY);
		z.display(arrayZ);

		System.out.println("----------------");
		int sum = z.sum(arrayZ);
		System.out.println("�ڬO�`�M" + sum);
	}
}
