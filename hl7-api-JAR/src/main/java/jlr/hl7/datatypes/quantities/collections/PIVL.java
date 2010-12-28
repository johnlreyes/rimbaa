package jlr.hl7.datatypes.quantities.collections;

import jlr.hl7.datatypes.foundation.BL;
import jlr.hl7.datatypes.basic.CS;
import jlr.hl7.datatypes.basic.ST;
import jlr.hl7.datatypes.quantities.INT;
import jlr.hl7.datatypes.quantities.PQ;
import jlr.hl7.datatypes.quantities.RTO;
import jlr.hl7.datatypes.quantities.TS;
import jlr.hl7.datatypes.quantities.collections.IVL;
import jlr.hl7.datatypes.foundation.SET;

public interface PIVL<T extends TS> extends QSET<T> {

    QSET<T> specializes();
    IVL<T> phase();
    PQ period();
    RTO<INT, PQ.TIME> frequency();
    INT.POS count();
    BL displayFrequencyInd();
    CS alignment();
    BL isFlexible();
    ST.SIMPLE literal();
}
