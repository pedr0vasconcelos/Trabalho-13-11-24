package model;

public class BichinhoVirtual {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean vivo;
    private int calorias;
    private int forca;

    public BichinhoVirtual(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.vivo = true;
        this.calorias = 10;
        this.forca = 10;
    }

    // Getters e Setters para os atributos
    public String getNome() { return nome; }
    public boolean isVivo() { return vivo; }
    public void setVivo(boolean vivo) { this.vivo = vivo; }
    public int getCalorias() { return calorias; }
    public void setCalorias(int calorias) { this.calorias = calorias; }
    public int getForca() { return forca; }
    public void setForca(int forca) { this.forca = forca; }
}
