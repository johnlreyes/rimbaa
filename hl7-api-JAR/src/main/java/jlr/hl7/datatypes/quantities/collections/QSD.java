package jlr.hl7.datatypes.quantities.collections;

import jlr.hl7.datatypes.quantities.QTY;

public interface QSD<T extends QTY> extends QSET<T> {

    QSET<T> minuend();
    QSET<T> subtrahend();
}
