package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.ANY;
import jlr.hl7.datatypes.generic.collections.SET;
import jlr.hl7.datatypes.timing.specification.GTS;

public interface TEL extends URL {

    GTS useablePeriod();
    SET<CS> use();
    BL equal(ANY x);
}
