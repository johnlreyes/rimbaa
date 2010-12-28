package jlr.hl7.datatypes.foundation;

import jlr.hl7.datatypes.basic.ST;
import jlr.hl7.datatypes.quantities.INT;

public interface BAG<T extends ANY> extends COLL<T> {

    INT count(T item);
    BAG<T> plus(BAG<T> x);
    BAG<T> minus(BAG<T> x);
//    ST.SIMPLE literal();
    BAG<T> promotion(T x);
    BAG<T> promotion(DSET<T, CEQ> x);
}
