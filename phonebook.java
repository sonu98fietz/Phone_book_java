package phonebook.java;
import java.util.*;  
public class phonebook {

	public static void main(String[] args) {
		String[] strar = new String[10000];
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int count=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			String a=sc.next();
			Integer b=sc.nextInt();
			map.put(a,b);
		}
		while (sc.hasNext()) {
			String s = sc.next();

			if (map.containsKey(s)) {
				System.out.println(s + "=" + map.get(s));

			} else {
				System.out.println("Not found");
			}
		 
		}
	}
}
