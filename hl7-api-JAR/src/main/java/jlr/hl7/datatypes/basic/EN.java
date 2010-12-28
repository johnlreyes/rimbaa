package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.foundation.*;
import jlr.hl7.datatypes.quantities.collections.IVL;
import jlr.hl7.datatypes.quantities.TS;

public interface EN<T extends ENXP> extends LIST<ENXP> {

    DSET<CS, CEQ> use();
    IVL<TS> validTime();
    EN canonical();
    ST formatted();

//    ST.NT demotion();
    TN promotion(ST x);

    interface PN extends EN {
    }

    interface ON extends EN {
    }

    interface TN extends EN {
    }
}
