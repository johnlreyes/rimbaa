package jlr.hl7.datatypes.quantities;

import jlr.hl7.datatypes.basic.CS;
import jlr.hl7.datatypes.basic.ST;

public interface MO extends QTZ {

    REAL value();
    CS currency();
    MO plus(MO x);
    MO times(REAL x);
    MO dividedBy(REAL x);
    ST.SIMPLE literal();
}
