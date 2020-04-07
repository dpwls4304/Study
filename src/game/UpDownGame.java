package game;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	
	static Scanner scan;
	static int count=1;
	static boolean wOrF=false; //win or fail;
	static int i=1;
	
	//업다운 게임을 메소드를 이용해 구현한다.
	public static void upDown() {
		scan = new Scanner(System.in);
		
		System.out.println("[업다운게임을 시작합니다.]");
		System.out.println("[1~100사이의 숫자를 제시하세요]");
		
		while(true) {
			//1.컴퓨터는 1~100사이의 숫자 하나를 생성한다.
			Random ranN = new Random();
			int rN = ranN.nextInt(99)+1;
			System.out.println("\n컴퓨터가 낸 숫자:" + rN);
			
			//2.총 시도횟수는 7번을 부여한다.
			while(true) {
				System.out.println("[" + i + "번째 시도]");
				i++;
				
				System.out.print("USER>>");
				int user = scan.nextInt();
				
				if(user > rN) {
					System.out.println("[컴퓨터가 제시한 숫자보다 높습니다.]" + "\n");
					count++;
				}
				else if(user < rN) {
					System.out.println("[컴퓨터가 제시한 숫자보다 낮습니다.]" + "\n");
					count++;
				}
				else {
					System.out.println("[정답입니다.]");
					System.out.println("[성공]");
					count=7;
					wOrF=true;
				}
				
				if(count==7) {
					if(wOrF==false) {
						System.out.println();
						System.out.println("[실패]");
						System.out.println("[7번의 기회를 모두 소비하였습니다.]");
					}
					System.out.println("[게임을 계속 하시겠습니까?]");
					System.out.print("[1]예, [0]아니오>>");
					int yOrN = scan.nextInt();
					
					if(yOrN == 1) {
						System.out.println("[게임을 계속합니다.]");
						count=1;
						break;
					}
					else {
						System.out.println("[게임을 종료합니다.]");
						return;
					}
				}
			}//end of inside while
		}//end of outside while
	}//end of method
	
	public static void main(String[] args) {
		upDown();
	}

}//end of class
