package hello;
/*
 * ����
 */
public class task3 {
   public static void main(String[] args) {
	 int[] scores={45,56,48,15,26,89,55};
	 
	 for(int i=0;i<scores.length;i++){
		
		 for(int j=i;j<scores.length;j++){//�ҳ���(scores.length-i)������С��
			 
			 if(scores[i]>scores[j]){
				
				 int num=scores[i];//����С�����ݺ��������±�Ϊi�����ݽ���
				 scores[i]=scores[j];
				 scores[j]=num;
			 }
			 
		 }
		 
		 System.out.print(scores[i]+"\t");
	 }
}
}
