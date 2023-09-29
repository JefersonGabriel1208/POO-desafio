public class main {
    public static void main(String[] args) {
        // Exemplo de uso do Reprodutor Musical
        reprodutorMusical reprodutor = new reprodutorMusical();
        reprodutor.tocarMusica("Música 1");
        reprodutor.pausarMusica();
        reprodutor.selecionarMusica("Música 2");

        // Exemplo de uso do Aparelho Telefônico
        aparelhoTelefonico telefone = new aparelhoTelefonico();
        telefone.ligar();
        telefone.atenderChamada();
        telefone.iniciarCorreioDeVoz();

        // Exemplo de uso do Navegador na Internet
        navegadorNet navegador = new navegadorNet();
        navegador.exibirPagina("https://www.example.com");
        navegador.adicionarNovaAba("https://www.openai.com");
        navegador.atualizarPagina("https://www.example.com");
    }

}
