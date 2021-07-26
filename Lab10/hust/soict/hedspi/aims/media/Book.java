package soict.hedspi.aims.media;

import java.util.*;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    private String content;
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    private List<String> contentTokens = new ArrayList<String>();

    public List<String> getContentTokens() {
        return contentTokens;
    }

    public void setContentTokens(List<String> contentTokens) {
        this.contentTokens = contentTokens;
    }

    private Map<String, Integer> wordFrequency;
    public Map<String, Integer> getWordFrequency() {
        return wordFrequency;
    }

    public void setWordFrequency(Map<String, Integer> wordFrequency) {
        this.wordFrequency = wordFrequency;
    }



    public Book(String title){
        super(title, title);
    }
    public Book(String title, String category){
        super(title, category);
    }
    public Book(String title, String category, List<String> authors) {
        super(title, category);
        this.authors = authors;
//TODO: check author condition
    }


    public void addAuthor(String authorName){
        int checkAuthorInList = authors.indexOf(authorName);
        if (checkAuthorInList == -1) {
            System.out.println("Adding to list...");
            authors.add(authorName);
        } else System.out.println("This author existed in author list.");
    }
    public void removeAuthor(String authorName){
        int indexOfAuthor = authors.indexOf(authorName);
        if (indexOfAuthor == -1) {
            System.out.println(authorName + " not existed in list");
            return;
        }
        authors.remove(indexOfAuthor);
        System.out.println("Deleted");
    }

    public String printMap(Map<String, Integer> map) {
        String dataResponse = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            dataResponse = dataResponse + "Key : " + entry.getKey() + " have : "
                    + entry.getValue() + " times appeared.\n";
        }
        return dataResponse;
    }
    public String processContent() {
        List<String> list = new ArrayList<>(Arrays.asList(this.content.toLowerCase().split(" ")));

        this.setContentTokens(list);
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String element : list) {
            Integer count = map.get(element);
            map.put(element, (count == null) ? 1 : count + 1);
        }
        System.out.println("-------------AFTER SORT-------------");
        Map<String, Integer> treemap = new TreeMap<String, Integer>(map);
        return printMap(treemap);
    }

    public static void main(String[] args) {
        Book Book1 = new Book("Những người khốn khổ", "Tiểu thuyết");
        Book1.addAuthor("Victo Hugo");

        Book1.setContent("Xuyên suốt Những người khốn khổ là khúc tráng ca bi tráng mài khắc chân thật, tỉ mỉ từng linh " +
                "hồn  khổ sai giữa nhân thế nhưng vẫn không ngừng phụng sự cái tốt.");
        System.out.println(Book1.toString());
    }
    @Override
    public String toString() {
        return "Title is " + this.getTitle() + ", count token: " + this.getContent().split(" ").length + "\n Frequency token: \n" +
                this.processContent();
    }
}
