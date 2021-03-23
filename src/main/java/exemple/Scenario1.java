/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import scénario.Scénario1;
import java.awt.Color;
import java.awt.Font;


/**
 *
 * @author hp 665430
 */

public class Scenario1 {
    
public static void main(String[] args) {
        new Scénario1().scénario();
    }

    public void scénario() {
        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Bonjour");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Nous sommes aujourdhui, le Jeudi 18/03/2021");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Bienvenu(es) à ISIS Ecole d'Ingénieur Informatique pour la santé ");
        monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("SansSerif 15");
        monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("On va zoomer");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Zoom........");
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }
        monBandeau.sleep(1000);

        monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
        monBandeau.setMessage("On va tourner");
        monBandeau.sleep(1000);
        monBandeau.setMessage("On tourne...");
        for (int i = 0; i <= 100; i++) {
            monBandeau.setRotation(2 * Math.PI * i / 100);
            monBandeau.sleep(100);
        }

        monBandeau.setMessage("On va changer de couleur de fond");
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.GREEN);
        monBandeau.setMessage("On va changer de couleur");
        monBandeau.sleep(1000);
        monBandeau.setForeground(Color.RED);
        monBandeau.sleep(1000);
        monBandeau.setFont(font);
        monBandeau.setForeground(fore);
        monBandeau.setBackground(back);
        monBandeau.setMessage("Terminé");
        monBandeau.sleep(3000);
        monBandeau.close();
    }
}
