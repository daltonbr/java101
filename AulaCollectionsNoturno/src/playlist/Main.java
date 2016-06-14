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
public class Main {
    
    public static void main(String[] args){
        PlayList pl = new PlayList();
        pl.iniciarMusicas();
        pl.ordenaMusicas();
        pl.mostrarMusicas();
        
        Musica m4 = new Musica();
        m4.setNome("Viva la Vida");
        m4.setArtista("Coldplay");
        m4.setNota(4);          
        
        if (pl.existeMusica(m4)){
            System.out.println("Tem a música");
        }
        else {
           System.out.println("Não tem a música"); 
        }

        
    }
    
}
