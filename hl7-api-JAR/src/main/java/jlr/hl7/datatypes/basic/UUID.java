package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.quantities.INT;

public interface UUID extends UID {

    INT timeLow();
    INT timeMid();
    INT timeHighAndVersion();
    INT clockSequence();
    INT node();
    ST.SIMPLE literal();
}
