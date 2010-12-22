package jlr.hl7.datatypes;

public interface ANY {

    TYPE dataType();
    BN nonNull();
    CS nullFlavor();
    BN isNull();
    BL notApplicable();
    BL unknown();
    BL other();
    BL equal(ANY x);
}
