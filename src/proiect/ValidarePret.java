package proiect;


public class ValidarePret implements Pret {

	@Override
	public void pretInvalid() {
		System.out.println("Nu se poate calcula pretul!");
		
	}

	@Override
	public int calculPret(int pret_componenta, int pret_final) {
		pret_final=pret_final+pret_componenta;
		return pret_final;
	}

}
