import java.util.Scanner;

public class Jogo_da_velha {

    public static void main (String [] arg){
    
        Campo [][] velha = new Campo [3][3];
        char simboloAtual ='x';
        Boolean game =true;
        String vitoria="";
        Scanner scan =new Scanner(System.in);
        
        while (game) {
            desenhaJogo(velha);
            vitoria=verificaVitoria((velha));

            if(!vitoria.equals("")){
                System.out.printf("Jogador %s venceu%n",vitoria);
                break;
            }
            try{



            } catch ( Exception e){
                System.out.println("'ERRO!!!'");
            }

        }

    }

    public static void desenhaJogo(Campo[][] velha){ // redesenhar a cada interaçao
        limparTela();
        System.out.print (     "    0    1    2 /n");
        System.out.println (   "    _ _  _ _  _ _ ");
        System.out.printf("0   %c | %c | %c %n",velha[0][0].getsimbolo(), velha[0][1].getsimbolo(), velha[0][2].getsimbolo());
        System.out.println (   "    _ _  _ _  _ _ ");
        System.out.printf("1   %c | %c | %c %n",velha[1][0].getsimbolo(), velha[1][1].getsimbolo(), velha[1][2].getsimbolo());
        System.out.println (   "    _ _  _ _  _ _ ");
        System.out.printf("2   %c | %c | %c %n",velha[2][0].getsimbolo(), velha[2][1].getsimbolo(), velha[2][2].getsimbolo());
    }

    public static void limparTela(){
         for (int cont = 0; cont<200; cont ++){ 
            System.out.println(""); 
        }
    }

    public static String verificaVitoria(Campo[][] velha){
        return "";
    }

}
