package aufgabe;

public class Mercedes extends Auto {

	Mercedes() {
		setAutomarke("Mercedes");
		sterndurchmesser = 12;
	}

	private int sterndurchmesser;

	public int getSterndurchmesser() {
		return sterndurchmesser;
	}

	public void setSterndurchmesser(int sterndurchmesser) {
		this.sterndurchmesser = sterndurchmesser;
	}

}
