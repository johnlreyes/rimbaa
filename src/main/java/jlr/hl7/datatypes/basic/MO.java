package jlr.hl7.datatypes.basic;

public interface MO extends QTY {

    REAL value();
    CS currency();
    MO negated();
    MO times(REAL x);
    ST literal();
}
