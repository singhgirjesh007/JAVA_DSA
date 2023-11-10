package basic_doubts;

public class JavaBreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inner loop break
		for (int i = 0; i <= 3; i++) {

			for (int j = 12; j <= 14; j++) {

				if (j == 13 & i == 2) {
					break;
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("break outer loop with condition ");
		int temp = 0 ;
		//Outer loop break
		for (int i = 0; i <= 3; i++) {

			for (int j = 12; j <= 14; j++) {

				temp=j;
			}
			
			if (temp == 14 & i == 2) {
				break;
			}
			System.out.println(i + " " + temp);
		}
		
		System.out.println("break outer loop with labeling ");
		aa :
		for (int i = 0; i <= 3; i++) {
			bb:
			for (int j = 12; j <= 14; j++) {

				if (j == 13 & i == 2) {
					break aa;
				}
				System.out.println(i + " " + j);
			}
		}

	}

}
