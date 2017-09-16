
public class DoubleArray {
	static int arr [];
	DoubleArray(int arr[]){
		this.arr = arr;
	}
	public static void NewArr() {
		int len = 2 * arr.length;
		int s = 0;
		int j = 0;
		int[] newarr = new int[len];
		for(int i = 0; i < newarr.length; i++) {
			
			
			if (s%2 == 0 && i != 1 && s != 0) {
				j ++;
			}
			if(i == 0) {
				newarr[i] = arr[i];
			}
			else {
				System.out.println(arr[j]);

				newarr[i] = arr[j];
			}
			s++;
			
		}
		for(int i = 0;i<newarr.length;i++) {
			 System.out.print(newarr[i]);
		};
	}
}
