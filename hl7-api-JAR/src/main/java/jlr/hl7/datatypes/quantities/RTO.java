package jlr.hl7.datatypes.quantities;

import jlr.hl7.datatypes.basic.ST;

public interface RTO<N extends QTZ, D extends QTZ> extends QTY {

    N numerator();
    D denominator();
    ST.SIMPLE literal();
    REAL demotion();
//    PQ demotion();
}
