package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.foundation.CEQ;
import jlr.hl7.datatypes.foundation.DSET;
import jlr.hl7.datatypes.quantities.INT;

public interface ST<T extends ST.NT> extends ED {

    ST.NT headCharacter();
    ST.NT tailString();
    DSET<T, CEQ> translation();
    ST.SIMPLE literal();

    interface SIMPLE extends ST {
    }

    interface NT extends ST {
    }
}
