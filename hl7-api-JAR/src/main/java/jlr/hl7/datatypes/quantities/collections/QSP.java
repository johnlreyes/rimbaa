package jlr.hl7.datatypes.quantities.collections;

import jlr.hl7.datatypes.quantities.QTY;

public interface QSP<T extends QTY> extends QSET<T> {

    QSET<T> low();
    QSET<T> high();
}
