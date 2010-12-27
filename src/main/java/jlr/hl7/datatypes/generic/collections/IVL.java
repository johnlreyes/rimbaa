package jlr.hl7.datatypes.generic.collections;

import jlr.hl7.datatypes.ANY;
import jlr.hl7.datatypes.basic.BL;
import jlr.hl7.datatypes.basic.QTY;
import jlr.hl7.datatypes.basic.ST;

public interface IVL<T extends ANY> extends SET<T> {

    T low();
    BL lowClosed();
    T high();
    BL highClosed();
    QTY width();
    T center();
    IVL<T> hull();
    IVL<T> hull(IVL<T> x);
    ST literal();
    IVL<T> promotion(T x);
    T demotion();
}
