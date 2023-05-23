public class Linguagem{

    String nome;
    int numFalantes;
    String regioesFaladas;
    String ordemDasPalavras;  

    //CONSTRUTOR
    public Linguagem(String nome, int numFalantes, String regioesFaladas, String ordemDasPalavras){  
        this.nome = nome;
        this.numFalantes = numFalantes;
        this.regioesFaladas = regioesFaladas;
        this.ordemDasPalavras = ordemDasPalavras;
    } 

     public void getInfo(){
        System.out.println(nome + " é falado por " + numFalantes + " pessoas principalmente em: " + regioesFaladas + " A linguagem segue a ordem das palavras: " + ordemDasPalavras);
        System.out.println();
    }

    public static void main(String[]args){
        Linguagem novaLingua = new Linguagem("Tikuna", 340000, "regiões dos rios Amazonas e Solimões.", "sujeito-verbo-objeto.");
        novaLingua.getInfo(); //chama o método getInfo() na variável novaLingua.

        Mayan Kiche = new Mayan("Ki'che'", 1000000000);
        Kiche.getInfo(); 

        SinoTibetan tibetaneo = new SinoTibetan("Chinês", 600000000);
        tibetaneo.getInfo(); 
    }
}