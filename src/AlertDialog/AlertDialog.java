package AlertDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AlertDialog extends JDialog {

    private JPanel dialogPanelContainer = null;
    private JPanel statusBarPanel = null;
    private String title = "";
    private String messege = "";
    private boolean cancel = false;
    private boolean scream = false;
    private Color dialogColor = Color.white;
    private float dialogScreamTransparent = 0.6f;
    private Runnable screamThread = null;
    private Scream dialogScream;

    private int x = 470;
    private int y = 200;

    public AlertDialog (Dimension dialogDimensions, boolean scream) {
        this.x = dialogDimensions.getSize().width;
        this.y = dialogDimensions.getSize().height;
        this.scream = scream;
        dialogScream = new Scream(scream , dialogScreamTransparent);
        this.addEscapeCancel(this);
        this.setSize(new Dimension(this.x , this.y));
        this.setAlwaysOnTop(true);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        this.addPonelContainer();
        this.setModal(true);
        this.addStatusBarPanel();
    }

    public  AlertDialog(boolean scream) {
        this.scream = scream;
        dialogScream = new Scream(scream , dialogScreamTransparent);
        this.addEscapeCancel(this);
        this.setSize(new Dimension(this.x , this.y));
        this.setAlwaysOnTop(true);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        this.addPonelContainer();
        this.setModal(true);
        this.addStatusBarPanel();
    }

    private void openScream(float dialogScreamTransparent , AlertDialog objectDialog) {
        if (this.scream){
            screamThread = new Runnable() {
                @Override
                public void run() {
                    dialogScream.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            super.mouseClicked(e);
                            if (objectDialog.cancel){
                                objectDialog.setVisible(false);
                                dialogScream.setVisible(false);
                            }
                        }
                    });
                }
            };
            screamThread.run();
        }
    }

    private void addStatusBarPanel(){
        this.statusBarPanel = new JPanel();
        this.statusBarPanel.setLayout(null);
        this.statusBarPanel.setBackground(Color.decode("#F1F1F1"));
        this.statusBarPanel.setLocation(0,0);
        this.statusBarPanel.setSize(Toolkit.getDefaultToolkit().getScreenSize().width , 40);
        this.dialogPanelContainer.add(this.statusBarPanel);
    }

    private void addPonelContainer(){
        this.dialogPanelContainer = new JPanel();
        this.dialogPanelContainer.setLayout(null);
        this.dialogPanelContainer.setBackground(this.dialogColor);
        this.add(this.dialogPanelContainer);
    }

    public void showDialog(boolean show){
        this.openScream(this.dialogScreamTransparent , this);
        this.setVisible(show);
    }

    private void addEscapeCancel(AlertDialog objectContext){
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println(e.getKeyCode());
                if (e.getKeyCode() == 27) {
                    System.out.println("Kill dialog");
                    objectContext.setVisible(false);
                    dialogScream.setVisible(false);
                }

                if (e.getKeyCode() == KeyEvent.VK_HOME){
                    e.consume();
                }
            }
        });
    }

    public String getMessege() {
        return messege;
    }

    public void setDialogScreamTransparent(float dialogScreamTransparent) {
        this.dialogScreamTransparent = dialogScreamTransparent;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCancel (boolean cancel) {
        this.cancel = cancel;
    }

}
