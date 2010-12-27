package jlr.hl7.datatypes.basic;

public interface CV extends CE {

    ST code();
    UID codeSystem();
    ST codeSystemName();
    ST codeSystemVersion();
    ST displayName();
    ED originalText();
}
