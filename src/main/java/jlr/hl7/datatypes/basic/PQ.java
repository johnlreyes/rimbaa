package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.ANY;
import jlr.hl7.datatypes.generic.collections.SET;

public interface PQ extends QTY {

    REAL value();
    CS unit();
    BL equal(ANY x);
    BL lessOrEqual(PQ x);
    BL compares(PQ x);
    PQ canonical();
    SET<PQR> translation();
    PQ negated();
    PQ times(REAL x);
    PQ times(PQ x);
    PQ inverted();
    PQ power(INT x);
    BL isOne();
    ST literal();
    REAL demotion();
    REAL originalValue();
    CV originalUnit();
}
