package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.foundation.LIST;
import jlr.hl7.datatypes.quantities.INT;

public interface OID extends UID, LIST<INT> {

    INT leaf();
    OID butLeaf();
    OID value(OID namespace);
    ST.SIMPLE literal();
}
