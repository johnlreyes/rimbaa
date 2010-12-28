package jlr.hl7.datatypes.foundation;

import jlr.hl7.datatypes.quantities.INT;
import jlr.hl7.datatypes.basic.ST;

public interface LIST<T extends ANY> extends COLL<T> {

    T head();
    LIST<T> tail();
    T item(INT index);
    INT length();
    LIST<T> subList(INT start, INT end);
    LIST<T> subList(INT start);
//    ST.SIMPLE literal();
    LIST<T> promotion(T x);
    BAG<T> demotion();
}
