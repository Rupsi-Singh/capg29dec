
public class JaggedArrayDemo {

	public static void main(String[] args) {
		int arr[][]=new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[5];
		System.out.println("arr -->"+arr);
		System.out.println("length of arr -->"+arr.length);
		
		System.out.println("arr[0] -->"+arr[0]);
		System.out.println("length of arr[0] -->"+arr[0].length);
		
		System.out.println("arr[1] -->"+arr[1]);
		System.out.println("length of arr[1] -->"+arr[1].length);
		
		arr[0][0]= 10;
		arr[0][1]= 20;
		arr[0][2]= 30;
		
		arr[1][0]= 100;
		arr[1][1]= 200;
		arr[1][2]= 300;
		arr[1][3]= 400;
		arr[1][4]= 500;
		
		System.out.println("---------Before Changes-----------");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int temp[]= {50,60,70,80,90};
		System.out.println("arr[0] hashcode -->"+arr[0].hashCode());
		System.out.println("temp hashcode -->"+temp.hashCode());
		arr[0]=temp;
		System.out.println("---------After  Changes-----------");
		
		System.out.println("arr[0] hashcode -->"+arr[0].hashCode());
		System.out.println("temp hashcode -->"+arr[0].hashCode());
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
