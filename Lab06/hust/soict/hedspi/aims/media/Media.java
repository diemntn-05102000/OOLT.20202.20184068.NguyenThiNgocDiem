package soict.hedspi.aims.media;

public class Media {
    private String title;
    private String category;
    private float cost;
    private int id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media(String s, String title) {
        this.title = title;
    }
    public Media(String title, String category, int id) {
        this.title = title;
        this.category = category;
        this.id = id;
    }
}
