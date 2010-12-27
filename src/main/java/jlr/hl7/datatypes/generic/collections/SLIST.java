package jlr.hl7.datatypes.generic.collections;

import jlr.hl7.datatypes.ANY;
import jlr.hl7.datatypes.basic.INT;
import jlr.hl7.datatypes.basic.QTY;

import javax.persistence.Table;

public interface SLIST<T extends ANY> extends LIST<T> {

    T origin();
    QTY scale();
    LIST<INT> digits();
}
