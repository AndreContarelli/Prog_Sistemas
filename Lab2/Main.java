import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o numero de publicacoes a serem analisadas: ");
        int qntdPostagens = entrada.nextInt();
        int curtidas = 0;
        int total = 0;

        for(int cont = 1 ; cont <= qntdPostagens; cont++){
            System.out.printf("Insira a quantidade de curtidas da postagem %d: ", cont);
            curtidas = entrada.nextInt();
            total = total + curtidas;
            if(curtidas >= 100){
                System.out.println("Parabéns! publicacao popular!");
            }
            else{
                System.out.println("Publicacao com poucas curtidas");
            }
        }
        double media =  (double) total/ qntdPostagens;
        System.out.println("Total de curtidas é: "+ total);
        System.out.println("A média é de "+ media);
        entrada.close();
    }
} 