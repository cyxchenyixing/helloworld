package hello;
import java.util.Arrays;
import java.util.Scanner;
public class task5 {
	  public static void main(String[] args) {
		  Scanner input=new Scanner(System.in);
		  System.out.print("���������鳤�ȣ�");
		  int length=input.nextInt();
			// �������󣬶�����Ϊhello
		  task5 hello = new task5();
		  int[] nums=hello.getArray(length);
		  System.out.println(Arrays.toString(nums));
		}

		/*
		 * ���ܣ��������ſγ̿��Գɼ���ƽ���ֲ����ƽ����
		 * ����һ���������������ķ����������������ſγ̵ĳɼ�
		 */


	  public int[] getArray(int length) {
	        // ����ָ�����ȵ���������
			int[] nums = new int[length];
	        
	        // ѭ���������鸳ֵ
			for (int i=0;i<nums.length;i++) {
	            
				// ����һ��100���ڵ������������ֵ�������ÿ����Ա
			nums[i]=(int)(Math.random() * 100);
	        
			}
			return nums; // ���ظ�ֵ�������
		}
}


