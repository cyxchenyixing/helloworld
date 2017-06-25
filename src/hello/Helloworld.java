package hello;

public class Helloworld {
  public static void main(String[] args){
		char today='日';
		switch(today){
			case '一':
			case '二':
			case '三':
				System.out.println("吃包子");
				break;
			case '四':
			case '五':
			case '六':
				System.out.println("吃油条");
				break;
			case '日':
				System.out.println("吃套餐");
				break;
			default:
				System.out.println("吃");
				
		}
  } 
}
