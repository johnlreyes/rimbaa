package jlr.hl7.datatypes;

public interface LIST<T extends ANY> extends ANY {

    T head();
    LIST<T> tail();
    BL isEmpty();
    BL notEmpty();
    T item(INT index);
    BL contains(T item);
    INT length();
    ST literal();
    LIST<T> promotion(T x);
}
