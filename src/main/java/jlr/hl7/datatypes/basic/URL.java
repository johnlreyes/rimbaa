package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.ANY;

public interface URL extends ANY {

    CS scheme();
    ST address();
    ST literal();
}
