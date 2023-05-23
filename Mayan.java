public class Mayan extends Linguagem{
    
    //CONSTRUTOR
    public Mayan(String nome, int numFalantes){
        //chamar o construtor da classe base (Linguagem)
        super(nome, numFalantes, "America Central", "verbo-objeto-sujeito"); //parametros 
    }

    @Override
    public void getInfo(){
        System.out.println(nome + " é falado por " + numFalantes + " pessoas principalmente em: " + regioesFaladas + " A linguagem segue a ordem das palavras: " + ordemDasPalavras + " Fato interessante: " + nome + " é uma língua ergativa.\n");
    }

    
}