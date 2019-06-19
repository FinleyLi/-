
interface ArrayInterface {// 宣告介面

	public int[][] CreateRandomArray(int rowSize, int columSize);// 定規格，用來產生亂數矩陣，回傳3*3矩陣

	public int sum(int[][] arrayZ);// 定規格把矩陣Z丟入作相加回傳int sum

	public void display(int[][] arrayb);// 定規格，將矩陣細節印出確認對錯

	public int[][] combine(int[][] arrayX, int[][] arrayY); // 定規格，矩陣X和矩陣Y相加放入矩陣Z
}