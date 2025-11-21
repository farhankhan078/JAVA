import java.applet.*;
import java.awt.*;

/* <applet code="SimpleMessage" width=300 height=200></applet> */

public class SimpleMessage extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawString("Hello! Welcome to Java Applet!", 50, 100);
    }
}

