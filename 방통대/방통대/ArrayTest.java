package 방통대;

public class ArrayTest {

	public static void main(String[] args) {
		int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		int sum = 0;
		for (int number/*넣어주면 정답*/:numbers) 
			sum+=number;
		double average;
		int alen = numbers.length;
		average = (double)sum / alen;
		System.out.println("합 = " +sum);
		System.out.println("평균 = " + average);
	
	}

}
