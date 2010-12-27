package jlr.hl7.datatypes;

import jlr.hl7.datatypes.basic.BL;
import jlr.hl7.datatypes.basic.BN;
import jlr.hl7.datatypes.basic.CS;

public interface ANY {

    TYPE dataType();
    BN nonNull();
    CS nullFlavor();
    BN isNull();
    BL notApplicable();
    BL unknown();
    BL other();
    BL equal(ANY x);
}
