package hello;
public class Sort {

	public static void main(String[] args) {
		
		
		int[] arr={12,121,123,56,45,1,23,5};

		printArray(arr);
		selectSort_2(arr);
		printArray(arr);

	}
	/*
	 * 冒泡排序
	 * */
	public static void bubbleSort(int[] arr){
		for(int i=arr.length-1;i>0;i--){
//		for(int i=0;i<arr.length-1;i++){
//			for(int j=0;j<arr.length-1-i;j++){
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
			
		}
	}
	/*
	 * 选择排序
	 * */
	public static void selectSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					swap(arr,i,j);
				}
			}
		}
	}
	/*
	 * 选择排序2
	 * 性能高
	 * */
	public static void selectSort_2(int[] arr){
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			int index=i;
			for(int j=i;j<arr.length;j++){
				if(num>arr[j]){
					num=arr[j];
					index=j;
				}
			}
			if(i!=index)
			swap(arr,i,index);
		}
	}
	/*
	 * 数组数据换位
	 * */
	public static void swap(int[] arr,int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	/*
	 * 遍历数组
	 * */
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}else{
				System.out.println(arr[i]);
			}
				
		}
	}

}
