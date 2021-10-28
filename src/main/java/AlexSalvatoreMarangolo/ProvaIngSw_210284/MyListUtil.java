package AlexSalvatoreMarangolo.ProvaIngSw_210284;

import java.util.List;

public class MyListUtil
{
	//data 1 lista di interi, li ordina in base all'order dato: 0 = ascendente, 1 = discendete
	public List<Integer> sort(List<Integer> list, int order)
	{	
		if(order == 0) //se = 0, ascendente
		{
			//scorre la lista
			for(int i = 0; i<list.size()-1; ++i)
			{
				//se quello a sinistra è più grande
				if(list.get(i) > list.get(i+1))
				{
					//scambia i 2 numeri
					Integer tmp = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, tmp);
				}
			}
		}
		else if(order == 1) //se = 1, discendente
		{
			//scorre la lista
			for(int i = 0; i<list.size()-1; ++i)
			{
				//se quello a sinistra è più piccolo
				if(list.get(i) < list.get(i+1))
				{
					//scambia i 2 numeri
					Integer tmp = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, tmp);
				}
			}
		}
		
		//restituisce la lista, ordinata
		return list;
	}
	
	public static void main( String[] args )
    {
        ;
    }
}