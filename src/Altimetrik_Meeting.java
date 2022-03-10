import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class testcomparator implements Comparator<meeting> {
	public int compare(meeting o1, meeting o2) {
		if(o1.end < o2.end) {
		return -1;
		}
		else if(o1.end > o2.end) {
			return 1;
		}
		return 0;
	}
}

class meeting{
	int start;
	int end;
	int point;
	meeting(int start, int end, int point) {
		super();
		this.start = start;
		this.end = end;
		this.point = point;
	}		
}

public class Altimetrik_Meeting {
	public static void meetingTime(ArrayList<meeting> a, int s) {
		ArrayList<Integer> m = new ArrayList<>();
		int timel=0;
		testcomparator t = new testcomparator();
		Collections.sort(a, t);
		m.add(a.get(0).point);
		timel = a.get(0).end;
		
		for(int i=0; i<a.size(); i++) {
			if(a.get(i).start > timel)
			{
				m.add(a.get(i).point);
				timel = a.get(i).end;
			}
		}
		
		for(int i=0; i<m.size(); i++) {
			System.out.print(m.get(i) + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] startTime = {1,3,0, 5,7};
		int[] endTime = {2,4,6,8,9};	
		ArrayList<meeting> mlst = new ArrayList<>();
		for(int i=0; i<startTime.length; i++) {
			mlst.add(new meeting(startTime[i], endTime[i], i));
			meetingTime(mlst, mlst.size());
		}	
	}
}
