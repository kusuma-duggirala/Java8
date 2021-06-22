package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FIComparatorLambda 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList();
		al.add(795);
		al.add(212);
		al.add(865);
		al.add(193);
		al.add(22);
		System.out.println(al);
		
		Comparator<Integer> c= (arg0, arg1) -> {return (arg0>arg1)?-1:(arg0<arg1)?1:0;};
		Collections.sort(al, c);
		System.out.println(al);

	}

}
