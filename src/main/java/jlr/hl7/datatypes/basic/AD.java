package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.ANY;
import jlr.hl7.datatypes.generic.collections.LIST;
import jlr.hl7.datatypes.generic.collections.SET;

public interface AD extends LIST<ADXP> {

    SET<CS> use();
    GTS useablePeriod();
    BL isNotOrdered();
    BL equal(ANY x);
    ST formatted();
}
