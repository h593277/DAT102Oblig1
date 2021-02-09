package no.hvl.data102;

import no.hvl.data102.adt.FilmArkivADT;

public class FilmArkiv2 implements FilmArkivADT {
	LinkedList<Film> filmArkivet = new LinkedList<Film>();
	int antall = 0;

	public Film[] getFilmArkiv() {
		Film[] tabellArkiv = (Film[]) filmArkivet.arrayKonvertering();

		return tabellArkiv;
	}

	@Override
	public boolean leggTil(Film filmen) {

		boolean lagtTil = false;

		filmArkivet.settInn(filmen);
		antall++;
		lagtTil = true;

		return lagtTil;
	}

	@Override
	public boolean slettFilm(Film filmen) {
		boolean slettet = false;

		if (filmArkivet.finn(filmen)) {
			filmArkivet.fjern(filmen);
			slettet = true;
		}

		return slettet;
	}

	@Override
	public Film finnFilm(String tittel) {

		Film finne;
		while (filmArkivet.iterator().hasNext()) {
			finne = (Film) filmArkivet.getHead().getData();
			if (finne.getTittel().contains(tittel)) {
				return finne;
			}
		}

		return null;
	}

	@Override
	public String finnProdusent(String filmen) {

		for (Film finn : filmArkivet) {
			if (finn.getTittel().contains(filmen)) {
				return finn.getFilmskaper();
			}
		}
		return null;
	}

	@Override
	public int antallSjanger(Sjanger sjanger) {
		int sjangerAntall = 0;
		for (Film f : filmArkivet) {
			if (f.getSjangeren() == sjanger) {
				sjangerAntall++;
			}
		}

		return sjangerAntall;
	}

	@Override
	public int antallFilmer() {

		return filmArkivet.size();
	}

}
