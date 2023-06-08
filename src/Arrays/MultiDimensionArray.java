package Arrays;

public class MultiDimensionArray {

	public static void main(String[] args) {
		
		int[][] a = new int[][] {{5,6},{7,8}};  //int a[][]
		
//		a[0][0] = 5;
//		a[0][1] = 6;
//		
//		a[1][0] = 7;
//		a[1][1] = 8;
		
		// System.out.println(a[1][1]);
				
		for (int i=0;i<a.length;i++)            // Row
		{
			for (int j=0;j<a[i].length;j++)     // Coloumn
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
