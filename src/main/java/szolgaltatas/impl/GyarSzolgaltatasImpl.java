package szolgaltatas.impl;

import modell.Dolgozok;
import modell.Gyar;
import szolgaltatas.interfaces.GyarSzolgaltatas;
import tipusok.Beosztasok;

import java.util.List;

public class GyarSzolgaltatasImpl implements GyarSzolgaltatas {

    @Override
    public int munkasokSzama(Gyar gyar) {
        return gyar.getDolgozok().size();
    }

    @Override
    public double munkasokFizuja(Gyar gyar) {

        return gyar.getDolgozok().stream().mapToDouble(Dolgozok::getDolgozoFizetese).sum();
    }
    @Override
    public double fonokFizu(Gyar gyar) {
        return gyar.getDolgozok().stream().filter(s -> s.getDolgozoBeosztasa().equals(Beosztasok.FŐNŐK.name())).mapToDouble(Dolgozok::getDolgozoFizetese).sum();
    }

    @Override
    public int atlagEletkor(Gyar gyar){
        return ((int) gyar.getDolgozok().stream().mapToInt(e -> e.getDolgozoKora()).average().getAsDouble());
    }

    @Override
    public List<Dolgozok> dolgozokParameterei(Gyar gyar){
        return gyar.getDolgozok();
    }
}