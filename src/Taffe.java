public class Taffe {

    public int numeracao;

    public String versao;

    public int posicaoAtual = 0;

    public String dizerOi(){
        return "Oi pessoal";
    }

    public void falar(String oqueFalar){
        System.out.println(oqueFalar);
    }

    public void andar (int quantidadePassos){
        for (int i = 1; i <= quantidadePassos; i++){
            System.out.println("Passo: " + i);
        }
        posicaoAtual += quantidadePassos;

    }

    public void retornarPosicao(){
        System.out.println(posicaoAtual);
    }

    //andar
    //falar
    //dizer oi
    //mandar mensagem bravo
    //limpar casa
    //cantar uma musica
    //mudar idioma]

}
