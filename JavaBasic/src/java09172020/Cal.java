
package java09172020;

public class Cal {

	
	//더하기
	public int plus(int num1, int num2) {
		int sum = num1 + num2;
		return sum;

	}
	//빼기
	public int minus(int num1, int num2) {
        int m = num1 - num2 ;
        return m;
        
//        return num1 - num2:
		
				
	}
	
	//곱하기
	public int multiple(int num1, int num2) {
		int m2 = num1 * num2 ;
		return m2;
		
//		return num1 * num2

	}
    //나누기
	public double divide(int num1, int num2) {
		double result;
		
		
		if(num2 == 0) {
			System.out.println("0으로 나눌수 없습니다.");
			result = 0.0;
		}else {		
		
		double d = ((double)num1 /num2);
		return d;
		
		//double temp = ((double) num1) / ((double) num2);
		//return temp;
		//return ((double)num1 /num2);
		
	}

	        return result;
}
}