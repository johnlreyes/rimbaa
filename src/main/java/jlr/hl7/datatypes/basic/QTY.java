package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.ANY;
import jlr.hl7.datatypes.TYPE;

public interface QTY extends ANY {

    BL lessOrEqual(QTY x);
    BL compares(QTY x);
    TYPE diffType();
    QTY minus(QTY x);
    QTY plus(QTY x);
    BL isZero();
    BL lessThan(QTY x);
    BL greaterOrEqual(QTY x);
    BL greaterThan(QTY x);
}
