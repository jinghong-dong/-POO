package es.upm.etsisi.poo;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        PlayerList playerList = new PlayerList(); // hay que iniciar algo o sino no tenemos nada

        playerList.createPlayer("Juan");
        playerList.createPlayer("Manuel");
        playerList.createPlayer("Victoria");
        playerList.createPlayer("Daisy");
        playerList.createPlayer("Juan");

        playerList.removePlayer("Manuel");
        playerList.removePlayer("Victor");

        playerList.show();

        playerList.score("Juan",9.0);
        playerList.score("Daisy",10.0);
        playerList.score("Victoria",5.0);
        playerList.score("Pepe",1.0);// no encuentra

        playerList.rank();

        playerList.show();
        /*
        Player player1 = new Player("Luisa");
        Player player2 = new Player("Manuel");
        Player player3 = new Player("Kurt");
        Player player4 = new Player("Sofia");
        Player player5 = new Player("Roberto");
        player1.score(player1.getName(), 4.5);
        player2.score(player2.getName(), 2.7);
        player3.score(player3.getName(), 4.0);
        player4.score(player4.getName(), 3.8);
        player5.score(player5.getName(), 3.8);

         */
    }
}
