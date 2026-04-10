package roteiro01;
public class App { // Define a classe App

    // Define o método main, que é o ponto de entrada do programa
    public static void main(String[] args) throws Exception { 
        OlaAluno msg = new OlaAluno(); // Cria um objeto da classe OlaAluno

        // Chama o método de apresentação do aluno para solicitar o nome e 
        // exibir a mensagem de boas-vindas
        msg.apresentacaoAluno(); 

        // Chama o método de dados do aluno para solicitar a idade
        msg.dadosAluno(); 

    }
}
