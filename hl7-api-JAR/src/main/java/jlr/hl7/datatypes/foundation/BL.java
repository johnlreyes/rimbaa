package jlr.hl7.datatypes.foundation;

public interface BL extends ANY {

//    values(true,false)
    BL not();
    BL and(BL x);
    BL or(BL x);
    BL xor(BL x);
    BL implies(BL x);
//    ST.SIMPLE literal();

    interface BN extends BL {
    }
}
