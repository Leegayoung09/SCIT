package java09172020;

import java.util.Scanner;

public class caltest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//클래스를 이용해서 인스턴스 생성
		Cal calculator = new Cal();
		
		System.out.print("num1 입력: ");
		int num1 = sc.nextInt();
		
		System.out.print("num2 입력: ");
		int num2 = sc.nextInt();
		
		// 생성된 인스턴스의 메서드를 호출
		int sum = calculator.plus(num1,1200);
		System.out.println("Plus 메서드 실행 결과:  " + sum);

//		int m = calculator. minus(num1,num2);
//		System.out.println("minus 메서드 실행 결과 : " + m);
		
		System.out.println("minus 메서드 실행 결과:  " 
                            + calculator. minus(num1,num2));
	}

}
