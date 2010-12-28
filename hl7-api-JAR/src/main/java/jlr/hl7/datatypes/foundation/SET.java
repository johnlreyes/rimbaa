package jlr.hl7.datatypes.foundation;

import jlr.hl7.datatypes.quantities.INT;

public interface SET<T extends ANY, C extends CEQ> extends ANY {

    C comparator();
    BL contains(T element);
    BL contains(SET<T, C> subset);
    BL isEmpty();
    BL notEmpty();
    INT cardinality();
    SET<T, C> union(SET<T, C> otherset);
    SET<T, C> union(T element);
    SET<T, C> except(T element);
    SET<T, C> except(SET<T, C> otherset);
    SET<T, C> intersection(SET<T, C> otherset);
}
