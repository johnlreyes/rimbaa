package jlr.hl7.datatypes.basic;

public interface UUID extends UID {

    INT timeLow();
    INT timeMid();
    INT timeHighAndVersion();
    INT clockSequence();
    INT node();
}
