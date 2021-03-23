import bandeau.Bandeau;

import java.awt.*;

public class EffetZoom extends EffetAnimation {

    public EffetZoom(){}

    @Override
    public void joueToiSur(Bandeau bandeau) {
        bandeau.setMessage("Zoom");
        for (int i = 5; i < 60; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bandeau.sleep(100);
        }
    }
}
