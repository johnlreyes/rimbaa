package jlr.hl7.datatypes.foundation;

import jlr.hl7.datatypes.basic.II;
import jlr.hl7.datatypes.quantities.TS;
import jlr.hl7.datatypes.quantities.collections.IVL;

public interface HXIT<T extends ANY> {

    IVL<TS> validTime();
    BL comesBefore(HXIT<T> t);
    II controlActIdRef();
}
