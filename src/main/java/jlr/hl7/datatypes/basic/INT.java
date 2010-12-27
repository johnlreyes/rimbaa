package jlr.hl7.datatypes.basic;

public interface INT extends QTY {

    INT successor();
    INT times(INT x);
    INT predecessor();
    INT negated();
    BL isNegative();
    BL nonNegative();
    INT dividedBy(INT x);
    INT remainder(INT x);
    BL isOne();
    ST literal();
}
