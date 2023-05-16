package setHashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();//set je sucelje
		//,ne moze se inicijalizirati, zato koristimo hashset
	    names.add("Walter");
	    names.add("Ivan");
	    names.add("Jesse");
	    names.add("Bla");
	    names.add("Walter");
	    //setovi nemoju poredak, ne znamo gdje se nalaze dok liste idu poredu
	    //setovi ne dopustaju duplikate
	    
	    names.remove("Walter");
	    names.remove(0);//ne znamo sto ce izbaciti, jer je poredak nepoznat
	    
	    System.out.println(names);
	    System.out.println(names.size());
	    
	    //METODE
//	    names.clear();
//	    names.contains("Walter");
//	    names.isEmpty();
	    
//	    for(String name : names) {
//	    	//moze se ali ne znamo sto ce se ispisati
//	    }
	    
	    List<Integer> numberList = new ArrayList<>();
	    numberList.add(3);
	    numberList.add(2);
	    numberList.add(3);
	    numberList.add(3);
	    System.out.println(numberList);
	    
	    //ako se zelim rijesiti duplikata i nije mi bitan
	    //poredak, mogu sve skopirati u set
	    
	    Set<Integer> numberSet = new HashSet<>();
	    numberSet.addAll(numberList);
	    //addAll metodu mogu maknuti i staviti listu u konstrukor seta
	    Set<Integer> numberSet2 = new HashSet<>(numberList);
	    System.out.println(numberSet);
	    
	    

	    Set<Integer> numberSet3 = new TreeSet<>();
	    //TreeSet koristim ako nam je potreban set s poretkom
	    //stringove ce poredati po abecedi
	    //puno sporiji
	
	    
	    Set<Integer> numberSet4 = new LinkedHashSet<>();
	    //brzi od treeseta
	    //ako nam je bitan poredak korisitimo LinkedHashSet
	    
	}

}
