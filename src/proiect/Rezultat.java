package proiect;

import java.util.Hashtable;
import java.util.Scanner;

public class Rezultat {
		Hashtable<Integer, Integer> ram1 = new Hashtable<Integer, Integer>();		
		Hashtable<Integer, Integer> mem1 = new Hashtable<Integer, Integer>();
    	Hashtable<Integer, Integer> pv1 = new Hashtable<Integer, Integer>();
		Hashtable<Integer, Integer> ram2 = new Hashtable<Integer, Integer>();
	    Hashtable<Integer, Integer> mem2 = new Hashtable<Integer, Integer>();
	    Hashtable<Integer, Integer> pv2 = new Hashtable<Integer, Integer>();
	    
	public Rezultat() {
		
		ram1.put(12, 1000);
		ram1.put(16, 1800);
		
		mem1.put(256, 150);
		mem1.put(512, 300);
		mem1.put(1024, 500);
	
		pv1.put(6, 1000);
		pv1.put(8, 1800);
		pv1.put(12, 3200);
		
		
		
		ram2.put(4, 600);
		ram2.put(8, 900);
		
		mem2.put(64, 50);
		mem2.put(128, 200);
		mem2.put(256, 300);
		
		pv2.put(2, 300);
		pv2.put(4, 500);
	}
	
	public void start() {
			pv2.put(4, 500);
			
			PC pc1 = new PC(ram1, mem1, pv1);
	        Laptop l1 = new Laptop(ram2, mem2, pv2);
	       
	        
	        System.out.println("Introduceti PC/Laptop:");
	        Scanner dev = new Scanner(System.in);
	        String d = dev.nextLine();

	        if (d.toUpperCase().equals("LAPTOP")) {
	        	System.out.println("Componente disponibile Laptop:\nRAM: 4, 8\nMemorie: 64, 128, 256\nPlaca Video: 2, 4");
	            calculPretLaptop(l1, dev);
	        } else if (d.toUpperCase().equals("PC")) {
	        	System.out.println("Componente disponibile PC:\nRAM: 12, 16\nMemorie: 256, 512, 1024\nPlaca Video: 6, 8, 12");
	            calculPretPC(pc1, dev);
	        } else {
	            System.out.println("Tip de dispozitiv necunoscut.");
	        }

	        dev.close();
	}
//calcul pret laptop
	 private void calculPretLaptop(Laptop laptop, Scanner dev) {
	        System.out.println("Introduceti componentele dorite(RAM, memorie, RAM placa video):");

	        int intr2 = dev.nextInt();
	        int m2 = dev.nextInt();
	        int plav2 = dev.nextInt();

	        if (ram2.containsKey(intr2) && mem2.containsKey(m2) && pv2.containsKey(plav2)) {
	        	
	        	
	        	int pret=laptop.pret.calculPret(ram2.get(intr2), Laptop.pretLaptop)+laptop.pret.calculPret(mem2.get(m2), Laptop.pretLaptop)+laptop.pret.calculPret(pv2.get(plav2), Laptop.pretLaptop);
	            System.out.println("Pretul laptopului dorit este: " + pret);
	        } else {
	            laptop.pret.pretInvalid();
	        }
	    }
//calcul pretPC
	    private void calculPretPC(PC pc, Scanner dev) {
	        System.out.println("Introduceti componentele dorite(RAM, memorie, RAM placa video)");

	        int intr1 = dev.nextInt();
	        int m1 = dev.nextInt();
	        int plav1 = dev.nextInt();

	        if (ram1.containsKey(intr1) && mem1.containsKey(m1) && pv1.containsKey(plav1)) {
	        	
	        	int pret=pc.pret.calculPret(ram1.get(intr1), PC.pretPC)+pc.pret.calculPret(mem1.get(m1), PC.pretPC)+pc.pret.calculPret(pv1.get(plav1),PC.pretPC);
	        	
	            System.out.println("Pretul calculatorului dorit este: " + pret);
	        } else {
	            pc.pret.pretInvalid();
	        }
	    }

}
