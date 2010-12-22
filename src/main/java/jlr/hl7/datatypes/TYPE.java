package jlr.hl7.datatypes;

import javax.validation.spi.ConfigurationState;

public interface TYPE extends ANY {

    CS shortName();
    CS longName();
    BN implies(TYPE that);
}
