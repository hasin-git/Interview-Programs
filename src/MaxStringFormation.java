import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxStringFormation {
//Function to find the number of str2
//that can be formed using characters of str1
	static int findNumberOfTimes(String str1, String str2)
	{
		int freq[] = new int[26];
		int freq2[] = new int[26];

		int l1 = str1.length();

		// iterate and mark the frequencies of
		// all characters in str1
		//System.out.print("char at===>"+ str1.charAt(4) + "value--->" + freq[str1.charAt(4) - 'A']);
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

		// find the minimum frequency of
		// every character in str1
		for (int i = 0; i < l2; i++)
		{
			if(freq2[str2.charAt(i)-'A']!=0)
			count = Math.min(count,
							freq[str2.charAt(i) - 'A']/freq2[str2.charAt(i)-'A']);
		}

		return count;
	}
	
	
    static int findMax(String st, List<String> lt) {
    	ArrayList<Integer> arrlist = new ArrayList<Integer>();
    	//System.out.println("All match----"+st.chars().allMatch(Character::isUpperCase));
    	if(st.chars().allMatch(Character::isUpperCase)) 
		for(String wd: lt) {
			System.out.println(wd +"---"+findNumberOfTimes(st, wd));
			arrlist.add(findNumberOfTimes(st, wd));
			//arrlist = Integer.valueOf(findNumberOfTimes(st, wd).boxed).collect(Collectors.toList());
		}		
    	return Collections.max(arrlist);		   	
    }
	 	
	public static void main(String[] args) {
		
		String s1 = "BILALOBILLOLLOBABIIALLBLABCEDOGBILLDOSARBOSBILANSOBNLSOPSABALLOIBBINLDLIABMNBSODALIBOBAEKIBIBLSABLLBOBOBOBINBONILALBAOBALN";
		System.out.println("S1 length:" + s1.length());
		List<String> list = Arrays.asList("LOVE","CATS");
		//List<String> list = Arrays.asList("BILL","BOB","BALL","BIN");
		System.out.println("Maximum copies:" + findMax(s1, list));
		//list.forEach((s2) -> System.out.println("Maximum:" + findNumberOfTimes(s1, s2)));
		
	}
}