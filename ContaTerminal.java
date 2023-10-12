import java.util.Scanner;
public class ContaTerminal{

    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);    
        
        System.out.println("Por favor digite o numero de sua conta! ");
            int numero = scanner.nextInt();
        System.out.println("Por favor digite o numero de sua agencia! ");
            String agencia = scanner.next();
        System.out.println("Por favor digite o seu nome! ");
            String nomeCliente = scanner.next();
         System.out.println("Por favor digite o seu saldo! ");
            Double saldo = scanner.nextDouble();

        System.out.println("Ola "+nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia eh "+agencia +", conta " +numero +" e seu saldo "+saldo+ " ja esta disponivel para saque");

    }
}