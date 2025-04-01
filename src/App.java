import exercicio.Iphone;

public class App {
    public static void main(String[] args) {
        // Criando o objeto Iphone
        Iphone iphone = new Iphone();

        // Usando os métodos da classe Iphone
        iphone.ligar();
        iphone.setModelo("iPhone 14");
        System.out.println("Modelo do Iphone: " + iphone.getModelo());

        // Testando os métodos de reprodução musical
        iphone.selecionarMusica("Bohemian Rhapsody");
        iphone.tocar();
        iphone.pausar();

        // Testando os métodos de telefone
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreiroDeVoz();

        // Testando os métodos de navegador na internet
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // Desligando o iphone
        iphone.desligar();
    }
}
