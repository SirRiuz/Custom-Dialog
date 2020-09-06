import AlertDialog.AlertDialog;

import java.awt.*;

public class test {

    public static void main(String args[]) {
        AlertDialog myDialog = new AlertDialog(new Dimension(600 , 400),true);
            myDialog.setTitle("Error");
            myDialog.setMessege("Eso es un mensaje de error");
            myDialog.setCancel(true);
            myDialog.setDialogScreamTransparent(0.1f);
            myDialog.showDialog(true);
    }

}
