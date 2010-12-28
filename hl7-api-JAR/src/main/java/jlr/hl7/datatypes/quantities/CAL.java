package jlr.hl7.datatypes.quantities;

import jlr.hl7.datatypes.basic.CS;
import jlr.hl7.datatypes.foundation.CEQ;
import jlr.hl7.datatypes.foundation.DSET;
import jlr.hl7.datatypes.foundation.SET;

public interface CAL extends DSET<CLCY, CEQ> {

    CS name();
    CLCY head();
    TS epoch();
}
