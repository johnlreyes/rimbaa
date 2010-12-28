package jlr.hl7.datatypes.foundation;

public interface COMP<T extends ANY> {

    TYPE dataType();
    BL compare(T element1, T element2);
}
