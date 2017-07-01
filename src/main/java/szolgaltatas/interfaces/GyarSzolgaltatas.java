package szolgaltatas.interfaces;

import modell.Dolgozok;
import modell.Gyar;

import java.util.List;

public interface GyarSzolgaltatas {

    int munkasokSzama(Gyar gyar);
    double munkasokFizuja(Gyar gyar);
    double fonokFizu(Gyar gyar);
    int atlagEletkor(Gyar gyar);
    List<Dolgozok> dolgozokParameterei(Gyar gyar);
}