package model;

public class RivenditoreAutorizzato {
    private String name;
    private double conteggioBigliettiEmessi;

    // Getters and Setters

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getConteggioBigliettiEmessi(){
        return conteggioBigliettiEmessi;
    }

    public void setConteggioBigliettiEmessi(double conteggioBigliettiEmessi){
        this.conteggioBigliettiEmessi = conteggioBigliettiEmessi;
    }
}