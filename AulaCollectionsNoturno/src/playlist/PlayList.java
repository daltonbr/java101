/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PlayList {

    private List<Musica> musicas = new ArrayList<Musica>();
    
    public void iniciarMusicas(){
        Musica m = new Musica();
        m.setNome("Stairway to heaven");
        m.setArtista("Led Zeppelin");
        m.setNota(10);
        
        Musica m2 = new Musica();
        m2.setNome("Viva la Vida");
        m2.setArtista("Coldplay");
        m2.setNota(9);
        
        Musica m3 = new Musica();
        m3.setNome("Resposta");
        m3.setArtista("Skank");
        m3.setNota(8);
        
        Musica m4 = new Musica();
        m4.setNome("Viva la Vida");
        m4.setArtista("Coldplay");
        m4.setNota(5);        
        
        this.musicas.add(m);
        this.musicas.add(m2);
        this.musicas.add(m3);
        this.musicas.add(m4);   
    }
    
    public void ordenaMusicas(){
        Collections.sort(this.musicas);
    }
    public void mostrarMusicas(){
        System.out.println(this.musicas);
    }
    
    public boolean existeMusica(Musica m){
        return this.musicas.contains(m);
    }

}
