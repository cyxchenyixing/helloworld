package hello;

public class GetIndex {

	public static void main(String[] args) {
		int[] arr={2,12,15,23,354};
		int index=halfSearch_2(arr,23);
		System.out.println(index);
	}
	/*
	 * 二分查找法，折半查找法
	 * */
	public static int halfSearch(int[] arr,int key){
		int max=arr.length-1;
		int min=0;
		int mid=(max+min)/2;
		
		while(arr[mid]!=key){
			if(key>arr[mid])
				min=mid+1;
			else if(key<mid)
				max=mid-1;
			
			if(max<min)
				return -1;
			
			mid=(max+min)/2;
		}
		return mid;
	}
	/*
	 * 二分查找法，折半查找法
	 * */
	public static int halfSearch_2(int[] arr,int key){
		int max=arr.length-1;
		int min=0;
		
		while(max>=min){
			int mid=(max+min)>>1;
			if(key>arr[mid])
				min=mid+1;
			else if(key<mid)
				max=mid-1;
			else
			return mid;
			
		}
		return -1;
	}
	/*
	 * 数组查找
	 * */
	public static int getIndex(int[] arr,int num){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num)
				return i;
		}
		return -1;
	}

}
