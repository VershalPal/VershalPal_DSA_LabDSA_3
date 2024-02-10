package binaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pairingUtil
{
	public static void pairPrinter(List<pairing> pairs)
	{
		if (pairs.size()==0)
		{
			return;
		}

		System.out.println("Sum = "+(pairs.get(0).getOne().getData()+pairs.get(0).getTwo().getData()));
		
		if(pairs.size() == 1)
		{
			System.out.print("Pair is ");
		}
		else
		{
			System.out.print("Pairs are ");
		}

		for (pairing pair : pairs)
		{
			System.out.print("("+ pair.getOne().getData()+","+pair.getTwo().getData()+") ");
			if(pairs.size()==1 || pairs.get(pairs.size()-1)==pair)
			{
				break;
			}
			System.out.print(", ");
		}
	}
	
	public static List<pairing> removeDublicatePairs(List<pairing> pairs)
	{		
		List<pairing> pairsFiltered = new ArrayList<>();
		Collections.reverse(pairs);
		pairs.forEach(x ->
		{
			if (!pairsFiltered.contains(x))
			{
				pairsFiltered.add(x);
			}
		});
		return pairsFiltered;
	}
}