package jlr.hl7.datatypes.basic;

public interface TN extends EN {

    ST demotion();
    TN promotion(ST x);
}
