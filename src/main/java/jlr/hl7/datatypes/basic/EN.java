package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.ANY;
import jlr.hl7.datatypes.generic.collections.IVL;
import jlr.hl7.datatypes.generic.collections.LIST;
import jlr.hl7.datatypes.generic.collections.SET;

public interface EN extends LIST<ENXP> {

    SET<CS> use();
    IVL<TS> validTime();
    BL equal(ANY x);
    ST formatted();
}
