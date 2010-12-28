package jlr.hl7.datatypes.foundation;

public interface HIST<T extends ANY> extends LIST {

    HXIT<T> current();
    HXIT<T> earliest();
    HIST<T> exceptEarliest();
    HXIT<T> latest();
    HIST<T> exceptLatest();
//    HXIT<T> demotion();
}
