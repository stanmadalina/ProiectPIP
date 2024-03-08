package proiect;

import java.util.Hashtable;

public abstract class Component {
		Hashtable<Integer, Integer> ram;
		Hashtable<Integer, Integer> mem;
		Hashtable<Integer, Integer> pv;
		
		//variabila pentru a apela functiile din interfata Pret
		ValidarePret pret=new ValidarePret();
		//Pret pret;
		
		
		//constructor
		Component(Hashtable<Integer, Integer> RAM, Hashtable<Integer, Integer> MEM, Hashtable<Integer, Integer> PV){
			this.ram=RAM;
			this.mem=MEM;
			this.pv=PV;
			
		}
		
		
		
}
