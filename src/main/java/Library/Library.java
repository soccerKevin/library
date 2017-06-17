package Library;
import java.util.ArrayList;

public class Library{
    private String name;
    private ArrayList<Borrowable> inventory;

    public Library(String name, ArrayList<Borrowable> inventory){
        this.name = name;
        this.inventory = inventory;
    }
}