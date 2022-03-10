
public class CodilityTestWipro {
	//https://stackoverflow.com/questions/17518221/what-is-the-radix-parameter-in-java-and-how-does-it-work
	
	public static int solution(long a, long b) {
		if(a > 0 && b > 0) {
			long x= a*b;
			System.out.println("vlaue of x=" +x);
			String n = Long.toBinaryString(x);
			System.out.println("binary value:" + n);
			Integer sInt = Integer.valueOf(n);
			System.out.println("ssss" + sInt);
			try {
				
			int binary = Integer.parseInt(n,2); 
			//Integer sInt = Integer.valueOf(binary);
		
			int count = countSetBits(binary);
			System.out.println("count:" + count);
			return count;
			} catch(NumberFormatException e) {
				System.out.println("Number Format exception is handled" + e);
			}
		}
		return 0;
			
	}
	public static int countSetBits(int n)
    {

        // base case
        if (n == 0)
            return 0;

        else

            // if last bit set add 1 else add 0
            return (n & 1) + countSetBits(n >> 1);
    }
	public static void main(String args[]) {
		System.out.println("elements:" + solution(137105, 131073));
		//131071, 131073    17179869183
		//3, 8
	}

	
}
