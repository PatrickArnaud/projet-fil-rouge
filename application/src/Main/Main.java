package Main;

import Tools.Validator;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Validator v = new Validator();
                v.numericEntry(-1);
            }
        });
    }
}
