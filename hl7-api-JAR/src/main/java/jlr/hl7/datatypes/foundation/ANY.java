package jlr.hl7.datatypes.foundation;

import jlr.hl7.datatypes.basic.CS;

public interface ANY {

    TYPE dataType();
    CS nullFlavor();
    BL.BN nonNull();
    BL.BN isNull();
    BL notApplicable();
    BL unknown();
    BL other();
    BL equal(ANY x);
//    protected BN identical();
}
