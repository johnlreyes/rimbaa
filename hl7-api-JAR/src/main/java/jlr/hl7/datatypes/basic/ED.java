package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.foundation.ANY;
import jlr.hl7.datatypes.foundation.BL;
import jlr.hl7.datatypes.foundation.CEQ;
import jlr.hl7.datatypes.foundation.DSET;
import jlr.hl7.datatypes.quantities.INT;

public interface ED<T extends ED> extends ANY {

    BIN data();
    CS mediaType();
    CS charset();
    CS language();
    CS compression();
    TEL.URL reference();
    BIN integrityCheck();
    CS integrityCheckAlgorithm();
    ED thumbnail();
    DSET<T, CEQ> translation();

    INT length();
    ED subPart(INT start, INT end);

    interface TEXT extends ED {
    }
    interface SIGNATURE extends ED {
    }
    interface IMAGE extends ED {
    }
    interface STRUCTURED_TEXT extends ED {
    }
    interface STRUCTURED_TITLE extends ED {
    }
}
