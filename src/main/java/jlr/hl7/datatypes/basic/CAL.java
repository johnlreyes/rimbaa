package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.generic.collections.SET;

public interface CAL extends SET<CLCY> {

    CS name();
    CLCY head();
    TS epoch();
}
