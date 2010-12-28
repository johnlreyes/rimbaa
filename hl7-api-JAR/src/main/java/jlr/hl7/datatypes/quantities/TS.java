package jlr.hl7.datatypes.quantities;

import jlr.hl7.datatypes.basic.CS;
import jlr.hl7.datatypes.basic.ST;
import jlr.hl7.datatypes.foundation.ANY;
import jlr.hl7.datatypes.foundation.BL;
import jlr.hl7.datatypes.quantities.INT;
import jlr.hl7.datatypes.quantities.PQ;
import jlr.hl7.datatypes.quantities.QTY;

public interface TS extends QTY {

    PQ offset();
    CS calendar();
    INT precision();
    PQ timezone();
    TS plus(PQ x);
    PQ minus(TS x);
    TS minus(PQ x);
    ST.SIMPLE literal();

    interface DATE extends TS {
        interface FULL extends DATE {
        }
    }

    interface DATETIME extends TS {
        interface FULL extends DATETIME {
        }
    }

    interface INSTANCE extends TS {
    }
}