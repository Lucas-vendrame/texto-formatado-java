public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("tesxto que não quebra linha");

        //%s - substitui no texto um valor String
        System.out.printf("Vai imprimir %s" , "Um texto");

        //%d -  substitui no texto valor String
        System.out.printf("Vai imprimir %s. %s %s/n", "Um texto", "Qualquer");

        //%d - substitui o coringa d por um número inteiro no texto 
        System.out.printf("Minha idade é: %d", 17);

        //%f - substitui o coringa f por um número inteiro no texto 
        System.out.print("/nO valor de PI é: %.2f", 3.1415);

        // %2f - substitui o coringa %.2f por um número flutuante
        // com duas casas decimais
        System.out.print("/nO valor de PI é: %.2f", 3.1415);

        // %b - substitui o coringa %b por um valor booleano
        System.out.printf("/nEsse valor é %b", true);
        System.out.printf("/nEsse valor é %b", false);

        // %c - // %b - substitui o coringa %c por uma caractere
        System.out.printf("/nO caravtere é: %c", 'A');
        System.out.printf("/nO caravtere é: %c", '5');
        System.out.printf("/nO caravtere é: %c", '*');
        System.out.printf("/nO caravtere é: %c", '//');
        System.out.printf("/nO caravtere é: %c", '/"');

        //printf com todos os tipos usando variáveis 
        String texto = "Alguma coisa";
        int numeroInteiro = 1;
        float numeroQuebrado = 123.232f;
        boolean valor Verdadeiro = true;
        char umCaractere = '°';
        System.out.print("n%s, %d, %.2f, %b, %c",
                  texto, numeroInteiro, numeroQuebrado,
                  valorVerdadeiro, umCaractere)
    }
    }
}
