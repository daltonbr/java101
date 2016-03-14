package lampada;

/**
 * Created by dalton on 3/14/16.
 */
public class Main {

    //this method prints all the important status of a lamp
    public static void lampadaStatus(Lampada _lampada) {
        System.out.println( _lampada.getName() + " esta no estado " + _lampada.getState()
                + " - estaLigada(): " + _lampada.estaLigada() );
    }

    public static void main (String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();

        lampada1.setName("lampadaA");
        lampada2.setName("lampadaB");

        lampadaStatus(lampada1);

        lampada1.cycleState();   // cycle through states
        lampadaStatus(lampada1);

        lampada1.cycleState();  // cycle through states
        lampadaStatus(lampada1);

        lampadaStatus(lampada2);

        lampada2.setState(Lampada.LampState.ACESA);  //set directly the new state
        lampadaStatus(lampada2);
    }


}
