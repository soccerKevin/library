package Library;
import java.util.ArrayList;
import java.util.Iterator;

public class Library implements Iterable{
    private String name;
    private ArrayList<Borrowable> inventory;

    public Library(String name, ArrayList<Borrowable> inventory){
        this.name = name;
        this.inventory = inventory;
    }

    public InventoryIterator getInventoryIterator(){
        return new InventoryIterator(inventory);
    }

    public Iterator<Borrowable> iterator(){
        return new InventoryIterator(inventory);
    }

    public class InventoryIterator implements Iterator{
        private ArrayList<Borrowable> inventory;
        private int index;

        public InventoryIterator(ArrayList<Borrowable> inventory){
            this.inventory = inventory;
            this.index = 0;
        }

        public boolean hasNext(){
            return index < inventory.size();
        }

        public Borrowable next(){
            return inventory.get(index);
        }
    }
}