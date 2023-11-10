package basic_java_operations;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0 ; i<=5; i++) {
			
			for (int j=1 ;j<=5; j++){
				
				if( j==2 && i==2)
					continue;
				System.out.println(i + " " + j);
			}
		}
	}

}
