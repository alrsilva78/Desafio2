package model;

public abstract class DadosConsultaString {

    private String frase;

    public DadosConsultaString (String frase){
        this.frase = frase;

    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

}
