package jlr.hl7.datatypes.foundation;

import jlr.hl7.datatypes.basic.ST;

public interface DSET<T extends ANY, C extends CEQ> extends SET<T, C> {

//    ST.SIMPLE literal();
    DSET<T, C> promotion(T x);
}
