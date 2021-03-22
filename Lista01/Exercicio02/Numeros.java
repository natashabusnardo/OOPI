public class Numeros {

    private int um;
    private int dois;

    public int getUm() {
        return um;
    }

    public void setUm(int um) {
        this.um = um;
    }

    public int getDois() {
        return dois;
    }

    public void setDois(int dois) {
        this.dois = dois;
    }

    public int[] intervalo() {
        this.verificacao();
        int[] vetor = new int[dois - um -1]; //referenciado a classe
        int aux = um + 1;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aux;
            if (i < dois)
                aux ++;
        }
        return vetor;
    }

    public String verificacao() {
        if (um > dois) {
            um = um + dois;
            dois = um - dois;
            um = um - dois;
            return("O segundo número é menor que o primeiro! \nFazendo inversão. ");
        }
    }
}
