/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlist;

/**
 *
 * @author user
 */
public class Musica implements Comparable<Musica>{
    private String nome;
    private String artista;
    private Float nota;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * @return the nota
     */
    public Float getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Musica o) {
        //return this.getNome().compareTo(o.getNome());
        
        return o.getNota().compareTo(this.getNota());
    }
    
    @Override
    public String toString(){
        return this.getNome() + " - " + this.getArtista() + " - " + this.getNota();
    }
    
    public boolean equals(Object o){
        return (((Musica) o).getNome().equals(this.getNome()) &&
                ((Musica)o).getArtista().equals(this.getArtista()));
    }

    public int hashCode(){
        return this.getNome().hashCode();
    }

     
    
}
