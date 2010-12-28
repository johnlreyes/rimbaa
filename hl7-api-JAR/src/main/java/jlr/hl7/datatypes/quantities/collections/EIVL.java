package jlr.hl7.datatypes.quantities.collections;

import jlr.hl7.datatypes.basic.CS;
import jlr.hl7.datatypes.basic.ST;
import jlr.hl7.datatypes.quantities.PQ;
import jlr.hl7.datatypes.quantities.TS;

public interface EIVL<T extends TS> extends QSET<T> {

    QSET<T> specializes();
    CS event();
    IVL<PQ> offset();
    ST.SIMPLE literal();
}
