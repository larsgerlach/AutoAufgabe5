package aufgabe;

public class Audi extends Auto {

	Audi() {
		setAutomarke("Audi");
		istArschlochDrin = true;
	}

	private boolean istArschlochDrin;

	public boolean isIstArschlochDrin() {
		return istArschlochDrin;
	}

	public void setIstArschlochDrin(boolean istArschlochDrin) {
		this.istArschlochDrin = istArschlochDrin;
	}

}
