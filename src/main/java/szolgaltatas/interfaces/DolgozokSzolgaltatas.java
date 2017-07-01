package szolgaltatas.interfaces;

import modell.Dolgozok;

import java.time.LocalDate;

//kiírja az adott gyárban dolgozó munkásoat minden tulajdonságával

public interface DolgozokSzolgaltatas {

    int hanyEves(Dolgozok dolgozo);
    int szabiNap(Dolgozok dolgozo);
    int kivettSzabi(Dolgozok dolgozo, int kivettNapok);
    int dolgozoBruttoFizuja(Dolgozok dolgozo);
    double dolgozoNettoFizuja(Dolgozok dolgozo);
}
