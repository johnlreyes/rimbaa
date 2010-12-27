package jlr.hl7.datatypes;

import jlr.hl7.datatypes.basic.BN;
import jlr.hl7.datatypes.basic.CS;

public interface TYPE extends ANY {

    CS shortName();
    CS longName();
    BN implies(TYPE that);
}
