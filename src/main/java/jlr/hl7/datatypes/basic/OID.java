package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.generic.collections.LIST;

public interface OID extends UID, LIST<INT> {

    INT leaf();
    OID butLeaf();
    OID value(OID namespace);
    ST literal();
}
