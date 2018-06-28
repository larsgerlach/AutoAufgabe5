package aufgabe;

public class Smart extends Auto {

	Smart() {
		setAutomarke("Smart");
		modell = "Roadster";
	}

	private String modell;

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

}
