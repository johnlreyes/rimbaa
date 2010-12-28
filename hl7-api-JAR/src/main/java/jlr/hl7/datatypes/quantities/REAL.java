package jlr.hl7.datatypes.quantities;

import jlr.hl7.datatypes.basic.ST;
import jlr.hl7.datatypes.foundation.BL;

public interface REAL extends QTZ {

    INT precision();
    REAL negated();
    BL isOne();
    REAL times(REAL x);
    REAL dividedBy(REAL x);
    REAL inverted();
    REAL power(REAL x);
    ST.SIMPLE literal();
    REAL promotion(INT x);
    INT demotion();
}
