package jlr.hl7.datatypes.generic.collections;

import jlr.hl7.datatypes.*;
import jlr.hl7.datatypes.basic.BL;
import jlr.hl7.datatypes.basic.INT;
import jlr.hl7.datatypes.basic.ST;

public interface SET<T extends ANY> extends ANY {

    BL contains(T element);
    BL isEmpty();
    BL notEmpty();
    BL contains(SET<T> subset);
    INT cardinality();
    SET<T> union(SET<T> otherset);
    SET<T> union(T element);
    SET<T> except(T element);
    SET<T> except(SET<T> otherset);
    SET<T> intersection(SET<T> otherset);
    ST literal();
    SET<T> promotion(T x);
    IVL<T> hull();
}
