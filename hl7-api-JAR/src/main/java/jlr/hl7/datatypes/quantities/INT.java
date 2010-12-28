package jlr.hl7.datatypes.quantities;

import jlr.hl7.datatypes.basic.ST;
import jlr.hl7.datatypes.foundation.BL;

public interface INT extends QTZ {

    INT successor();
    INT predecessor();
    INT plus(QTY x);
    INT times(INT x);
    INT negated();
    BL isNegative();
    BL nonNegative();
    REAL dividedBy(REAL x);
    INT dividedBy(INT x);
    INT remainder(INT x);
    BL isOne();
    ST.SIMPLE literal();

    interface NONNEG extends INT {
    }

    interface POS extends INT {
    }
}
