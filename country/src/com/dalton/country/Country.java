package com.dalton.country;
import java.util.ArrayList;
//import com.dalton.country.Country;

/**
 * Created by dalton on 3/15/16.
 *
 * 3) Escreva uma classe em Java que represente um país. Um país tem como atributos o
 seu nome, o nome da capital, sua dimensão em Km2 e uma lista de países com os quais
 ele faz fronteira.  Forneça os seguintes construtores e método:

 a) Construtor que inicialize o nome, capital e a dimensão do país;

 b) Métodos de acesso (getters/setters) para as propriedades indicadas no item (a);

 c) Um método que permita verificar se dois países são iguais. Dois países são iguais
 se tiverem o mesmo nome e a mesma capital. A assinatura deste método deve ser:

 public boolean equals(Pais outro);

 d) Um método que define quais outros países fazem fronteira (note que um país não
 pode fazer fronteira com ele mesmo);

 e) Um método que retorne a lista de países que fazem fronteira;

 f) Um método que receba um outro país como parâmetro e retorne uma lista de
 vizinhos comuns aos dois países.
 */

public class Country {
    private String name;
    private String capital;
    private int area;  // country's area in Km2
    // list of boarders countries - array list

    ArrayList<Country> borders = new ArrayList();

    //constructor
    public Country (String _name, String _capital, int _area) {
        this.setName(_name);
        this.setCapital(_capital);
        this.setArea(_area);
    }

    //setters and getters
    public void setName(String _name) {
        this.name = _name;
    }

    public String getName() {
        return this.name;
    }

    public void setCapital(String _capital) {
        this.capital = _capital;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setArea(int _area) {
        this.area = _area;
    }

    public int getArea() {
        return this.area;
    }

    // conceitualmente "errado" - deveria retornar o tipo borders ( ArrayList<Country> )
    // e posteriormente em outra funcao passarmos para String
    public String getBorders () {
        StringBuilder output = new StringBuilder();

        this.borders.forEach((temp) -> {
            output.append(temp.getName() + " ");
        });

        return output.toString();
    }

    public boolean equals(Country _outro) {
        boolean result;
        result = ((this.getName() == _outro.getName()) && (this.getCapital() == _outro.getCapital())) ?
                true : false;

        return result;
    }

    public ArrayList<Country> commonBorders(Country _other) {
        ArrayList<Country> output = new ArrayList();

        for (Country temp : this.borders ) {
            if ( _other.borders.contains(temp) ) output.add(temp);
        }
        return output;
    }

    public String arrayListToString() {
        StringBuilder output = new StringBuilder();

        for (Country temp : this.borders ) {
            output.append(temp.getName());
        }
        return output.toString();
    }

}
