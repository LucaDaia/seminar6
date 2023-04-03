package prototype.main;

import prototype.ContBancar;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> documente = new HashMap<>();
        documente.put("CI", 2);
        documente.put("Adeverinta", 6);

        ContBancar contBancar = new ContBancar("Matei", documente, 8);

        ContBancar contBancarcopie = (ContBancar) contBancar.cloneaza();
        System.out.println(contBancar);
        System.out.println(contBancarcopie);
    }
}
