package Q2;

import java.util.ArrayList;

public class TCalculation <T extends Number> {
	
	private ArrayList<T> numList;
	
	public TCalculation()
	{
		numList = new ArrayList<>();
	}
	
	public void append(T t)
	{
		numList.add(t);
	}
	
	public Number average()
	{
		double total = 0;
		
		for (T list: numList)
		{
			total += list.doubleValue();
		}
		
		return total/numList.size();
		
	}

}
