package es.upm.etsisi.poo;

import java.util.List;

public class Player {
    private String name;

    private double score;
    //private     List<Player> playerList;
    //private final PlayerList playerList;

    public Player(String name) {
        this.name = name;
        this.score = 0.0;
    }
    // Este no le veo mucha utilidad
    public Player(String name,double score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) { // no esta la opcion de cambiar el nombre
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    /*
    public void score(String name, double score){
        if (score<-999999.0) {
            Player player = findPlayerByName(name);
            if (player != null) {
                player.setScore(score);
            }
        }
    }


    private Player findPlayerByName(String name){
        for (Player player : playerList){
            if(player.getName().equals(name)){
                return player;
            }
        }
        return null;
    }

    public void rank(){
        int n = playerList.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                if (playerList.get(j).getScore()> playerList.get(j+1).getScore()){
                    Player aux=playerList.get(j);
                    playerList.set(j,playerList.get(j+1));
                    playerList.set(j+1,aux);

                }

            }
        }
        this.show();
    }
     */
}
