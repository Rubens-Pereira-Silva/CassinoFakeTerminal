package view;
import models.Jogador;
import models.Jogos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jackpot implements Jogos {
    private final String nome;
    private final String[] emojis;
    private final Jogador jogador;

    public Jackpot(String nome, String[] emojis, Jogador jogador) {
        this.nome = nome;
        this.emojis = emojis;
        this.jogador = jogador;
        if(emojis.length != 5){
            throw new IllegalArgumentException("O emojis deve conter 5 emojis");
        }
    }

    Scanner ler = new Scanner(System.in);
    Random random = new Random();
    double valorApostado;

    @Override
    public void jogar() {
        jogador.mostrarCarteira();
        System.out.println("Quanto deseja Apostar no jackpot?");
        valorApostado = ler.nextDouble();
        if(valorApostado <= 0){
            System.out.println("Valor deve ser maior que zero");
            jogar();
        }
        execurtarJogo();
    }
    @Override
    public void vitoria() {}
    public void derrota() {}
    private void execurtarJogo() {
        if(!jogador.removerDinheiro(valorApostado)){
            System.out.println("Não tem essa quantia para apostar");
            jogarNovamente();
        }
        String[] listaEmojis = new String[] {
                emojis[random.nextInt(emojis.length)],
                emojis[random.nextInt(emojis.length)],
                emojis[random.nextInt(emojis.length)]
        };
        boolean ganhou = listaEmojis[0].equals(listaEmojis[1]) && listaEmojis[1].equals(listaEmojis[2]);
        System.out.println(listaEmojis[0] + listaEmojis[1] + listaEmojis[2]);
        if(ganhou){
            System.out.println("Voce ganhou " + (valorApostado * 10) + " !!!");
            jogador.adicionarDinheiro(valorApostado * 10);
        }

        jogador.mostrarCarteira();
        jogarNovamente();
    }
    public void jogarNovamente(){
        System.out.println("1 - jogar novamente \n2 - mudar aposta \n3 - sair do jogo");
        switch (ler.nextInt()){
            case 1:
                execurtarJogo();
                break;
            case 2:
                jogar();
                break;
                case 3:
                    return;
        }
    }

    public String getNome(){
        return nome;
    }
}
