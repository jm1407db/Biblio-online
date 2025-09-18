package SRC.Model;
import java.util.ArrayList;


public class User {
    private String name;
    private String id;
    private ArrayList<Lending>lendingBooks;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
        this.lendingBooks=new ArrayList<>();
    }

    public void AddLending(Lending  lending){
        lendingBooks.add(lending);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


}
