package src;
public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("A primeira conta tem um saldo de " + primeiraConta.saldo);
        System.out.println("A segunda conta tem um saldo de " + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        segundaConta.agencia = 146;

        System.out.println("A segunda conta pertence à agencia " + segundaConta.agencia);

    }
}
