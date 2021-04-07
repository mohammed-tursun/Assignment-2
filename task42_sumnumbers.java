package day10_controlfollowstatement;

public class task42_sumnumbers {

	public static void main(String[] args) {
		

		
		
		int sumeven=0;
		int sumodd=0;
		
		for (int i=1;i<100;i++) {
			if (i%2==0) {
				sumeven=sumeven+i;
				
			}else {
				sumodd=sumodd+i;
		
		}
		
		}
		
		System.out.println("sum of even number "+ sumeven);
		System.out.println("sum of odd numbers "+ sumodd);
		System.out.println("total number of even and odd "+ (sumeven+sumodd));
	}

}
