package AlertDialog;

public abstract class ButtonAdapter {
    public abstract void addPositiveButtom(boolean visible , String messege , Object action);
    public abstract void addNegativeButtom(boolean visible , String messege);
    public abstract void addNeutralButtom(boolean visible , String messege);
}
