package hello;
/*
 * 排序
 */
public class task3 {
   public static void main(String[] args) {
	 int[] scores={45,56,48,15,26,89,55};
	 
	 for(int i=0;i<scores.length;i++){
		
		 for(int j=i;j<scores.length;j++){//找出后(scores.length-i)个中最小的
			 
			 if(scores[i]>scores[j]){
				
				 int num=scores[i];//将最小的数据和数组中下标为i的数据交换
				 scores[i]=scores[j];
				 scores[j]=num;
			 }
			 
		 }
		 
		 System.out.print(scores[i]+"\t");
	 }
}
}
