package jlr.hl7.datatypes.generic.collections;

import jlr.hl7.datatypes.basic.INT;
import jlr.hl7.datatypes.basic.QTY;

public interface GLIST<T extends QTY> extends LIST<T>{

    T head();
    QTY increment();
    INT period();
    INT denominator();
}
