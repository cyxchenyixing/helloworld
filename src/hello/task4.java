package hello;
import java.util.Arrays;
public class task4 {
   public static void main(String[] args) {
     int[] scores={12,15,48,56,18,16};
     System.out.println(Arrays.toString(scores));//Arrays.toString�ǽ�����ת����string����
     Arrays.sort(scores);//Arrays.sort�ǽ������С��������
     for(int i=0;i<scores.length;i++){
    	System.out.println(scores[i]); 
     }
     
}
}
