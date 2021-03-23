import bandeau.Bandeau;

import java.awt.*;

public class EffetClignotant extends EffetAnimation {

    public EffetClignotant(){};

    @Override
    public void joueToiSur(Bandeau bandeau) {
        bandeau.setMessage("ça clignote");
        for (int i=0;i<3;i++) {
            bandeau.sleep(50);
            bandeau.setForeground(Color.white);
            bandeau.sleep(50);
            bandeau.setForeground(Color.black);
        }
    }
}
