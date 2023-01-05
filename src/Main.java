import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        int x = 0;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How many players will there be?");

        int amount = myObj.nextInt();  // Read user input
        System.out.println("There is " + amount + " Players playing");  // Output user input


        ArrayList<Integer> places = new ArrayList<Integer>();
        for(int n = 0;n<amount;n++)
            places.add(0);
        while(!(places.contains(100))) {
            for(int n = 0;n<amount;n++) {
                move(places.get(n));
                hitit(places.get(n));
            }
        }
    }

    public static int move(int sum) {
        int dice = (int)(Math.random()*7);
        if(sum+dice<=100)
            return sum + dice;
        else
          System.out.println("You need an exact roll to win!");
        return 0;

    }


    public static void hitit(int z){
        if(z == 4){
            z = 25;
        }
        if(z == 13){
            z = 46;
        }
        if(z == 50){
            z = 69;
        }
        if(z == 33){
            z = 49;
        }
        if(z == 42){
            z = 63;
        }
        if(z == 62){
            z = 81;
        }
        if(z == 74){
            z = 92;
        }

    }



}
