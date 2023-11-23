package logs;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;

public class Registro {

    private static final String CAMINHO_ARQUIVO = "registros.txt";
    static File arquivo = new File(CAMINHO_ARQUIVO);

    public Registro() {
        try {
            // Verifique se o arquivo de registro já existe
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
        } catch (IOException e) {//Tratamento do erro se houver
            e.printStackTrace();
            }

    }

    public void registrar(String mensagem) {
        try {
            
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Escreva a mensagem no arquivo
            bw.write(mensagem);
            bw.newLine(); // Adicione uma quebra de linha para separar as operações

            // Feche o arquivo
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            // Lide com possíveis erros ao abrir/gravar no arquivo, por exemplo, lançando
            // exceções personalizadas ou registrando erros
        }
    }
}
