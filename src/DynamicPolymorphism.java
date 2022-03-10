
class Bank{
	int getRate() {
		return 0;
	}
}

class Iob extends Bank {
	int getRate() {
		return 5;
	}
}


class SBI extends Bank {
	int getRate() {
		return 10;
	}
}

public class DynamicPolymorphism {
	
     public static void main(String[] args) {
    	 Iob i = new Iob();
    	 SBI s = new SBI();
    	 Bank a = new Iob();
    	 System.out.println("Iob rate of interet:"+i.getRate());
    	 System.out.println("SBI rate of interet:"+s.getRate());
    	 
     }
}

	