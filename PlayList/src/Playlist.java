import java.util.List;

/**
 * Created on 5/6/16 by:
 * Dalton Lima         github.com/daltonbr
 * Lucas Pinheiro      github.com/lucaspin
 */
public class Playlist {
    private List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    public void dumpMusics() {
        for (Music tempMusic : this.getMusics() ) {
            System.out.println(tempMusic);
        }
    }

    private List<Music> musics;

}
