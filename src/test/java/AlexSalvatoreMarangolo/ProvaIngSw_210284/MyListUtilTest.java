package AlexSalvatoreMarangolo.ProvaIngSw_210284;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest
{
	@BeforeClass //prima di fare tutti i test, solo all'inizio
	static public void PrimaDeiTest()
	{
		//inizializza le liste che ci aspettiamo con i valori che ci aspettiamo
		
		//lista che ci aspettiamo se chiamiamo il sort Ascendente
		listAscendenteExpected.add(0);
		listAscendenteExpected.add(1);
		listAscendenteExpected.add(3);
		listAscendenteExpected.add(4);
		listAscendenteExpected.add(4);
		listAscendenteExpected.add(7);
		listAscendenteExpected.add(7);
		
		//lista che ci aspettiamo se chiamiamo il sort Discendente
		listDiscendenteExpected.add(7);
		listDiscendenteExpected.add(7);
		listDiscendenteExpected.add(4);
		listDiscendenteExpected.add(4);
		listDiscendenteExpected.add(3);
		listDiscendenteExpected.add(1);
		listDiscendenteExpected.add(0);
	}
	
	@Before //prima di ogni test, ogni volta prima di un nuovo test
	public void PrimaDiOgniTest()
	{
		//inizializza la lista da usare come test, in modo disordinato
		listTest.add(0);
		listTest.add(1);
		listTest.add(7);
		listTest.add(3);
		listTest.add(4);
		listTest.add(4);
		listTest.add(7);
	}
	
	@After //dopo ogni test, ogni volta dopo un nuovo test
	public void DopoOgniTest()
	{
		listTest.clear(); //pulisce la lista, per prepararla per gli eventuali test successivi
	}
	
	@Test //testa la correttezza dell'ordinamento ascendente
	public void AscendenteTest()
	{
		//chiama la funzione di ordinamento in maniera ascendente sulla nostra lista di test
		listTest = myListUtil.sort(listTest, 0);
		
		//scorre le liste
		for(int i = 0; i<listTest.size(); ++i)
		{
			//controlla che i risultati ottenuti, siano uguali a quelli aspettati
			assertEquals(listAscendenteExpected.get(i), listTest.get(i));
		}
	}
	
	@Test //testa la correttezza dell'ordinamento discendente
	public void DiscendenteTest()
	{
		//chiama la funzione di ordinamento in maniera discendente sulla nostra lista di test
		listTest = myListUtil.sort(listTest, 1);
		
		//scorre le liste
		for(int i = 0; i<listTest.size(); ++i)
		{
			//controlla che i risultati ottenuti, siano uguali a quelli aspettati
			assertEquals(listDiscendenteExpected.get(i), listTest.get(i));
		}
	}
	
	//campi
	private MyListUtil myListUtil = new MyListUtil(); //MyListUtil, per effettuare gli ordinamenti e testarli
	private List<Integer> listTest = new ArrayList<Integer>(); //lista che inizializziamo disordinata e poi ordiniamo, per test
	private static List<Integer> listAscendenteExpected = new ArrayList<Integer>(); //lista già ordinata nel modo in cui ci aspettiamo venga ordinata tramite la funzione sort ascendente
	private static List<Integer> listDiscendenteExpected = new ArrayList<Integer>(); //lista già ordinata nel modo in cui ci aspettiamo venga ordinata tramite la funzione sort discendente
}