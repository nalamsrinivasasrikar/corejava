package Arrays;

public class TwoDArray {
public static void main(String[] args) {
	int a[][]= {{5,10,15,20}, {25,30,35}, {40,45,50}};
//		System.out.println(" a[0][0]");
//		System.out.println("a[1][1]");
//		System.out.println("a[2][2]");
//		System.out.println("a[3][3]");
		for( int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.println(a[i][j]+"");
			}
			System.out.println("");
		}
	}
}