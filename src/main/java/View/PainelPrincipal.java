package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class PainelPrincipal extends JFrame {
    private JTabbedPane jTPane;

    public PainelPrincipal() {
        jTPane = new JTabbedPane();
        add(jTPane);

        // Criando as abas
        JPanel tab1 = new JPanel(); // Substitua "JPanel" pela classe da primeira aba
        jTPane.add("Carros", tab1);

        // Defina as dimensões e operação de fechamento da janela principal
        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void run() {
        this.setVisible(true);
    }

  
}
