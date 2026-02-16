import models.Jogador;
import view.Dados;
import view.Jackpot;

import java.util.ArrayList;
import java.util.Scanner;

public class Cassino {
    static Jogador jogador = new Jogador(4000);
    static Scanner input = new Scanner(System.in);

    static Jackpot[] jackpotsList = getListJackpots();
    static Dados dados = new Dados(jogador);

    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Cassino ---");
            System.out.println("1 - Jackpots");
            System.out.println("2 - Dados");

            System.out.println("0 - Sair do Cassino");

            int option = input.nextInt();

            if (option == 0) {
                break;
            }
            switch (option) {
                case 1:
                    jogarJackpot();
                    break;
                case 2:
                    dados.jogar();
                    break;
            }
        }
    }

    //metodos para iniciar jogos
    public static void jogarJackpot() {
        System.out.print("\033[H\033[2J");
        for (int i = 0; i < jackpotsList.length; i++) {
            System.out.println((i + 1) + " - " + jackpotsList[i].getNome());
        }
        int option = input.nextInt();
        try {
            System.out.print("\033[H\033[2J");
            jackpotsList[option - 1].jogar();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.println("Opção invalida");
        }
    }

    //Metodos com retorno de listas de jogos
    public static Jackpot[] getListJackpots() {
        return new Jackpot[]{
                new Jackpot("Animais", new String[]{
                        "🐵",
                        "🐺",
                        "🦊",
                        "🐱",
                        "🦝"
                }, jogador),
                new Jackpot("Pedras Preciosas", new String[]{
                        "️⛏️",
                        "🪨",
                        "🧊",
                        "🪙",
                        "💎"
                }, jogador),
                new Jackpot("Profições", new String[]{
                        "👷",
                        "👮",
                        "🧑‍🚒",
                        "👨‍💻",
                        "👨‍🍳"
                }, jogador),
                new Jackpot("Copa do Mundo", new String[]{
                        "⚽",
                        "🏆",
                        "🥅",
                        "🎉",
                        "🌎"
                }, jogador),
                new Jackpot("Esportes", new String[]{
                        "⚽",
                        "🏀",
                        "🏈",
                        "⚾",
                        "🎾"
                }, jogador)
        };
    }
}
