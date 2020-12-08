package ocp8.ch01.review;

public class BaseballTeam {

    private String city, mascot;
    private int numberOfPlayers;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BaseballTeam)) {
            return false;
        }
        BaseballTeam other = (BaseballTeam) obj;
        return (city.equals(other.city) && mascot.equals(other.mascot));
    }

    @Override
    public int hashCode() {
        return numberOfPlayers;
    }
// imagine getters and setters are here
}
