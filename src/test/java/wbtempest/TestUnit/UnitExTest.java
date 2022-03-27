package wbtempest.TestUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wbtempest.Ex;

public class UnitExTest {

    Ex ex = new Ex();

    @Test
    void testisPodReturnTrue() {
        boolean variable = true;
        ex.setPod(variable);

        Assertions.assertEquals(variable, ex.isPod());

    }

    @Test
    void testisPodReturnfalse() {
        boolean variable = false;
        ex.setPod(variable);

        Assertions.assertEquals(variable, ex.isPod());
    }

    @Test
    void testisVisibleReturnTrue() {
        boolean variable = true;
        ex.setVisible(variable);

        Assertions.assertEquals(variable, ex.isVisible());

    }

    @Test
    void testisVisibleReturnfalse() {
        boolean variable = false;
        ex.setVisible(variable);

        Assertions.assertEquals(variable, ex.isVisible());
    }

}
