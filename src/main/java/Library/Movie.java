package Library;

public class Movie extends Borrowable implements Playable, Destroyable{
    private boolean destroyed;
    public Movie(String title){
        super(title);
    }

    public void play(){
        // play movie
    }

    public void stop(){
        // stop movie
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    public boolean isInGoodCondition(){
        return !destroyed;
    }

    public void destroy(){
        destroyed = true;
    }
}