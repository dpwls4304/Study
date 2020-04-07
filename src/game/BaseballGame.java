package game;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
	
	//야구게임을 메소드를 이용하여 구현한다.
	public static void baseball() {
		Scanner scan = new Scanner(System.in);
		Random ranN = new Random();
		int[] arr = new int[3];
		
		//1. 중복되지 않는 3개의 정수를 생성한다.(1~9)
		System.out.print("컴퓨터 : ");
		for(int i=0; i<arr.length; i++) {
			int rN = ranN.nextInt(8)+1;
			arr[i] = rN;
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		
		//2. 사용자는 3개의 숫자를 입력한다.
		System.out.println("[숫자를 입력하세요]");
		System.out.print("1st>>");
		int fst = scan.nextInt();
		System.out.print("2nd>>");
		int snd = scan.nextInt();
		System.out.print("3rd>>");
		int trd = scan.nextInt();
		
		//3.생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.
	}
	
	public static void main(String[] args) {
		baseball();
	}

}
