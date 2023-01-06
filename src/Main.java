import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    private ArrayList<players> play;


    public Main(){
        play = new ArrayList<players>();


    }


    public void addPlayers() {
        Scanner keyboard = new Scanner( System.in );
        System.out.println("How many players are playing? "); //Get the 2 player version to work
        int numOfPlayers = keyboard.nextInt(); // gets an int
        for( int x = 1; x <= numOfPlayers; x++)
        {
            System.out.println("Type player #" + x + "'s name:: " );
            String name = keyboard.next();//gets a String
            // add each new player to the list
            play.add(new players(name));
        }

    }

    public void turn(players a) {
        Scanner keyboard = new Scanner( System.in );
        System.out.println(a.getName() + " Please Press R to roll the dice to determine if you're gay");
        String b = keyboard.next();
        if(b.equals("r") || b.equals("R")) {
            int Dice = (int)(Math.random()*7);
            a.editsum(Dice);
            System.out.println("You have rolled a motherfucking " + Dice + ".");

            if(a.checkvicotry() == true) {
                System.out.println("You have won!!!");
            }
            else if (a.checksum() == true) {
                System.out.println("You have rolled to a " + a.returnsum()+ " so you're still at the same place");
                a.changesum();
            }
            else if(a.onladder() == true) {
                a.upaway();
                System.out.println("You have rolled to a ladder so you're moving up to" + a.returnsum());
            }
            else if(a.onsnake() == true) {
                a.downto();
                System.out.println("You have rolled to a snake so you're moving down to" + a.returnsum());
            }

            else {
                System.out.println("You have moved to spot " + a.returnsum());
            }

            System.out.println("Press w & then enter if you're wondering about placement");



        }


    }

    public void playgame() {
        addPlayers();
        int sum = 0;
        while(sum <100) {
            turn(play.get(0));
        }



    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
    Main one = new Main();
    one.playgame();

    }

}