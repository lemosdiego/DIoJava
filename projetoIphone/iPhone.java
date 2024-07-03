

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    
    //Reprodutor musical
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void  tocar(){
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

     //Aparelho telefonico

    @Override
     public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
     // NavegadorInternet
     @Override
     public void exibirPagina(String url) {
         System.out.println("Exibindo página: " + url);
     }
 
     @Override
     public void adicionarNovaAba() {
         System.out.println("Adicionando nova aba");
     }
 
     @Override
     public void atualizarPagina() {
         System.out.println("Atualizando página");
     }

    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        meuIPhone.ligar("19102010");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        meuIPhone.selecionarMusica("Temporal de zé ramalho");
        meuIPhone.tocar();
        meuIPhone.pausar();
        
        meuIPhone.exibirPagina("http://diego.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}

