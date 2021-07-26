package soict.hedspi.aims.media;

import java.util.Objects;

public abstract class Media implements Comparable<Media> {
    private String title;
    private String category;
    private float cost;
    private int id;


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public Media( String title) {
        this.title = title;
    }
    public Media(String title, String category) {
        this.title = title;
        this.category = category;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        if(media == null){
            return false;
        }else
        return id == media.id;
    }
    @Override
    public int compareTo(Media o) {
        return this.getTitle().compareTo(o.getTitle());
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, title, category, cost);
    }


}
