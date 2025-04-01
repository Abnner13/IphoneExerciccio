package exercicio;

// Classe abstrata Telefone
public abstract class Telefone {
    private String modelo;
    private boolean ligado;
    private int volume;
    private boolean lanternaLigada;

    // Construtor sem parâmetros
    public Telefone() {
        this.modelo = "Desconhecido";
        this.ligado = false;
        this.volume = 5;
        this.lanternaLigada = false;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLanternaLigada() {
        return lanternaLigada;
    }

    public void setLanternaLigada(boolean lanternaLigada) {
        this.lanternaLigada = lanternaLigada;
    }

    // Métodos abstratos
    public abstract void ligar();
    public abstract void desligar();
}

