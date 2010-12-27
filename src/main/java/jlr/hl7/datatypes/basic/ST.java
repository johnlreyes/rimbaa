package jlr.hl7.datatypes.basic;

public interface ST extends ED {

    INT length();
    ST headCharacter();
    ST tailString();
}
