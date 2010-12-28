package jlr.hl7.datatypes.quantities;

import jlr.hl7.datatypes.basic.ED;
import jlr.hl7.datatypes.foundation.ANY;
import jlr.hl7.datatypes.foundation.TYPE;
import jlr.hl7.datatypes.foundation.BL;

public interface QTY extends ANY {

    BL isComparableTo(QTY x);
    BL lessOrEqual(QTY x);
    BL lessThan(QTY x);
    BL greaterThan(QTY x);
    BL greaterOrEqual(QTY x);
    TYPE diffType();
    QTY minus(QTY x);
    QTY plus(QTY x);
    ED.TEXT originalText();
    RTO<QTZ, INT> promotion(QTY x);
}
