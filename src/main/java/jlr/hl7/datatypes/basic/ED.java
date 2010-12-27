package jlr.hl7.datatypes.basic;

import jlr.hl7.datatypes.ANY;
import jlr.hl7.datatypes.basic.BIN;

import javax.persistence.TupleElement;

public interface ED extends BIN {

    CS mediaType();
    CS charset();
    CS language();
    CS compression();
    TEL reference();
    BIN integrityCheck();
    CS integrityCheckAlgorithm();
    ED thumbnail();
    BL equal(ANY x);
}
