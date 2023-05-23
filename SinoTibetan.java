public class SinoTibetan extends Linguagem{

    public SinoTibetan(String nome, int numFalantes){
        super(nome, numFalantes, "Asia", "sujeito-objeto-verbo"); //chinesas: sujeito-verbo-objeto
        if(this.nome.contains("Chinês")){
            ordemDasPalavras = "sujeito-verbo-objeto";
        }
    }

    @Override
    public void getInfo(){
        System.out.println(nome + " é falado por " + numFalantes + " pessoas principalmente em: " + regioesFaladas + " A linguagem segue a ordem das palavras: " + ordemDasPalavras);
    }

}