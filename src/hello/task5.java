package hello;
import java.util.Arrays;
import java.util.Scanner;
public class task5 {
	  public static void main(String[] args) {
		  Scanner input=new Scanner(System.in);
		  System.out.print("请输入数组长度：");
		  int length=input.nextInt();
			// 创建对象，对象名为hello
		  task5 hello = new task5();
		  int[] nums=hello.getArray(length);
		  System.out.println(Arrays.toString(nums));
		}

		/*
		 * 功能：计算两门课程考试成绩的平均分并输出平均分
		 * 定义一个包含两个参数的方法，用来传入两门课程的成绩
		 */


	  public int[] getArray(int length) {
	        // 定义指定长度的整型数组
			int[] nums = new int[length];
	        
	        // 循环遍历数组赋值
			for (int i=0;i<nums.length;i++) {
	            
				// 产生一个100以内的随机数，并赋值给数组的每个成员
			nums[i]=(int)(Math.random() * 100);
	        
			}
			return nums; // 返回赋值后的数组
		}
}


