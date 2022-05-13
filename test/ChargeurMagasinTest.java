import XML.ChargeurMagasin;
import donnees.CD;
import donnees.InfoPiste;
import donnees.Magasin;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ChargeurMagasinTest {
    @Test
    public void test1_chargerMagasin_pass() throws FileNotFoundException {
        ChargeurMagasin cm = new ChargeurMagasin("test1");
        Magasin magasin = cm.chargerMagasin();
        System.out.println(magasin);
        assertEquals("nb Cds: 0",magasin.toString(),"le Contenu different");
    }

//    @Test
//    public void test2_chargerMagasin_Exception() throws FileNotFoundException{
//        ChargeurMagasin cm = new ChargeurMagasin("");
//        FileNotFoundException ffe = new FileNotFoundException("1");
//        assertThrows(ffe, cm::chargerMagasin);
//
//    }

    @Test
    public void test(){
        CD cd_1 = new CD("Zhang","a");
        CD cd_2 = new CD("Zhang","b");
        CD cd_3 = new CD("Zhang","c");
        CD cd_4 = new CD("Zhang","d");
        CD cd_5 = new CD("Zhang","e");

        Magasin magasin = new Magasin();
        magasin.ajouteCd(cd_5);
        magasin.ajouteCd(cd_3);
        magasin.ajouteCd(cd_2);
        magasin.ajouteCd(cd_4);
        magasin.ajouteCd(cd_1);
        magasin.tri();

        System.out.println(magasin);


    }

    @Test
    public void test0(){
        System.out.println("a".compareTo("b"));
        CD cd_1 = new CD("Zhang","a");
        CD cd_2 = new CD("Zhang","b");
        System.out.println("a".compareTo("z"));

        System.out.println(cd_1.etreAvantAlbum(cd_2));

    }
}