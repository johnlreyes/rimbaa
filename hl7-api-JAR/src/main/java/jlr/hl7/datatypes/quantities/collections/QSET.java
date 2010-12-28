package jlr.hl7.datatypes.quantities.collections;

import jlr.hl7.datatypes.basic.ED;
import jlr.hl7.datatypes.foundation.BL;
import jlr.hl7.datatypes.foundation.CEQ;
import jlr.hl7.datatypes.foundation.LIST;
import jlr.hl7.datatypes.foundation.SET;
import jlr.hl7.datatypes.quantities.QTY;

public interface QSET<T extends QTY> extends SET<T, CEQ<T>> {

    IVL<T> hull();
    IVL<T> intervalAt(T x);
    IVL<T> intervalAtOrAfter(T x);
    IVL<T> intervalAfter(T x);
    BL interleaves(QSET<T> x);
    ED.TEXT originalText();
    LIST<IVL<T>> demotion();
}
