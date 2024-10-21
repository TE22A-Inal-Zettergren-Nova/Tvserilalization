import java.util.ArrayList;
import java.util.Scanner;

public class Tvseries {
    private String name;
    private ArrayList<Integer> episodes = new ArrayList<>();
    private int rating;

    public Tvseries() {
        Scanner tb = new Scanner(System.in);
        System.out.print("Enter episode name: ");
        name = tb.nextLine();
    }

    public Tvseries(String inName) {
        name = inName;
    }

    public void changeRating(int newRating){rating = newRating;}

    public void addEpisode(int muOfEpisode, int season){
    }
    public void printInfo(){}

}
