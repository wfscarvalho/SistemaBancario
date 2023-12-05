package com.java.study.sistemaBancario;

public class Teste {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.depositar(1000);
        conta1.retirar(100);

        ContaCorrente conta2 = new ContaCorrente();
        conta2.depositar(1000);
        conta2.retirar(100);

        Conta conta3 = new ContaCorrente();
        conta3.depositar(1000);
        conta3.retirar(100);

        System.out.println("Conta 1: "+conta1.getSaldo());
        System.out.println("Conta 2: "+conta2.getSaldo());
        System.out.println("Conta 3: "+conta3.getSaldo());

        int[] values =new int[]{10,20,30,40,50};
        int[] values2=new int[]{10,20,30,40,50};


        System.out.println(values[0]);
        System.out.println(values2[3]);

        boolean isEqual=values[1]==values2[1];

        System.out.println(isEqual);

        int[] values3 ={10,20,30,40,50};
        int[] values4 ={10,20,30,40,50};

        boolean isEqual2=values3[1]==values4[1];

        System.out.println(isEqual2);





//        ContaCorrente cc=new ContaCorrente();
//        cc.setTipo("PF");
//        cc.setAgencia(1111);
//        cc.setNumero(123);
//        cc.setChequeEspecial(1000);






//        cc.depositar(50.0);
//        cc.setAgencia(123);
//        cc.setNumero(321);
//
//        cc.depositar(1000);
//
//        System.out.println(cc.getSaldo());
//
//        Conta poupanca=new Conta(111,222,1000);
//        poupanca.retirar(50);
//
//        System.out.println(poupanca.getSaldo());
//
//
//
//        String nome;
    }
}
