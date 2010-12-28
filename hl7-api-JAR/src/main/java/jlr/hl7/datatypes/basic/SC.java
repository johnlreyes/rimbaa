package jlr.hl7.datatypes.basic;

public interface SC extends ST {

    CD.CV code();
    SC promotion(ST x);

    interface NT extends SC {
    }
}
