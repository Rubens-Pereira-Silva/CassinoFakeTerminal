package models;

public class Jogador {
    double dinheiro;
    public Jogador(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void adicionarDinheiro(double quantidade) {
        dinheiro += quantidade;
    }

    public boolean removerDinheiro(double quantidade) {
        if(this.dinheiro >= quantidade){
            this.dinheiro -= quantidade;
            return true;
        }
        return false;
    }

    public void mostrarCarteira(){
        System.out.println("CARTEIRA: " + dinheiro);
    }

}
