package jlr.hl7.datatypes.foundation;

import jlr.hl7.datatypes.basic.CS;

public interface TYPE extends ANY {

    CS shortName();
    CS longName();
    BL implies(TYPE that);
    BL isComparableTo(TYPE that);
}
