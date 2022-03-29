package NoobQ;

public class Divisible {
	int i,j,k;
	
	void check() {
		for(i=1;i<100;i++) {
			if(i%3==0 && i%5==0) System.out.print(" "+i);
		 for(j=1;j<100;j++) {
				if(j%3==0) System.out.print(" "+j);	
			}
		  for(k=1;k<100;k++) {
				if(k%5==0) System.out.print(" "+k);
			}
		}
	}
	
	public static void main(String[] args) {
		Divisible d=new Divisible();
		d.check();

	}

}
