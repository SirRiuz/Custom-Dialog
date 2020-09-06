package AlertDialog;

import java.awt.event.ActionListener;

public interface Buttons {

    public abstract void addPositiveButtom(boolean visible , String buttonMessege , ActionListener actionListener);
    public abstract void addNegativeButtom(boolean visible , String buttonMessege);
    public abstract void addNeutralButtom(boolean visible , String buttonMessege);


}
