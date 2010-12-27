package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.ANY;

public interface TS extends QTY {

    PQ offset();
    CS calendar();
    INT precision();
    PQ timezone();
    BL equal(ANY x);
    ST literal();
}
