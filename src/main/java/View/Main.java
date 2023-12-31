package View;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Main extends JFrame {
    BufferedImage img = null;
    private JPanel panel, cards, menu, app;
    private JButton entrar, sair;

    public Main() {
        super("Loja de Carros");
        setDefaultCloseOperation(2);
        CardLayout cl = new CardLayout();
        panel = new JPanel();
        cards = new JPanel();
        cards.setLayout(cl);
        // ---------------------*
        menu = new JPanel(new BorderLayout());

        // try {
        // img = ImageIO.read(new File("menu.jpg"));
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        // JLabel label = new JLabel();
        // label.setText("teste");
        // label.setForeground(Color.white);
        // label.setHorizontalTextPosition(JLabel.CENTER);

        // Image dimg = img.getScaledInstance(this.getWidth(), this.getHeight(),
        // Image.SCALE_SMOOTH);

        // ImageIcon imageIcon = new ImageIcon(dimg);
        // label.setIcon(imageIcon);

        // menu.add(label, BorderLayout.CENTER);
        entrar = new JButton("Entrar");
        menu.add(entrar, BorderLayout.SOUTH);
        cards.add(menu, "Menu");

        // ---------------------*
        app = new JPanel(new BorderLayout());
        JTabbedPane abas = new JTabbedPane();
        abas.add("Carros", new PainelCarros());
        abas.add("Clientes", new PainelClientes());
        abas.add("Vendas", new PainelVendas());
        sair = new JButton("Sair");
        app.add(abas);
        app.add(sair, BorderLayout.SOUTH);

        cards.add(app, "App");
        // ---------------------*
        panel.add(cards);
        add(panel);

        // ---------------------*
        // Tratamento de eventos:

        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cards, "App");
            }
        });

        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cards, "Menu");
            }
        });
        // ---------------------*
    }

    public void run() {
        pack();
        setVisible(true);
    }
}
