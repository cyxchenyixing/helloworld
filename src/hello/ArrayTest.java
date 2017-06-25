package hello;

public class ArrayTest {

	public static void main(String[] args) {
		toHex(60);
		toBinary(60);
		toOctal(60);
	}
	//八进制
	public static void toOctal(int num){
		trans(num,7,3);
	}
	//二进制
	public static void toBinary(int num){
		trans(num,1,1);
	}
	
	//十六进制
	public static void toHex(int num){
		trans(num,15,4);
//		if(num==0){
//			System.out.println("0");
//			return;
//		}
//		char[] chs={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
//		char[] arr=new char[8];
//		int pos=arr.length;
//		while(num!=0){
//			int temp=num&15;
//			arr[--pos]=chs[temp];
//			num=num>>>4;
//			
//		}
//		System.out.println("pos="+pos);
//		for(int i=pos;i<arr.length;i++){
//			System.out.print(arr[i]);
//		}
	}
	
	public static void trans(int num,int base,int offset){
		if(num==0){
			System.out.println("0");
			return;
		}
		char[] chs={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr=new char[32];
		int pos=arr.length;
		while(num!=0){
			int temp=num&base;
			arr[--pos]=chs[temp];
			num=num>>>offset;
			
		}
		for(int i=pos;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
