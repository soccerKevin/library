package Library;
import java.util.ArrayList;

public class LibraryBuilder{
    private String name;
    private ArrayList<Borrowable> inventory;

    public LibraryBuilder(){}

    public void setName(String name){
        this.name = name;
    }

    public Library create(){
        if(valid()) {
            return new Library(name, inventory);
        } else {
            throw new IllegalStateException("the library isn't ready yet");
        }
    }

    public boolean valid(){
        return (inventory.size() > 50 && name.length() > 0);
    }

    public void addItem(Borrowable borrowable){
        if (borrowable instanceof Borrowable){
            inventory.add(borrowable);
        } else {
            throw new IllegalArgumentException("Item must be a borrowable");
        }
    }
}