//listCombiner.class

//Write a function that combines two lists by alternatingly taking elements. For example: given the two lists [a, b, c] and [1, 2, 3], the function should return [a, 1, b, 2, c, 3].


//problem does not say whether to assume lists of equal length
//if lists are of unequal length, once at end of shorter list
//I chose to append the rest of longer list in order

import java.util.*;

public class listCombiner
{	

	public static ArrayList combine(List list1, List list2)
	{
		ArrayList outList = new ArrayList();
		
		int listCount;
		int loopCounter;
		
		if (list1.size() >= list2.size()){
			listCount = list1.size();
		} else {
			listCount = list2.size();
		}
	
		
		for (loopCounter = 0; loopCounter<listCount; loopCounter++){
			if (loopCounter < list1.size()){
			outList.add(list1.get(loopCounter));
			}
			if (loopCounter < list2.size()){
			outList.add(list2.get(loopCounter));
			}
		}
		return outList;
	}
}