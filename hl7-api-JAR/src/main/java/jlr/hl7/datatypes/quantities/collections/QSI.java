package jlr.hl7.datatypes.quantities.collections;

import jlr.hl7.datatypes.foundation.CEQ;
import jlr.hl7.datatypes.foundation.DSET;
import jlr.hl7.datatypes.quantities.QTY;

public interface QSI<T extends QTY> extends QSET<T> {

    DSET<QSET<T>, CEQ> terms();
}
