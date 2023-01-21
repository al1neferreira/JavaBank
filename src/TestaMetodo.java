package src;

public class TestaMetodo {

    public static void main(String[] args) {

        Conta contaDaAline = new Conta();

        contaDaAline.saldo = 100;
        contaDaAline.deposita(50);

        System.out.println(contaDaAline.saldo);
    }
}
