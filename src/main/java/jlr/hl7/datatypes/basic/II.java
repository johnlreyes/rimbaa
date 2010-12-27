package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.ANY;

public interface II extends ANY {

    ST extension();
    UID root();
    ST assigningAuthorityName();
    BL equal(ANY x);
}
