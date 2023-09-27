
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe scanner
        
        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println(" Digite seu nome completo ");
        String nome = scanner.next();
        }


    }
