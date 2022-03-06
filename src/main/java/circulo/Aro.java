package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Iago
 */
public class Aro {
    public static final double MINIMO = 0.0;

    private int obterX;
    private int obterY;
    private double radio;

    public Aro() {
    }

    public Aro(int valorX, int valorY, double valorRadio) {
        obterX = valorX;
        obterY = valorY;
        establecerRadio(valorRadio);
    }

    public void establecerX(int valorX) {
        obterX=valorX;
    }

    public int obterX() {
        return obterX;
    }

    public void establecerY(int valorY) {
        obterY=valorY;
    }

    public int obterY() {
        return obterY;
    }

    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < MINIMO ? MINIMO : valorRadio);
    }

    public double obterRadio() {
        return radio;
    }

    public double obterDiametro() {
        return radio * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + obterX + "," + obterY + "]; Radio = " + radio;
    }

    public void trasladarCentro(int trasladarx, int trasladary){
        obterX=obterX + trasladarx;
        obterY=obterY + trasladary;
    }
}