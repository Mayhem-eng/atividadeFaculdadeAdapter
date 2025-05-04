package adapters;

import interfaces.ControleInfravermelho;
import interfaces.ControleLuzWifi;

public class adapterControleLuz implements ControleLuzWifi {

    ControleInfravermelho controle;

    public adapterControleLuz(ControleInfravermelho controle) {
        System.out.println("VOCE CONECTOU O CONTROLE INFRAVERMELHO COM WIFI");
        this.controle = controle;
    }

    @Override
    public void ligarLuz() {
        System.out.println("LUZ COM CONTROLE INFRA LIGADA COM WIFI");
    }

    @Override
    public void desligarLuz() {
        System.out.println("LUZ COM CONTROLE INFRA DESLIGADA COM WIFI");
    }
}
