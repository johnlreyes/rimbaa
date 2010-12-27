package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.ANY;

public interface CLCY extends ANY {

    CE name();
    INT ndigits();
    INT start();
    CLCY next();
    INT max(TS t);
    TS sum(TS ts, REAL r);
    INT value(TS t);
}
