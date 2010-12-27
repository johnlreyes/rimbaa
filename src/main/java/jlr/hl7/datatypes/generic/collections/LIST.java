package jlr.hl7.datatypes.generic.collections;

import jlr.hl7.datatypes.ANY;
import jlr.hl7.datatypes.basic.BL;
import jlr.hl7.datatypes.basic.INT;
import jlr.hl7.datatypes.basic.ST;

public interface LIST<T extends ANY> extends ANY {

    T head();
    LIST<T> tail();
    BL isEmpty();
    BL notEmpty();
    T item(INT index);
    BL contains(T item);
    INT length();
    ST literal();
    LIST<T> promotion(T x);
}
