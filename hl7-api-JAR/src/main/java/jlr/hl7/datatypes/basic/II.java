package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.foundation.ANY;
import jlr.hl7.datatypes.foundation.BL;

public interface II extends ANY {

    UID root();
    ST.SIMPLE extension();
    ST.NT identifierName();
    CS scope();
    CS reliability();
    BL displayable();
    ST.SIMPLE literal();
}
