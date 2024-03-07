package proiect;

import java.util.Hashtable;

public class PC extends Component {

	
	PC(Hashtable<Integer, Integer> RAM, Hashtable<Integer, Integer> MEM, Hashtable<Integer, Integer> PV) {
		super(RAM, MEM, PV);
		this.ram=RAM;
		this.mem=MEM;
		this.pv=PV;
	}
	
	static int pretPC=0;
	

}
