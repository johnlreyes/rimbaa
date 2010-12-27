package jlr.hl7.datatypes.timing.specification;

import jlr.hl7.datatypes.basic.BL;
import jlr.hl7.datatypes.basic.CS;
import jlr.hl7.datatypes.basic.ST;
import jlr.hl7.datatypes.generic.collections.IVL;
import jlr.hl7.datatypes.generic.collections.SET;

import javax.persistence.Table;

public interface PIVL extends SET<T> {

    T.diff period();
    IVL<T> phase();
    CS alignment();
    BL institutionSpecifiedTime();
    BL contains(TS x);
    ST literal();
}
