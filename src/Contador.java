import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametro1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametro2 = sc.nextInt();
        try{
            contar(parametro1, parametro2);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        System.out.println("Fim da execução.");
    }
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro2 < parametro1) throw new ParametrosInvalidosException();
        if(parametro1 == parametro2) System.out.println("Não há um intervalo entre esses dois parâmetros");
        else{
            int contador = parametro2 - parametro1;
            for(int i=1; i<= contador; i++){
                System.out.println("Número: " + i);
            }
        }
        return ;
    }
}
