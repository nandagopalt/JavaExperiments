
public class Pattern2 {
	public static void main(String args[]) {
		int rowCount = 5;
		int columnsCount  = 5;
		for(int row = 1; row<=rowCount; row++) {
			for(int column = (rowCount - row)+ 1; column >= 1; column--) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}

}
