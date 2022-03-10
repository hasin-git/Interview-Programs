import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxListofString {

	static int findNumberOfTimes(String str1, String str2)
	{
		int freq[] = new int[26];
		int freq2[] = new int[26];
         
		int l1 = str1.length();

		// iterate and mark the frequencies of all characters in str1
		for (int i = 0; i < l1; i++)
		{
			freq[str1.charAt(i) - 'A'] += 1;
			
		}
			int l2 = str2.length();
		for (int i = 0; i < l2; i++)
		{
			freq2[str2.charAt(i) - 'A'] += 1;
		}
	
		int count = Integer.MAX_VALUE;
				
		for (int i = 0; i < l2; i++)
		{
			if(freq2[str2.charAt(i)-'A']!=0)
			count = Math.min(count,
							freq[str2.charAt(i) - 'A']/freq2[str2.charAt(i)-'A']);
		}
		return count;
	}	
	
    static int findMaxCopy(String initial, List<String> wordlist) {
    	ArrayList<Integer> arrlist = new ArrayList<Integer>();
    	if(initial.chars().allMatch(Character::isUpperCase)) {
			for(String text: wordlist) {
				if(text.chars().allMatch(Character::isUpperCase)) {
					arrlist.add(findNumberOfTimes(initial, text));	
				}
			}				
    	}
    	return Collections.max(arrlist);		   	
    }
	 	
	public static void main(String[] args) {
		
		String s1 = "BILALOBILLOLLOBABIIALLBLABCEDOGBILLDOSARBOSBILANSOBNLSOPSABALLOIBBINLDLIABMNBSODALIBOBAEKIBIBLSABLLBOBOBOBINBONILALBAOBALN";
		List<String> list = Arrays.asList("BILL","BOB","BALL","BIN");
		System.out.println("Maximum copies:" + findMaxCopy(s1, list));		
	}
}