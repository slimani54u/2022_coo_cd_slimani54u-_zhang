import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class ChargeurMagasinTest {
    @Test
    public void test1_chargerMagasin_pass() throws FileNotFoundException {
        ChargeurMagasin cm = new ChargeurMagasin("test1");
        Magasin magasin = cm.chargerMagasin();
        System.out.println(magasin);
        assertEquals("nb Cds: 0",magasin.toString(),"le Contenu different");
    }

    @Test
    public void test2_chargerMagasin_
}