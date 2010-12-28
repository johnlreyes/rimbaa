package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.foundation.ANY;

public interface URL extends ANY {

    CS scheme();
    ST.SIMPLE address();
    ST.SIMPLE literal();
    URL canonical();
}
