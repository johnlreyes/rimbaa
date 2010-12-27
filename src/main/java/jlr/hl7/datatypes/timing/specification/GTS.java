package jlr.hl7.datatypes.timing.specification;

import jlr.hl7.datatypes.basic.BL;
import jlr.hl7.datatypes.basic.ST;
import jlr.hl7.datatypes.basic.TS;
import jlr.hl7.datatypes.generic.collections.IVL;
import jlr.hl7.datatypes.generic.collections.LIST;
import jlr.hl7.datatypes.generic.collections.SET;

public interface GTS extends SET<TS> {

    IVL<TS> hull();
    IVL<TS> nextTo(TS x);
    IVL<TS> nextAfter(TS x);
    GTS periodicHull(GTS x);
    BL interleaves(GTS x);
    LIST<IVL<TS>> demotion();
    ST literal();
}
