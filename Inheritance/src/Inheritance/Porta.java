package Inheritance;

/**
 * Created by dalton on 4/8/16.
 */
public class Porta {

    // Variables
    private boolean aberta;
    private String cor;
    private float dimensaoX;
    private float dimensaoY;
    private float dimensaoz;

    public float getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(float dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public float getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(float dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public float getDimensaoz() {
        return dimensaoz;
    }

    public void setDimensaoz(float dimensaoz) {
        this.dimensaoz = dimensaoz;
    }

    void abre()
    {
        this.aberta = true;
    }

    void fecha()
    {
        this.aberta = false;
    }

    void pinta(String s)
    {
        this.cor = s;
    }

    boolean estaAberta()
    {
        return this.aberta;
    }

}
