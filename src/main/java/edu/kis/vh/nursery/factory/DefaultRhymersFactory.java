package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public defaultCountingOutRhymer getStandardRhymer() {
        return new defaultCountingOutRhymer();
    }

    @Override
    public defaultCountingOutRhymer getFalseRhymer() {
        return new defaultCountingOutRhymer();
    }

    @Override
    public defaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public defaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
//alt + strzalka pozwala na szybkie przelaczanie miedzy plikami co jest mega wygodne