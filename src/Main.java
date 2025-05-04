import adapters.adapterControleLuz;
import devices.ControleInfraredAntigo;
import devices.Controle;

public class Main {
    public static void main(String[] args) {

        Controle controleWifi = new Controle();
        ControleInfraredAntigo controleInfra = new ControleInfraredAntigo();

        /** controleWifi.conectarControle(controleInfra); AQUI NAO SERA POSSIVEL POIS O CONTROLE INFRA NAO E COMPATIVEL
        COM CONTROLE VIA WIFI**/

        // AQUI ESTAMOS ADAPTANDO O PASSANDO A CLASSE adapterControleLuz E NELA PASSANDO O CONTROLE INFRA PARA QUE ELE POSSA
        // TER ACESSO A LIGAR E DESLIGAR COM WI-FI
        controleWifi.conectarControle(new adapterControleLuz(controleInfra));

    }
}