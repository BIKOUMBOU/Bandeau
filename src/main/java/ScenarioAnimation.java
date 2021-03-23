import bandeau.Bandeau;

public class ScenarioAnimation {

    private Bandeau bandeau;

    public ScenarioAnimation(Bandeau bandeau) {
        this.bandeau = bandeau;
    }


    public void ajouteEffet (EffetAnimation effet, int rep) {
        for (int i=0;i<rep;i++) {
            effet.joueToiSur(this.bandeau);
        }
    }

}
