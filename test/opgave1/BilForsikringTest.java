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
}