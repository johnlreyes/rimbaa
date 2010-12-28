package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.foundation.CEQ;
import jlr.hl7.datatypes.foundation.DSET;
import jlr.hl7.datatypes.quantities.collections.GTS;

public interface TEL extends URL {

    DSET<CS, CEQ> use();
    DSET<CS, CEQ> capabilities();
    GTS useablePeriod();

    interface URL extends TEL {
    }

    interface PHONE extends TEL {
    }

    interface EMAIL extends TEL {
    }
}
