package soict.hedspi.aims.media;

public abstract class Media {
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
}
