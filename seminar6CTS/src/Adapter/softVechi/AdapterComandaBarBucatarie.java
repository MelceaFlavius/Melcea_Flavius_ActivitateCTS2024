package Adapter.softVechi;

import Adapter.softNou.Bar;
import Adapter.softNou.Bautura;

public class AdapterComandaBarBucatarie extends Bar implements SoftBucatarie{
    @Override
    public void printareBon() {
        super.printareNotaDePlata();

    }

    @Override
    public void adaugaProdus(Produs produs) {
        Bautura b = new Bautura(produs.getPret(), produs.getDenumire(),0);
        super.adaugaBautura(b);
    }
}