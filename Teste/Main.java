import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LojaDeCarrosApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Loja de Carros");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel carrosPanel = new JPanel();
        JPanel clientesPanel = new JPanel();
        JPanel vendasPanel = new JPanel();

        // Conexão com o banco de dados
        String url = "jdbc:postgresql://localhost:5432/seubanco";
        String user = "seuusuario";
        String password = "suasenha";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            // Código para criar tabelas de carros, clientes e vendas no banco de dados
            // Certifique-se de criar as tabelas previamente

            // Interface de Cadastro de Carros
            JLabel modeloLabel = new JLabel("Modelo:");
            JTextField modeloField = new JTextField(20);
            // Adicione outros campos de carro aqui

            JButton cadastrarCarroButton = new JButton("Cadastrar Carro");
            cadastrarCarroButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String modelo = modeloField.getText();
                    // Obtenha os valores dos outros campos e insira no banco de dados
                    try {
                        String sql = "INSERT INTO carros (modelo) VALUES (?)";
                        PreparedStatement statement = connection.prepareStatement(sql);
                        statement.setString(1, modelo);
                        // Configure os outros parâmetros
                        statement.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar carro.");
                    }
                }
            });

            carrosPanel.add(modeloLabel);
            carrosPanel.add(modeloField);
            // Adicione os outros campos de carro e o botão de cadastrar

            tabbedPane.addTab("Cadastro de Carros", carrosPanel);

            // Repita o processo para o Cadastro de Clientes e Registro de Vendas

            frame.add(tabbedPane);
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}