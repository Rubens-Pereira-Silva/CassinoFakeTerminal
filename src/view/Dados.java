package view;

import models.Jogador;
import models.Jogos;

import java.util.Random;
import java.util.Scanner;

import static utils.Utils.limparTerminal;

public class Dados implements Jogos {
    Jogador jogador;
    private int valorApostado;
    private boolean valorApostadoEscolhido = false;

    private final Scanner sc = new Scanner(System.in);
    private final Random random = new Random();

    String[] dados = {"1️⃣", "2️⃣" , "3️⃣", "4️⃣", "5️⃣", "6️⃣"};


    public Dados(Jogador jogador) {
        this.jogador = jogador;
    }

    @Override
    public void jogar(){
        while(true){
            if(!valorApostadoEscolhido){
                jogador.mostrarCarteira();
                System.out.println("Quanto deseja apostar?");
                valorApostado = sc.nextInt();
                valorApostadoEscolhido = true;
                limparTerminal();
            }
            //Se o jogador não tiver dinheiro
            if(!jogador.removerDinheiro(valorApostado)){
                break;
            }else{
                String[] resultado = randomDados();
                System.out.println(resultado[0] + " VS " + resultado[1]);
                if(!jogarNovamente()){
                    break;
                }
            }
        }

    }

    public boolean jogarNovamente(){
        jogador.mostrarCarteira();
        System.out.println("1 - jogar novamente");
        System.out.println("2 - mudar valor da aposta");
        System.out.println("3 - sair do jogo");

        int opcao = sc.nextInt();

        if(opcao == 1){
            limparTerminal();
            return true;
        }else if(opcao == 2){
            limparTerminal();
            valorApostadoEscolhido = false;
            return true;
        }else{
            limparTerminal();
            return false;
        }
    }

    private String[] randomDados(){
        int numeroJogador = 0;
        int numeroDealer = 0;
        StringBuilder dadosJogador = new StringBuilder();
        StringBuilder dadosDealer =  new StringBuilder();

        for(int i = 0; i < 6; i++){
            int num = random.nextInt(6);
            if(i < 3){
                numeroJogador += num;
                dadosJogador.append(dados[num]);
            }else{
                numeroDealer += num;
                dadosDealer.append(dados[num]);
            }
        }
        if(numeroJogador > numeroDealer){
            System.out.println("O jogador ganho!! " + valorApostado * 2.5);
            jogador.adicionarDinheiro(valorApostado * 2.5);
        }else if(numeroJogador < numeroDealer){
            System.out.println("O jogador perdeu a rodada");
        }else{
            System.out.println("Empate, o dinheiro apostado foi devolvido");
            jogador.adicionarDinheiro(valorApostado);
        }
        return new String[]{dadosJogador.toString(), dadosDealer.toString()};
    }

}
