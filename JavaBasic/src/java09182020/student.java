package java09182020;

import java.util.Scanner;

public class student {
 
	String name;
	int kor;
	int eng;
	int mat;
	
	public void setName(String name) {
		/*
		 * 메소드 이름 : setName
		 * 파라메타 : 입력받은 학생 이름
		 * 리턴타입 : 없음
		 * 동작 : 입력받은 학생 이름을 Student객체의 학생 이름 멤버 변수에 대입
		하시오.
		 * */
		Scanner sc = new Scanner(System.in)
				String name = sc.nextIn();
		
	
		
		
		String Name = name;
		
			
	}
	
	public String getName() {
	
		/*
		 * 메소드 이름 : getName
		 * 파라메타 : 없음
		 * 리턴타입 : 저장된 학생 이름
		 * 동작 : Student객체에 저장된 학생 이름을 반환하시오.
		 * */
		return name;
			
	}
	
	
	public void setKor(int kor) { 
		/*
		 * 메소드 이름 : setKor
		 * 파라메타 : 입력받은 국어 점수
		 * 리턴타입 : 없음
		 * 동작 : 입력받은 국어 점수를 Student객체의 국어 점수 멤버변수에 대입
		하시오.
		 * */
		int kor = kor;
		

	}
		
	public void setEng(int eng) {
		/*
		 * 메소드 이름 : setEng
		 * 파라메타 : 입력받은 영어 점수
		 * 리턴타입 : 없음
		 * 동작 : 입력받은 영어 점수를 Student객체의 영어 점수 멤버변수에 대입
		하시오.
		 * */	
		int eng = eng;
		
		
		
	}

	public void setMat(int mat) {
		/*
		 * 메소드 이름 : setMat
		 * 파라메타 : 입력받은 수학 점수
		 * 리턴타입 : 없음
		 * 동작 : 입력받은 수학 점수를 Student객체의 수학 점수 멤버변수에 대입
		하시오.
		 * */
	int mat = mat;
	
	}
	
	public int getTotal() {
	
	/*
	 * 메소드 이름 : getTotal
	 * 파라메타 : 없음
	 * 리턴타입 : 국어,수학,영어 점수의 합계
	 * 동작 : 입력받은 국어,수학,영어 점수의 합계를 반환하시오.
	 * */
	int sum = kor + mat + eng;
	return sum;
	
	
	
	}
	
	
		public double getAverage() {
	
		/*
		 * 메소드 이름 : getAverage
		 * 파라메타 : 없음
		 * 리턴타입 : 국어,수학,영어 점수의 평균
		 * 동작 : 입력받은 국어,수학,영어 점수의 평균를 반환하시오.
		 * */

			double avg = ((double)kor + mat + eng /3);
			return avg;
			
	}
}