import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created on 5/6/16 by:
 * Dalton Lima         github.com/daltonbr
 * Lucas Pinheiro      github.com/lucaspin
 */
public class Main {

    public static void main (String[] args) {

        Playlist loveSongs = new Playlist();
        ArrayList<Music> loveArray = new ArrayList<>();
        // vira 4
        Music vira = new Music("4",2);
        Music carta4 = new Music("5", 3);  // manilha copas  - ordem: 4
        Music carta2 = new Music("K", 8);  // Kc             - ordem: 2
        Music carta3 = new Music("5", 2);  // manilha espada - ordem: 3
        Music carta1 = new Music("Q", 4);  // Qc             - ordem: 1

        loveArray.add(carta4);
        loveArray.add(carta2);
        loveArray.add(carta3);
        loveArray.add(carta1);

        System.out.println(loveArray);
        loveSongs.setMusics( loveArray );
        loveSongs.dumpMusics();

        System.out.println("Arraylist ordenada");
        //loveArray.sort(null);
        Collections.sort(loveArray);
        loveSongs.dumpMusics();


    }



}
