
import java.util.*;

public class listCombinerRunner{
	

	public static void main(String[] args){
		List l1 = new ArrayList();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		
		List l2 = new ArrayList();
		l2.add("1");
		l2.add("2");
		l2.add("3");
		l2.add("4");
		l2.add("5");
		
		List l3 = new ArrayList();
		l3 = listCombiner.combine(l1, l2);
		
		Iterator i = l3.iterator();
		while(i.hasNext()){
			String output = (String) i.next();
			System.out.println(output);
		}
	}
}