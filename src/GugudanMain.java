import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
//		for (int i = 2; i < 10; i++) {
//			int [] result = Gugudan3.caculate(i);
//			Gugudan3.print(result);
//		}
		System.out.println("두가지 숫자를 입력하세요 (예 : 1,2) ");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for (int i=2; i < first+1; i++) {
			for(int j=1; j < second+1; j++) {
				System.out.println(i*j);
			}
		}
		
		
	}
}
