package donnees;

import java.util.ArrayList;
import java.util.List;

/**
 * la classe CD contient toute l'information associee a un CD.</p>
 * 
 * elle est caracterisee par
 * <ul>
 * <li>le nom de l'artiste du CD
 * <li>le titre du D
 * <li>l'ensemble des pistes du CD
 * </ul>
 * 
 * Cette classe est utilisee par le magasin qui rassemble une liste de CDs.
 * 
 */
public class CD {

	/**
	 * constante pour definir comment afficher une separation entre les elements
	 * dans toString
	 */
	private static final String SEPARATOR = "--------------------------------------\n";

	/**
	 * les attributs du CD
	 */
	private String nomArtiste;
	private String nomCD;

	/**
	 * les pistes du CD
	 */
	private List<InfoPiste> pistes;

	/**
	 * constructeur simple, cree un CD sans aucune piste
	 * 
	 * @param artiste
	 *            nom de l'artiste qui a fait le C
	 * @param nomCDParam
	 *            titre du CD
	 */
	public CD(String artiste, String nomCDParam) {
		this.nomArtiste = artiste;
		this.nomCD = nomCDParam;

		this.pistes = new ArrayList<InfoPiste>();
	}

	/**
	 * ajoute une piste en fin de CD
	 * 
	 * @param infoPiste
	 *            les informations concernant la piste (duree et titre)
	 */
	public void ajouterPiste(InfoPiste infoPiste) {
		pistes.add(infoPiste);
	}

	@Override
	/**
	 * retourne le descriptif d'un CD
	 * <ul>
	 * <li> affiche les informations du CD
	 * <li> puis les informations des pistes du CD
	 * </ul>
	 */
	public String toString() {
		String r = SEPARATOR;
		r += this.nomArtiste + " - " + this.nomCD + " (" + pistes.size()
				+ " pistes)\n";
		// ajoute les pistes
		for (int i = 0; i < this.pistes.size(); i++) {
			InfoPiste piste = pistes.get(i);
			r += "   ." + numeroPiste(i) + ". " + piste + "\n";
		}
		r += SEPARATOR;
		return (r);
	}

	/**
	 * retourne une chaine correspondant au numero de piste (sur deux char) pour
	 * pouvoir afficher les pistes sans decalage
	 * 
	 * @param i
	 *            le numero
	 * @return la chaine sous deux caracteres
	 */
	private String numeroPiste(int i) {
		int numPiste = i + 1;
		String resultat = "" + numPiste;
		if (numPiste < 10)
			resultat = "0" + resultat;
		return (resultat);
	}

	public String getNomCD() {
		return nomCD;
	}


	//Correction Prof
	public int comparerArtiste(CD cd){
		String nomArtiste = this.nomArtiste;
		String nomCD = cd.nomArtiste;

		return nomArtiste.compareTo(nomCD);
	}

	/**
	 * comparateur de cd selon le nom
	 *
	 * @param cd
	 *            cd a comparer
	 * @return vrai si this est avant cd
	 */
	public boolean etreAvantAlbum(CD cd) {
		return (this.nomCD.compareTo(cd.nomCD) < 0);
	}

	/**
	 * comparateur de cd selon le nom d'artiste
	 *
	 * @param cd
	 * @return
	 */
	public boolean etreAvantArtiste(CD cd) {
		return (this.nomArtiste.compareTo(cd.nomArtiste) < 0);
	}

	public void trierPiste() {
		// tri par selection
		int nbCDs = this.pistes.size();
		for (int i = 0; i < nbCDs; i++) {
			InfoPiste cdSelectionne = this.pistes.get(i);

			//selectionne plus petit
			int indiceSelection = i;
			for (int j = i + 1; j < nbCDs; j++) {
				InfoPiste infoPiste = pistes.get(j);
				if (infoPiste.EtreAvantInfoPiste(cdSelectionne)) {
					indiceSelection = j;
					cdSelectionne = infoPiste;
				}
			}
			pistes.set(indiceSelection, pistes.get(i));
			pistes.set(i, cdSelectionne);
		}
	}


}
