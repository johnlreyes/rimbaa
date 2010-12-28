package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.foundation.CEQ;
import jlr.hl7.datatypes.foundation.DSET;
import jlr.hl7.datatypes.foundation.SET;

public interface ENXP extends ST.NT {

    CS type();
    DSET<CS, CEQ> qualifier();
}
