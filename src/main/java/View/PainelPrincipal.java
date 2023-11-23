package View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class PainelPrincipal extends JFrame{
     // criação do tabbedPane para incluir as tabs
    private JTabbedPane jTPane;

    public PainelPrincipal() {
        jTPane = new JTabbedPane();
        add(jTPane);


        // criandos as tabs
        // tab1 carros
        PainelCarros tab1 = new PainelCarros();


        jTPane.add("Carros", tab1);

        
        // Adicione o painel de clientes
        PainelClientes tab2 = new PainelClientes();
        jTPane.add("Clientes", tab2);

        // Adicione o JTabbedPane ao JFrame

        PainelVendas tab3 = new PainelVendas();
        jTPane.add("Vendas", tab3);


        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    //métodos para tornar a janela visível
    public void run(){
        this.setVisible(true);
     }
}