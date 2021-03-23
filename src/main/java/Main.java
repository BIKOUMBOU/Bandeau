import bandeau.Bandeau;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
        ScenarioAnimation scenario = new ScenarioAnimation(monBandeau);
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        EffetZoom zoom = new EffetZoom();
        EffetRotation rota = new EffetRotation();
        EffetClignotant cligno = new EffetClignotant();
        scenario.ajouteEffet(zoom,2);
        scenario.ajouteEffet(rota,1);
        scenario.ajouteEffet(cligno,5);
        monBandeau.close();
    }
}
