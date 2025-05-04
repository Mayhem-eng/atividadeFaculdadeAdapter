package devices;

import interfaces.ControleInfravermelho;

public class ControleInfraredAntigo implements ControleInfravermelho {


    @Override
    public void ligarLuzInfra(boolean ligar) {
        System.out.println(">>> ESTADO DA LUZ VIA INFRA LIGADO");
    }

    @Override
    public void desligarLuzInfra(boolean desligar) {
        System.out.println("ESTADO DA LUZ VIA INFRA DESLIGADO");
    }
}
