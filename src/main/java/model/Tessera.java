package model;

public class Tessera {
    private String nomePasseggero;
    private boolean isValid;

    // getter e setter

    public String getNomePasseggero(){
        return nomePasseggero;
    }

    public void setNomePasseggero(String nomePasseggero) {
        this.nomePasseggero = nomePasseggero;
    }

    public boolean getIsValid(){
        return isValid;
    }

    public void setIsValid(boolean isValid){
        this.isValid = isValid;
    }
}