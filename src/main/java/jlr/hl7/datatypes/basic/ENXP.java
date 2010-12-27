package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.generic.collections.SET;

public interface ENXP extends ST {

    CS type();
    SET<CS> qualifier();
}
