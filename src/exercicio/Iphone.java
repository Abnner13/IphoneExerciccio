package exercicio;

// Classe Iphone que herda Telefone e implementa as interfaces
public class Iphone extends Telefone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    // Construtor
    public Iphone() {
        super(); // Chama o construtor da classe pai
    }

    // Implementação dos métodos da classe abstrata Telefone
    @Override
    public void ligar() {
        if (!isLigado()) {
            setLigado(true);
            System.out.println("Iphone ligado.");
        } else {
            System.out.println("Iphone já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (isLigado()) {
            setLigado(false);
            System.out.println("Iphone desligado.");
        } else {
            System.out.println("Iphone já está desligado.");
        }
    }

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Música tocando.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreiroDeVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Implementação dos métodos da interface NavegadorNaInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}

