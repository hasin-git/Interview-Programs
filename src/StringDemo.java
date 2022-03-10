import java.util.Scanner;

public class StringDemo {
	public static void main(String args[]) 
	  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String input = sc.next();

        char search = 'a';           
	  
		  int count=0;
		  for(int i=0; i<input.length(); i++)
		  {
		      if(input.charAt(i) == search)
		      count++;
		  }
		  
		  System.out.println("'"+search+"' appears: "+count+" times.");
		  }
}
