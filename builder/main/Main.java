package builder.main;

import builder.clase.Builder;
import builder.clase.ContBancar;

public class Main {
    public static void main(String[] args) {

        Builder contBuilder = new Builder();
        contBuilder.setNumeClient("Joiana").setCardAtasat(true).setInternetBanking(true);

        ContBancar contBancar = contBuilder.build();


        ContBancar contBancar2 = contBuilder.setNumeClient("Pareza").build();
        System.out.println(contBancar);
        System.out.println(contBancar2);

    }
}