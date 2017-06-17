package Library;
import java.util.ArrayList;
import java.util.Date;

public abstract class Borrowable implements Destroyable{
    private String title;
    private boolean available, destroyed;
    private ArrayList<BorrowDate> borrowDates;

    public Borrowable(String title){
        this.title = title;
    }

    public boolean availability(){
        if(!available) return false;
        borrowDates.add(new BorrowDate());
        available = false;
        return true;
    }

    public boolean returnItem(){
        if(available) return false;
        borrowDates.get(borrowDates.size() - 1).checkIn();
        available = true;
        return true;
    }

    public String getTitle(){
        return title;
    }

    public boolean isDestroyed(){ return destroyed; }
    public boolean isInGoodCondition(){ return !destroyed; }
    public void destroy(){ destroyed = true; }

    private class BorrowDate{
        private Date checkoutDate, checkInDate;

        public BorrowDate(){
            checkoutDate = new Date();
        }

        public Date getCheckoutDate(){
            return checkoutDate;
        }

        public Date getCheckInDate(){
            return checkInDate;
        }

        public void checkIn(){
            checkInDate = new Date();
        }
    }
}