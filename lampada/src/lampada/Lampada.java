package lampada;

/**
 * Created by Dalton Lima on 3/14/16.

 2) Escreva uma classe para representar uma lâmpada que está à venda em um supermercado.
 Imagine que essa lâmpada possa ter três estados: apagada, acesa e meia-luz. Além disso,
 ela tem uma operação “estáLigada” que retorne verdadeiro se a lâmpada estiver ligada e
 falso, caso contrário. Instancie 2 objetos dessa classe.


 */
public class Lampada {

    //tristate enum
    public enum LampState {
        APAGADA, ACESA, MEIALUZ
    }

    private String name;
    private LampState state;

    //constructor
    public Lampada() {
        this.setName("default_name");
        this.setState(LampState.APAGADA);  //by default we start APAGADA
    }

    // getters and setters
    public void setName(String _name){
        this.name = _name;
    }

    public String getName() {
        return this.name;
    }

    public void setState(LampState _state) {
        this.state = _state;
    }

    public LampState getState() {
        return this.state;
    }
    //estaLigada()
    // true (acesa e meia-luz), false (apagada)
    public boolean estaLigada() {
        boolean isOn;
        isOn = (this.getState() == LampState.APAGADA ) ? false : true;
        return isOn;
    }

    //cycle through the tristates: APAGADA -> MEIALUZ -> ACESA (and loops)
    public void cycleState() {
        if ( this.getState() == LampState.APAGADA ) {
            this.setState(LampState.MEIALUZ);
            return;
        }

        if ( this.getState() == LampState.MEIALUZ ) {
            this.setState(LampState.ACESA);
            return;
        } else {
            this.setState(LampState.APAGADA);
            return;
        }
    }

}
