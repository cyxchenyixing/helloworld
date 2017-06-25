package hello;

public class ForFor99 {

	public static void main(String[] args) {
//		for(int i=1;i<=9;i++){
//			for(int j=1;j<=i;j++){
//			System.out.print(j+"*"+i+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
        int[] arr=new int[3];
        int[] x=new int[3];
        arr[0]=1;
        x[0]=23;
        arr=x;
        System.out.println(arr[0]);
        arr[0]=2;
        System.out.println(x[0]);
	}

}
