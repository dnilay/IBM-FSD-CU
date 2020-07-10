package problemStatement1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenNumbers {
public ArrayList<Integer> storeEvenNumbers(int N)
{ List<Integer>even=new ArrayList<>();
	int n=2;
	while(n<=N)
	{
		even.add(n);
		n=n+2;
	}
	return (ArrayList<Integer>) even;
	
}
public ArrayList<Integer> printEvenNumbers(ArrayList<Integer> a1)
{ ArrayList<Integer> a2=new ArrayList<>();
Iterator<Integer> it=a1.iterator();
while(it.hasNext())
{
	a2.add(it.next()*2);
	
}

return a2;
	
} 
public int retrieveEvenNumber(int N,ArrayList<Integer> a1)
{
	if(a1.contains(N))
		return N;
	else
		return 0;
}

	
	
	
}
