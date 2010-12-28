package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.foundation.BL;
import jlr.hl7.datatypes.foundation.CEQ;
import jlr.hl7.datatypes.foundation.DSET;
import jlr.hl7.datatypes.foundation.LIST;
import jlr.hl7.datatypes.quantities.collections.GTS;

public interface AD extends LIST<ADXP> {

    DSET<CS, CEQ> use();
    GTS useablePeriod();
    BL isNotOrdered();
    ST.NT formatted();
}