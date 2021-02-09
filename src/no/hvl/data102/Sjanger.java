package no.hvl.data102;

public enum Sjanger {
	SKREKK(1), ACTION(2), ROMANTISK(3), KOMEDIE(4), DOKUMENTAR(5), THRILLER(6), FANTASY(7);
	
	private int id;
	private Sjanger (int id) {
		this.id=id;
	}
}
