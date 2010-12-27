package jlr.hl7.datatypes.basic;

public interface RTO<N extends QTY, D extends QTY> extends QTY {

    N numerator();
    D denominator();
    REAL demotion();
    PQ demotion();
}
