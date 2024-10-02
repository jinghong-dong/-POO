package es.upm.etsisi.poo;

import java.util.ArrayList;
import java.util.List;

public class MatchmakeList {

    private final List<MatchmakeList> matchmakeList;

    public MatchmakeList(){
        this.matchmakeList = new ArrayList<>();
    }
    public void create(){
        System.out.println(matchmakeList);
    }

}
