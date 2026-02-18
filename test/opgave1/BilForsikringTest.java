package opgave1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {

    @Test
    void setGrundPraemieNegativ() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = -1;

        //Act

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.setGrundPraemie(pris));
    }

    @Test
    void setGrundPraemiePositivt() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;

        //Act
        bilForsikring.setGrundPraemie(pris);
        double expected = pris;
        double actual = bilForsikring.getGrundPraemie();

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieMand18år0skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 18;
        boolean isKvinde = false;
        int skadeFrieaer = 0;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieKvinde18år0skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 18;
        boolean isKvinde = true;
        int skadeFrieaer = 0;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.95;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieMand24år0skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 24;
        boolean isKvinde = false;
        int skadeFrieaer = 0;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieKvinde24år0skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 24;
        boolean isKvinde = true;
        int skadeFrieaer = 0;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.95;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieMand25år0skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 25;
        boolean isKvinde = false;
        int skadeFrieaer = 0;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieKvinde25år0skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 25;
        boolean isKvinde = true;
        int skadeFrieaer = 0;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 0.95;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieMand18år2skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 18;
        boolean isKvinde = false;
        int skadeFrieaer = 2;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieKvinde18år2skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 18;
        boolean isKvinde = true;
        int skadeFrieaer = 2;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.95;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieMand18år10skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 18;
        boolean isKvinde = false;
        int skadeFrieaer = 10;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieKvinde18år10skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 18;
        boolean isKvinde = true;
        int skadeFrieaer = 10;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.95;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieMand21år3skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 21;
        boolean isKvinde = false;
        int skadeFrieaer = 3;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.85;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieKvinde21år3skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 21;
        boolean isKvinde = true;
        int skadeFrieaer = 3;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.95 * 0.85;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieMand21år4skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 21;
        boolean isKvinde = false;
        int skadeFrieaer = 4;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.85;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieKvinde21år4skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 21;
        boolean isKvinde = true;
        int skadeFrieaer = 4;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.95 * 0.85;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieMand22år5skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 22;
        boolean isKvinde = false;
        int skadeFrieaer = 5;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.85;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieKvinde22år5skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 22;
        boolean isKvinde = true;
        int skadeFrieaer = 5;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.95 * 0.85;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieMand23år5skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 23;
        boolean isKvinde = false;
        int skadeFrieaer = 5;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.85;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieKvinde23år5skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 23;
        boolean isKvinde = true;
        int skadeFrieaer = 5;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.95 * 0.85;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieMand23år6skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 23;
        boolean isKvinde = false;
        int skadeFrieaer = 6;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.85;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieKvinde23år6skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 23;
        boolean isKvinde = true;
        int skadeFrieaer = 6;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.95 * 0.85;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieMand24år6skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 24;
        boolean isKvinde = false;
        int skadeFrieaer = 6;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.75;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieKvinde24år6skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 24;
        boolean isKvinde = true;
        int skadeFrieaer = 6;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.95 * 0.75;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieMand24år8skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 24;
        boolean isKvinde = false;
        int skadeFrieaer = 8;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.75;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieKvinde24år8skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 24;
        boolean isKvinde = true;
        int skadeFrieaer = 8;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1.25 * 0.95 * 0.75;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieMand26år8skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 26;
        boolean isKvinde = false;
        int skadeFrieaer = 8;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1 * 0.75;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieKvinde26år8skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 26;
        boolean isKvinde = true;
        int skadeFrieaer = 8;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1 * 0.95 * 0.75;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieMand26år9skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 26;
        boolean isKvinde = false;
        int skadeFrieaer = 9;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1 * 0.75;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieKvinde26år9skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 26;
        boolean isKvinde = true;
        int skadeFrieaer = 9;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1 * 0.95 * 0.75;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieMand27år9skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 27;
        boolean isKvinde = false;
        int skadeFrieaer = 9;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1 * 0.65;
        double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void beregnPraemieKvinde27år9skadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 27;
        boolean isKvinde = true;
        int skadeFrieaer = -1;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1 * 0.95 * 0.65;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }

    @Test
    void beregnPraemieNegativSkadefri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        double pris = 100;
        int alder = 27;
        boolean isKvinde = true;
        int skadeFrieaer = -1;
        bilForsikring.setGrundPraemie(pris);

        //Act
        double expected = pris * 1 * 0.95 * 0.65;
        //double actual = bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);

        //Assert
        assertThrows(RuntimeException.class, () -> bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer));
    }
}