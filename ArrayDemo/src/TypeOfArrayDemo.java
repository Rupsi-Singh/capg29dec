
public class TypeOfArrayDemo {

	public static void main(String[] args) {
		int arr[][]=new int[2][3];
		System.out.println("arr -->"+arr);
		System.out.println("lenth of arr : "+arr.length);
		
		System.out.println("arr[0] -->"+arr[0]);
		System.out.println("lenth of arr[0] : "+arr[0].length);
		
		System.out.println("arr[1] -->"+arr[1]);
		System.out.println("lenth of arr[1] : "+arr[1].length);
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 100;
		arr[1][1] = 200;
		arr[1][2] = 300;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
				

	}

}
