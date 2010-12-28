package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.foundation.BL;
import jlr.hl7.datatypes.quantities.REAL;

public interface CO extends CD {

    REAL value();
    BL lessOrEqual(CO o);
    BL lessThan(CO o);
    BL greaterThan(CO o);
    BL greaterOrEqual(CO o);
}
