package Validacao;
import java.util.Random;
import  java.util.concurrent.ThreadLocalRandom;

public class validacao {
    public static void main(String[] args) {
        // analisarCandidato(1900.0);
        // analisarCandidato(2000.0);
        // analisarCandidato(2200.0);
        // selecionarCandidatos();
        String [] candidatos = { "Andre", "Joao", "Ana", "Maria", "Diego"};
        for(String candidato:candidatos){
            entrarEmContato(candidato);
        }

    }

    static  void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas ++;
            }else{
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativasRealizadas < 3);
        
        if(atendeu){
            System.err.println("Conseguimo contato com " + candidato + " NA " + tentativasRealizadas + " Tentativas.");
        }else{
            System.err.println("Não conseguimos contato con " + candidato + " Número maximo de tentetivas " + tentativasRealizadas + " Realizadas");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }
    public static void selecionarCandidatos(){
            String [] candidatos = { "Andre", "Joao", "Ana", "Maria", "Diego"};
            int selecionados = 0;
            int canditatoAtual = 0;
            double salarioBase = 2000.0;
            while(selecionados < 5 && canditatoAtual < candidatos.length){
                String candidato = candidatos[canditatoAtual];
                double pretensaoDeSalario = valorPretendido();

                System.out.println("O candidato " + "Solicitou " + pretensaoDeSalario);
                if(salarioBase >= pretensaoDeSalario){
                    System.out.println("O candidato " + candidato + " foi aprovado");
                    selecionados++;
                }
                canditatoAtual++;
            }
    }
    static  double  valorPretendido(){
        return  ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contraproposta");
        }else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
