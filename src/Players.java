import java.util.Scanner;
public class Players {

    Scanner sc = new Scanner(System.in);
    int playa = sc.nextInt();
    private int numbum;

    public Players(){
        numbum = 0;
    }

    public int changethathoe(int poop){
        numbum += poop;
        return numbum;
    }

}
