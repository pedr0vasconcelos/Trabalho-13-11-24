package service;

import model.BichinhoVirtual;

public class BichinhoService {

    public void comer(BichinhoVirtual bichinho) {
        if (bichinho.isVivo() && bichinho.getCalorias() < 100) {
            bichinho.setCalorias(Math.min(bichinho.getCalorias() + 10, 100));
            bichinho.setForca(Math.max(bichinho.getForca() - 2, 0));
            System.out.println(bichinho.getNome() + " comeu! Calorias: " + bichinho.getCalorias() + ", Força: " + bichinho.getForca());
        } else {
            System.out.println(bichinho.getNome() + " não pode comer agora.");
        }
    }

    public void correr(BichinhoVirtual bichinho) {
        if (bichinho.isVivo() && bichinho.getCalorias() > 0) {
            bichinho.setCalorias(Math.max(bichinho.getCalorias() - 5, 0));
            bichinho.setForca(Math.max(bichinho.getForca() - 5, 0));
            System.out.println(bichinho.getNome() + " está correndo! Calorias: " + bichinho.getCalorias() + ", Força: " + bichinho.getForca());
        } else {
            System.out.println(bichinho.getNome() + " está cansado ou morto e não pode correr.");
        }
    }

    public void dormir(BichinhoVirtual bichinho) {
        if (bichinho.isVivo()) {
            bichinho.setForca(Math.min(bichinho.getForca() + 10, 100));
            bichinho.setCalorias(Math.max(bichinho.getCalorias() - 2, 0));
            System.out.println(bichinho.getNome() + " está dormindo. Calorias: " + bichinho.getCalorias() + ", Força: " + bichinho.getForca());
        } else {
            System.out.println(bichinho.getNome() + " não pode dormir pois está morto.");
        }
    }

    public void morrer(BichinhoVirtual bichinho) {
        bichinho.setVivo(false);
        bichinho.setForca(0);
        System.out.println(bichinho.getNome() + " morreu. GAME OVER!");
    }
}
