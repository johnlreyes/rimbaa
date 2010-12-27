package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.ANY;

public interface CR extends ANY {

    CV name();
    BN inverted();
    CD value();
}
