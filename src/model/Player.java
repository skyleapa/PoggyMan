package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    List<Pog> poggers;

    public Player(String name) {
        this.name = name;
        this.poggers = new ArrayList<>();
    }

    public void addPog(Pog pog) {
        poggers.add(pog);
    }

    public String getName() {
        return name;
    }
}
