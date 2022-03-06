/**
 * Probas para a clase Circulo
 * @author Iago
 */
package circulo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author profesor
 */
public class AroTest {
    
    /**
     *
     */
    public AroTest() {
    }
    
    /**
     * Test del método setX, de la clase Aro.
     */
    @Test
    public void testSetX() {
        System.out.println("establecerX");
        int valorX = 0;
        Aro instance = new Aro();
        instance.setCoordenadaX(valorX);
    }

    /**
     * Test del método getX, de la clase Aro.
     */
    @Test
    public void testGetX() {
        System.out.println("obterX");
        Aro instance = new Aro(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(expResult, result);
    }

    /**
     * Test del método sety, de la clase Aro.
     */
    @Test
    public void testSetY() {
        System.out.println("establecerY");
        int valorY = 0;
        Aro instance = new Aro();
        instance.setCoordenadaY(valorY);
    }

    /**
     * Test del método getY, de la clase Aro.
     */
    @Test
    public void testGetY() {
        System.out.println("obterY");
        Aro instance = new Aro(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(expResult, result);
    }

    /**
     * Test del método setRadio, de la clase Aro.
     */
    @Test
    public void testSetRadio() {
        System.out.println("establecerRadio");
        Aro instance = new Aro();
        instance.setRadio(0.0);
        instance.setRadio(0.1);
        instance.setRadio(-0.1);
    }

    /**
     * Test del método getRadio, de la clase Aro.
     */
    @Test
    public void testGetRadio() {
        System.out.println("obterRadio");
        Aro instance = new Aro(0,0,0.1);
        double result = instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(0.1);
        result= instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(-0.1);
        result= instance.getRadio();
        assertEquals(0.0, result,0);
    }

    /**
     * Test del método ObtenerDiametro, de la clase Aro.
     */
    @Test
    public void testObterDiametro() {
        System.out.println("obterDiametro");
        Aro instance = new Aro(0,0,0.1);
        double result = instance.obterDiametro();
        assertEquals(0.2, result,0);
    }

    /**
     * Test del método obtenerCircunferencia, de la clase Aro.
     */
    @Test
    public void testObterCircunferencia() {
        System.out.println("obterCircunferencia");
        Aro instance = new Aro(0,0,0.1);
        double expResult = 0.6283185;
        double result = instance.obterCircunferencia();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test del método obtenerSuperficie, de la clase Aro.
     */
    @Test
    public void testObterSuperficie() {
        System.out.println("obterArea");
        Aro instance = new Aro(0,0,0.1);
        double expResult = 0.0314159;
        double result = instance.obterSuperficie();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test del método transaladarCentro, de la clase Aro.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Aro instance = new Aro();
        int resultx=instance.getCoordenadaX();
        int resulty=instance.getCoordenadaY();
        instance.trasladarCentro(5, 6);
        int resultnx = instance.getCoordenadaX();
        int resultny = instance.getCoordenadaY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }
    
}
