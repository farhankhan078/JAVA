import java.applet.*;
import java.awt.*;

/* <applet code="FactorialApplet" width=300 height=200></applet> */

public class FactorialApplet extends Applet {
    int number = 5;           // default value
    long factorial = 1;

    public void init() {
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
    }

    public void paint(Graphics g) {
        g.drawString("Number: " + number, 50, 80);
        g.drawString("Factorial: " + factorial, 50, 100);
    }
}
