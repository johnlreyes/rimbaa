package jlr.hl7.datatypes.quantities;

import jlr.hl7.datatypes.basic.CD;
import jlr.hl7.datatypes.foundation.ANY;

public interface CLCY extends ANY {

    CD.CV name();
    INT ndigits();
    INT start();
    CLCY next();
    INT max(TS t);
    TS sum(TS ts, REAL r);
    INT value(TS t);
}
