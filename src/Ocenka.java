import java.util.Scanner;

public class Ocenka {

	public static void main(String[] args) {
	double max=0, bodovi=0, procent=0;
	Scanner tastatura=new Scanner(System.in);
	System.out.print("Vnesete go maksimalniot broj na bodovi na testot");
	max=tastatura.nextDouble();
	System.out.print("Vnesete go brojot na bodovi koi gi dobil studentot");
	bodovi=tastatura.nextDouble();
	procent=bodovi/max*100;
	if(bodovi>max) {
		System.out.print("Studentot gi nadminal standardite, no za zal tolku poeni ne moze da dobie");
		System.exit(0);
	}
	procent=bodovi/max*100;
	if(procent<51) {
		System.out.print("Studentot padnal");
	}
	else if(procent<=60 && procent >=51) {
		System.out.print("Studentot dobil 6");
	}
	else if(procent<=70 && procent>=61 ) {
		System.out.print("Studentot dobil 7");
	}
	else if(procent<=80 && procent>=71) {
		System.out.print("Studentot dobil 8");
	}
	else if(procent<=90 && procent>=81) {
		System.out.print("Studentot dobil 9");
	}
	else if(procent<=100 && procent>=91) {
		System.out.print("Studentot dobil 10");
	}
	
}
			
}

