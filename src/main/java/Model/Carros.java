package Model;

public class Carros {

    // Atributos

    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public String placa;
    public int valor;

    // Métodos

    public Carros(String marca, String modelo, int ano, String cor, String placa, int valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.valor = valor;
    }

    //Getters and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

}
