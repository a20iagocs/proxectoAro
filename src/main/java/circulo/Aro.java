package circulo;

/**
 * La clase Aro establece unas coordenadas, calcula el área y la circunferencia 
 * de un círculo, además puede transladar el centro del círculo.
 * @author Iago
 */
public class Aro {

    /**
     * Variables para dibujar un circulo así como una constante mínima del radio.
     */
    public static final double LIMITERADIO = 0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Método que devolverá la coordenada x.
     * @return la coordenadaX.
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Método que establece la coordenada x.
     * @param coordenadaX la coordenadaX que se establece.
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Método que devuelve la coordenada Y.
     * @return la coordenadaY.
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Método que establece la coordenada Y.
     * @param coordenadaY la coordenadaY que se establece.
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Método que devolverá el radio.
     * @return el radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Método que establece el radio.
     * @param valorRadio
     */
    public void setRadio(double valorRadio) {

        radio=(valorRadio < LIMITERADIO ? LIMITERADIO : valorRadio);
    }

    /**
     * Constructor de la clase sin parametrizar.
     */
    public Aro() {
    }

    /**
     * Constructor de la clase parametrizado.
     * @param valorX será la coordenada X. 
     * @param valorY será la coordenada Y.
     * @param valorRadio será el radio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * Método que devolverá el diametro del círculo.    
     * @return el diametro. 
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     * Método que devolverá la circunferencia.
     * @return la longitud de la circunferencia.
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Método que devolverá el área de la circunferencia.
     * @return el área.
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }
    /**
     * Método toString
     * @return las coordenadas de la circunferencia y el radio de la misma.
     */

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Método que desplaza las coordenadas de la circunferencia.
     * @param trasladarX coordenada x que se suma.
     * @param trasladarY coordenada y que se suma.
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}