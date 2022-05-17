package donnees;

public class ComparateurAlbum implements Comparateur{
    @Override
    public boolean EtreAvant(CD cd1, CD cd2) {
        return (cd1.etreAvantAlbum(cd2));
    }


}
