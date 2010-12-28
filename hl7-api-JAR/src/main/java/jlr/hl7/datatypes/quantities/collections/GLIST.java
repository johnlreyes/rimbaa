package jlr.hl7.datatypes.quantities.collections;

import jlr.hl7.datatypes.quantities.INT;
import jlr.hl7.datatypes.quantities.QTY;
import jlr.hl7.datatypes.foundation.LIST;

public interface GLIST<T extends QTY> extends LIST<T> {

//    T.diffType increment();
    QTY increment();
    INT period();
    INT denominator();
}