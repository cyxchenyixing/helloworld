package hello;
import java.util.Arrays;
public class task6 {
	  
    //��� main ����
    public static void main(String[] args) {
    int[] scores= {89 , -23 , 64 , 91 , 119 , 52 , 73};
    task6 hello=new task6();
    hello.sort(scores);
   
    }
    
    //���巽����ɳɼ��������ǰ�����Ĺ���
    public void sort(int[] scores){	
    Arrays.sort(scores);
    int count=0;
    for(int i=scores.length-1;i>=0;i--){
    if(scores[i]>=0&&scores[i]<=100){   	
    		count++;
    	if(count>3){
    		break;
    	}
    	System.out.println(scores[i]); 
    	}else{
    	continue;
    }
    	
    }
    }
}
