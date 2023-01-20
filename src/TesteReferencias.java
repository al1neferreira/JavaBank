package src;

public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("O saldo da primeira conta é de " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("O saldo da segunda conta é de " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("O saldo da segunda conta é de " + segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        if (primeiraConta == segundaConta){
            System.out.println("são a mesmíssima conta");
        }

    }
}
