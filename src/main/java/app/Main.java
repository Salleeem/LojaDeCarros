package app;

import View.PainelPrincipal;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            PainelPrincipal frame = new PainelPrincipal();
            frame.run();
        });
    }
} 