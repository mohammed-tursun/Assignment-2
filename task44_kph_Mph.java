package day10_controlfollowstatement;

public class task44_kph_Mph {

	public static void main(String[] args) {
		System.out.println("Kph             Mph");

		for(int kph=60;kph<=130;kph+=10) {
			System.out.println(kph+   "\t\t"+(kph*0.6214));
		}
		
		System.out.println("copy of ozzy code");
		System.out.println("----------------------------------------");
		
		final int STARTING_KPH=60;
		final int MAX_KPH=130;
		final int INCREMENT=10;
		
		int kph ;
		double mph ;
		
		System.out.println("KPH\t\tMPH");
		System.out.println("----------------------");
		
		for (kph=STARTING_KPH;kph<=MAX_KPH;kph+=INCREMENT) {
			mph=kph*0.6214;
			
			System.out.println(kph+ "\t\t "+mph);
		}
		
		
			
	}

}
