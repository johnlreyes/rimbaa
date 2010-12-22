package jlr.hl7.datatypes;

public interface BL extends ANY {

    BL and(BL x);
    BL not();
    ST literal();
    BL or(BL x);
    BL xor(BL x);
    BL implies(BL x);
}
