package myjava;

public class Demo3_24 {

	public static void main(String[] args) {
		int size = (int)(Math.random() * 13 );
		int color = (int)(Math.random() * 4 );
		switch(color) {
		case 0 :System.out.print("你的牌是红方块");break;
		case 1 :System.out.print("你的牌是黑梅花");break;
		case 2 :System.out.print("你的牌是红桃心");break;
		case 3 :System.out.print("你的牌是黑桃");break;
		}
		switch(size) {
		case  0 :System.out.println("Ace");break;
		case  1 :System.out.println("2");break;
		case  2 :System.out.println("3");break;
		case  3 :System.out.println("4");break;
		case  4 :System.out.println("5");break;
		case  5 :System.out.println("6");break;
		case  6 :System.out.println("7");break;
		case  7 :System.out.println("8");break;
		case  8 :System.out.println("9");break;
		case  9 :System.out.println("10");break;
		case 10:System.out.println("J");break;
		case 12:System.out.println("Q");break;
		case 13:System.out.println("K");break;		
		}

	}

}
