package jlr.hl7.datatypes.generic.collections;

import jlr.hl7.datatypes.ANY;
import jlr.hl7.datatypes.basic.BL;
import jlr.hl7.datatypes.basic.INT;

public interface BAG<T extends ANY> extends ANY {

    INT contains(T kind);
    BL isEmpty();
    BL notEmpty();
    BAG<T> plus(BAG<T> x);
    BAG<T> minus(BAG<T> x);
    BAG<T> promotion(T x);
}
