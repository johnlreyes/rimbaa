package jlr.hl7.datatypes.quantities.collections;

import jlr.hl7.datatypes.foundation.ANY;
import jlr.hl7.datatypes.quantities.INT;
import jlr.hl7.datatypes.quantities.QTY;
import jlr.hl7.datatypes.foundation.LIST;

public interface SLIST<T extends QTY> extends LIST<T> {

    T origin();
//    T.diffType scale();
    QTY scale();
    LIST<INT> digits();
}
