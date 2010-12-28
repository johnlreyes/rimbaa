package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.foundation.*;

public interface CD extends ANY {

    ST.SIMPLE code();
    UID codeSystem();
    ST.NT codeSystemName();
    ST.SIMPLE codeSystemVersion();
    UID valueSet();
    ST.SIMPLE valueSetVersion();
    ST displayName();
    ED.TEXT originalText();
    DSET<CD, CEQ> translation();
    CD source();
    BL implies(CD x);

    interface CV extends CD {
    }
}
