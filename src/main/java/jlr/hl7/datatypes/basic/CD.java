package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.ANY;
import jlr.hl7.datatypes.generic.collections.LIST;
import jlr.hl7.datatypes.generic.collections.SET;

public interface CD extends ANY {

    ST code();
    ST displayName();
    UID codeSystem();
    ST codeSystemName();
    ST codeSystemVersion();
    ED originalText();
    LIST<CR> qualifier();
    SET<CD> translation();
    BL equal(ANY x);
    BL implies(CD x);
    ED demotion();
}
