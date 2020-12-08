package ocp8.ch02.review;

import java.util.ArrayList;
import java.util.List;

public class Seal { //Mutable

    String name;
    private final List<Seal> friends;

    public Seal(String name, List<Seal> friends) {
        this.name = name;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public List<Seal> getFriends() {
        return friends;
    }
}

//Immutable Class
//Mark the Seal class final.
final class ImmutableSeal {
    //Mark name final and private.
    private final String name;
    private final List<Seal> friends;

    public ImmutableSeal(String name, List<Seal> friends) {
        this.name = name;
        if(friends == null){
            throw new RuntimeException("friends is required");
        }
        this.friends = new ArrayList<>(friends);
    }

    public String getName() {
        return name;
    }

    //Replace getFriends() with methods that don`t give the caller direct access 
    //to the List<Seal> friends.
    public int getFriendsCount(){
        return friends.size();
    }
    
    public Seal getFriends(int index) {
        return friends.get(index);
    }
}