package AlertDialog;

import javax.swing.*;
import java.awt.*;

public class Scream extends JFrame {

    private JPanel panelScream = null;

    public Scream(boolean Scream , float dialogTransparent){
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().getSize().width , Toolkit.getDefaultToolkit().getScreenSize().getSize().height);
        this.setOpacity(dialogTransparent);
        this.addPanelScream();
        this.setVisible(Scream);
    }

    private void addPanelScream () {
        this.panelScream = new JPanel();
        this.panelScream.setBackground(Color.BLACK);
        this.add(this.panelScream);
    }

}
