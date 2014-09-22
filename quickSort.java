package sorting;

import java.util.*;

public class quickSort{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new LinkedList<Integer>();
		arr.add(2133);
		arr.add(3423);
		arr.add(5545);
		arr.add(1);
		arr.add(21);
		arr.add(213);
		arr.add(233);
		arr.add(133);
		arr.add(23);
		
		System.out.print(quickSortMethod(arr));
		
	}
	public static <E extends Comparable<?super E>>List<E> quickSortMethod(List<E> arr){
		if(!arr.isEmpty())
		{
			E pivot = arr.get(0);	//this pivot can to change to get faster result
			
			List<E> less = new LinkedList<E>();
			List<E> pivotList = new LinkedList<E>();
			List<E> more = new LinkedList<E>();
			
			for(E i:arr)
			{
				//i = array element
				if(i.compareTo(pivot)<0)
				{
					less.add(i);
				}
				else if(i.compareTo(pivot)>0)
				{
					more.add(i);
				}
				else
				{
					pivotList.add(i);
				}
				
				//Recursively sort sublist
				less = quickSortMethod(less);
				more = quickSortMethod(more);
				
				//concatenate result
				less.addAll(pivotList);
				less.addAll(more);
			return less;
			}
		}
		return arr;
	}

}
