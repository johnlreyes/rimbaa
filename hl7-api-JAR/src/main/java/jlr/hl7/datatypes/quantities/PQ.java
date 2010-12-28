package jlr.hl7.datatypes.quantities;

import jlr.hl7.datatypes.basic.CS;
import jlr.hl7.datatypes.basic.ST;
import jlr.hl7.datatypes.foundation.BL;
import jlr.hl7.datatypes.foundation.CEQ;
import jlr.hl7.datatypes.foundation.DSET;
import jlr.hl7.datatypes.foundation.SET;

public interface PQ extends QTZ {

    REAL value();
    CS unit();
    SET<CS, CEQ> codingRationale();
    DSET<PQR, CEQ> translation();

    PQ canonical();
    PQ plus(QTY x);
    BL isOne();
    PQ times(REAL x);
    PQ dividedBy(REAL x);
    PQ times(PQ x);
    PQ dividedBy(PQ x);
    PQ negated();
    PQ inverted();
    PQ power(INT x);

    ST.SIMPLE literal();
    PQ promotion(REAL x);
    REAL demotion();

    interface TIME extends PQ {
    }
}
