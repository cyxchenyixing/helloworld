package hello;

public class task2 {
  public static void main(String[] args) {
	int[] nums=new int[]{61,23,4,74,13,148,20};
	int max=nums[0];
	int min=nums[0];
	double sum=0;
	double avg=0;
	
	for(int i=0;i<nums.length;i++){
	if(nums[i]>max){
		max=nums[i];
	}
	if(nums[i]<min){
		min=nums[i];
	}
	sum=sum+nums[i];
	
	}
	avg=sum/nums.length;
	System.out.println("�����е����ֵ��"+max);
	System.out.println("�����е���Сֵ��"+min);
	System.out.println("�����ƽ��ֵ��"+avg);
}
}
