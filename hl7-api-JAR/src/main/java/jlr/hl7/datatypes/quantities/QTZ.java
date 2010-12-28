package jlr.hl7.datatypes.quantities;

import jlr.hl7.datatypes.foundation.BL;

public interface QTZ extends QTY {

    QTZ minus(QTZ x);
    QTZ plus(QTZ x);
    BL isZero();
}
