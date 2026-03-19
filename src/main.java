import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random(); //Funcao random para gerar um numero aleatorio

        int secreto = rand.nextInt(100) + 1; //Atribuicao da funcao randow a variavel secreto para gerar um numero entre 1 e 100

        System.out.println("Bem-Vindo ao Número Secreto!");
        System.out.println("Você precisará adivinhar um número que será sorteado aleatoriamente. \n O jogo dará dicas se você está perto ou não do número sorteado. Boa Sorte!");

        int num = sc.nextInt();

        while(num != secreto){
            while(num < secreto){
                System.out.println("Muito baixo");
                num = sc.nextInt();
            } while(num > secreto){
                System.out.println("Muito alto");
                num = sc.nextInt();
            }
            if(num == secreto){
                System.out.println("Parabéns, você acertou! O número secreto era: " + secreto);
                break;
            }
        }
        sc.close();
    }

}
