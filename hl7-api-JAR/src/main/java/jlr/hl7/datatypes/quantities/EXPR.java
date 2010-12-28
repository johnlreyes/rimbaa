package jlr.hl7.datatypes.quantities;

import jlr.hl7.datatypes.basic.ED;

public interface EXPR<T extends QTY> {

    ED expression();
    EXPR<T> evaluate();
}
