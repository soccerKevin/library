package Library;
import java.util.ArrayList;

public class Member{
    private String name;
    private ArrayList<Membership> memberships;

    public Member(String name){
        this.name = name;
    }

    public void addMembership(Membership membership){
        memberships.add(membership);
    }
}