package be.kdg.landenquiz.model;

import java.util.ArrayList;
import java.util.List;

public class LandenQuizAdministratie {
    private List<Land> landen;

    //Lijst met alle landen met hun hoofdstad en werelddeel.
    public LandenQuizAdministratie(){
        landen = new ArrayList<>();
        landen.add(new Land("België","Brussel","Europa"));
    }

    //Getter
    public List<Land> getLanden() { return landen; }
}
