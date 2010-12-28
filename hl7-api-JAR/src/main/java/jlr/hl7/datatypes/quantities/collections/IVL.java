package jlr.hl7.datatypes.quantities.collections;

import jlr.hl7.datatypes.foundation.BL;
import jlr.hl7.datatypes.quantities.QTY;
import jlr.hl7.datatypes.basic.ST;

public interface IVL<T extends QTY> extends QSET<T> {

    T low();
    T high();
    QTY width();
    T center();
    BL lowClosed();
    BL highClosed();
    T any();
    IVL<T> hull(IVL<T> x);
//    ST.SIMPLE literal();
    IVL<T> promotion(T x);
//    T demotion();

    interface LOW extends IVL {
    }

    interface HIGH extends IVL {
    }

    interface WIDTH extends IVL {
    }
}
