package jlr.hl7.datatypes.foundation;

import jlr.hl7.datatypes.quantities.INT;
import java.util.Iterator;

public interface COLL<T extends ANY> extends ANY, Iterable<T> {

    BL isEmpty();
    BL notEmpty();
    INT count();
    BL contains(T item);
}
