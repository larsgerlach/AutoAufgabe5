package aufgabe;

public class Faehre {

	private Auto geparktesAuto;

	public void autoParken(Auto geparktesAuto) {
		this.geparktesAuto = geparktesAuto;
	}

	public void welchesAuto() {
		if (geparktesAuto == null) {
			System.out.println("Es wurde noch kein Auto geparkt!");
			return;
		}
		System.out.println(geparktesAuto.getAutomarke());
	}

}
