package jlr.hl7.datatypes.basic;

public interface REAL extends QTY {

    REAL negated();
    REAL times(REAL x);
    REAL inverted();
    BL isOne();
    REAL power(REAL x);
    ST literal();
    INT precision();
    INT demotion();
    REAL promotion(INT x);
    PQ promotion();
    RTO promotion();
}
