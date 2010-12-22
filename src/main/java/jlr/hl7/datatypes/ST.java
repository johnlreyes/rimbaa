package jlr.hl7.datatypes;

import org.aopalliance.intercept.Interceptor;

public interface ST extends ED {

    INT length();
    ST headCharacter();
    ST tailString();
}
