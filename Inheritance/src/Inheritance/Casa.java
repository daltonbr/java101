package Inheritance;

import javax.sound.sampled.Port;

/**
 * Created by dalton on 4/8/16.
 */
public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    public Casa() {
        Porta novaPorta1 = new Porta();
        Porta novaPorta2 = new Porta();
        Porta novaPorta3 = new Porta();
        this.setPorta1(novaPorta1 );
        this.setPorta2(novaPorta2 );
        this.setPorta3(novaPorta3 );
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    void pinta (String s)
    {
        this.cor = s;
    }

    int quantasPortasEstaoAbertas()
    {
        int totalPortas = 0;
        if (porta1.estaAberta() ) totalPortas++;
        if (porta2.estaAberta() ) totalPortas++;
        if (porta3.estaAberta() ) totalPortas++;

        return totalPortas;
    }

    int totalDePortas()
    {
        int totalPortas = 0;
        if (porta1 != null ) totalPortas++;
        if (porta2 != null ) totalPortas++;
        if (porta3 != null ) totalPortas++;

        return totalPortas;
    }

}
