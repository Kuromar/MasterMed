/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
/**
 *
 * @author ZHORA
 */
public class NewApplet extends Applet {
    @Override
    public void init() {
        String fontList[];
        fontList = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (int i=0;i< fontList.length;i++)
        {
            System.out.println(i+":"+ fontList[i]);
        }
        }

    // TODO overwrite start(), stop() and destroy() methods
}
