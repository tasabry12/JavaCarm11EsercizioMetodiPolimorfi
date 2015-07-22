public class Dipendente extends Object {

	public String matricola;
	public double stipendio;

	public Dipendente(String matricola) {
		this.matricola = matricola;
	}

	public void gestisciStipendio(Dipendente dip) { // uso un paramentro
													// polimorfo Dipendente
													// può essere sia un
													// referencer a Dipendente
													// che a tutte le
													// sottoclassi
													// grazie al polimorfismo
													// per dati
		if (dip instanceof Capo) {                             // come prima instanza non deve mai esserci la super classe
			dip.stipendio = 4000;                              // ma le sottoclassi. In questo caso altrimentilo stipendio
		} else if (dip instanceof Programmatore) {             // sarebbe per tutti 4000  
			dip.stipendio = 2500;
		} else if (dip instanceof ProgettistaDatabase) {
			dip.stipendio = 2400;
		} else {
			dip.stipendio = 2000;
		}

	}
}
