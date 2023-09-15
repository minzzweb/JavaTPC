public class TPC04 {

	public static void main(String[] args) {
		//4. 데이터를 이동하라 (변수vs배열)
		
		int a,b,c,a2,b2,c2;
		a = 10;
		b = 20;
		c = 30;
		a2 = 30;
		b2 = 40;
		c2 = 50;
		
		//a + b + c =? 
		hap(a,b,c,a2,b2,c2);
		
		
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		
		hap2(arr);
		
		
	}
	
	public static void hap(int a, int b,int c,int a2, int b2,int c2) {
		int sum = a+b+c+a2+b2+c2;
		System.out.println(sum);
	}
	
	
	//배열로 쉽게 만들기 
	public static void hap2(int[] arr) {
		
		int sum = 0;
		for(int a : arr) {
		
			sum += a; 
		}
		
		System.out.println(sum);
	}
	
	
	
}
