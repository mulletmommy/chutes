import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int place = 0;
        while(place !=100)
            move(place);

    }

    public static int move(int sum) {
        int dice = (int)(Math.random()*7);
        //if(sum+dice<=100)
            return sum + dice;
    }

}