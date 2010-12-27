package jlr.hl7.datatypes.basic;

public interface CO extends CV {

    BL lessOrEqual(CO o);
    BL lessThan(CO o);
    BL greaterThan(CO o);
    BL greaterOrEqual(CO o);
}
