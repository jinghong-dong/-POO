package es.upm.etsisi.poo;

import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;

public class PlayerList {

    private final List<Player> playerList;

    public PlayerList() {
        this.playerList = new ArrayList<>();
    }

    private boolean noExiste(String name) {
        for (int i = 0; i < playerList.size(); i++) {
            if (playerList.get(i).getName() != null && playerList.get(i).getName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    public void createPlayer(String name) {
        if (noExiste(name)) {
            Player player = new Player(name);
            playerList.add(player);
            System.out.println("Player " + name + " has been created.");
        } else { //no funciona (tipo que no sale lo de que ya existe)
            System.out.println("The player " + name + " already exists.");
        }
    }

    public void removePlayer(String name) {
        if (!noExiste(name)) {
            for (int i = 0; i < playerList.size(); i++) {
                if (playerList.get(i).getName().equals(name)) {
                    playerList.remove(playerList.get(i));
                }
            }
        }
    }

    public void show() {
        if (playerList.isEmpty()) {
            System.out.println("No players registered.");
        } else {
            for (int i = 0; i < playerList.size(); i++) {
                System.out.println(playerList.get(i).getName());

            }
        }
    }

    // esto no es para el matchmaking (no lo entiendo) y esto no es mas facil utilizar noExite (pero al reves)
    private Player findPlayerByName(String name) {
        for (Player player : playerList) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    public void score(String name, double score) {
        if (score > -999999.0) { //puede tener valor negativo
            Player player = findPlayerByName(name);
            if (player != null) {
                player.setScore(score);
            }else{
                System.out.println("Player doesn`t exist");
            }
        } else {
            System.out.println("Invalid Score");
        }
    }

    private void showScore(){
        for(Player player : playerList){
            System.out.println(player.getName() + ": "+player.getScore());
        }
    }

    public void rank () { // mi idea es mejor crear un propio array nuevo para separar jugador con rank
        int n = playerList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { // un puto signo hace que todo este al reves
                if (playerList.get(j).getScore() < playerList.get(j + 1).getScore()) {
                        Player aux = playerList.get(j);
                        playerList.set(j, playerList.get(j + 1));
                        playerList.set(j + 1, aux);

                }

            }
        }
        this.show();

            //this.show(); // creo que aqui no puede ir(ya que solo muestra los nombres) //
            //Crear un metodo de ShowScore en vez de show.
         /*
        int n = playerList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (playerList.get(j).getScore() > playerList.get(j + 1).getScore()) {
                        Player aux = playerList.get(j);
                        playerList.set(j, playerList.get(j + 1));
                        playerList.set(j + 1, aux);

                }

            }
        }
            this.show(); // creo que aqui no puede ir(ya que solo muestra los nombres)
         */
    }
}