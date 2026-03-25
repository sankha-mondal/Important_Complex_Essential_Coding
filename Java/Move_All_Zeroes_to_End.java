package codes;

public class Move_All_Zeroes_to_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr = {2, 0, 8, 0, 1, 4, 0};
		int[] arr = {0, 0, 0};
		
		int[] arrc = new int[arr.length];
		int j = 0;
		int k = arr.length - 1;
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i] != 0) {
				arrc[j++] = arr[i];
			}
			else {
				arrc[k--] = 0;
			}
		}
		
		for (int i=0;i<arrc.length;i++) {
			System.out.print(arrc[i] + " ");
		}
		
	}
}
