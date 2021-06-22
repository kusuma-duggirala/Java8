package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FIComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer arg0, Integer arg1) 
	{
		/*if(arg0>arg1)
			return -1;
		else if(arg0<arg1)
			return 1;
		else
			return 0;*/
		
		return (arg0>arg1)?-1:(arg0<arg1)?1:0;
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList();
		al.add(795);
		al.add(212);
		al.add(865);
		al.add(193);
		al.add(22);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		Comparator<Integer> c=new FIComparator();
		Collections.sort(al, c);
		System.out.println(al);

	}


}
