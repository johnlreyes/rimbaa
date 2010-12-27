package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.generic.collections.SET;

public interface CE extends CD {

    ST code();
    UID codeSystem();
    ST codeSystemName();
    ST codeSystemVersion();
    ST displayName();
    ED originalText();
    SET<CD> translation();
}
