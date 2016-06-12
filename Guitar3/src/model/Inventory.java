package model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	 private List<Guitar> guitars;

	  public Inventory() {
	    guitars = new LinkedList<Guitar>();
	  }

	  public void addGuitar(int id, double price,
	                        GuitarSpec spec) {
	    Guitar guitar = new Guitar(id, price, spec);
	    guitars.add(guitar);
	  }

	  public Guitar getGuitar(int id) {
	    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      if (guitar.getId()==(id)) {
	        return guitar;
	      }
	    }
	    return null;
	  }

	  public List<Guitar> search(GuitarSpec searchSpec) {
	    List<Guitar> matchingGuitars = new LinkedList<Guitar>();
	    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      if (guitar.getSpec().matches(searchSpec))
	        matchingGuitars.add(guitar);
	    }
	    return matchingGuitars;
	  }

	public List<Guitar> getGuitars() {
		return guitars;
	}

	public void setGuitars(List<Guitar> guitars) {
		this.guitars = guitars;
	}
}
