package devices;

import interfaces.ControleLuzWifi;

public class Controle implements ControleLuzWifi {

    private ControleLuzWifi controle;


    public void conectarControle(ControleLuzWifi controle){
        System.out.println("SEU CONTROLE FOI CONECTADO PARA USO VIA WIFI");
        this.controle = controle;
    }
    @Override
    public void ligarLuz() {
        System.out.println("ESTADO LUZ WIFI LIGADO");
    }

    @Override
    public void desligarLuz() {
        System.out.println("ESTADO LUZ WIFI DESLIGADO");
    }
}
