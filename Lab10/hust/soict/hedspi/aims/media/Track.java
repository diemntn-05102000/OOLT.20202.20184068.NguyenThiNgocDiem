package soict.hedspi.aims.media;

import java.util.Objects;

public class Track implements Playable, Comparable<Track> {
    private String title;
    private int length;
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        if(track == null){
            return false;
        }else
            return length == track.length && Objects.equals(title, track.title);
    }


    @Override
    public int compareTo(Track o) {
        return 0;
    }
}
