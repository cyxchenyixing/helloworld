package hello;
import java.util.Scanner;
public class task1 {
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("�����뿼�Գɼ���");
	int score=input.nextInt();
	int count=0;
	System.out.println("�ӷ�ǰ�ɼ���"+score);
	while(score<60){
		score++;
		count++;
	}
	System.out.println("�ӷֺ�ɼ���"+score);
	System.out.println("������"+count+"��");
}




}