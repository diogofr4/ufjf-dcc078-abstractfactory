public abstract class Voo implements IVoo{
    String origemPais;
    String destinoPais;
    String origemCidade;
    String destinoCidade;
    Passageiro passageiro;

    public Voo(String origemPais, String destinoPais, String origemCidade, String destinoCidade, Passageiro passageiro) {
        this.origemPais = origemPais;
        this.destinoPais = destinoPais;
        this.origemCidade = origemCidade;
        this.destinoCidade = destinoCidade;
        this.passageiro = passageiro;
    }

    public String getOrigemPais() {
        return origemPais;
    }

    public void setOrigemPais(String origemPais) {
        this.origemPais = origemPais;
    }

    public String getDestinoPais() {
        return destinoPais;
    }

    public void setDestinoPais(String destinoPais) {
        this.destinoPais = destinoPais;
    }

    public String getOrigemCidade() {
        return origemCidade;
    }

    public void setOrigemCidade(String origemCidade) {
        this.origemCidade = origemCidade;
    }

    public String getDestinoCidade() {
        return destinoCidade;
    }

    public void setDestinoCidade(String destinoCidade) {
        this.destinoCidade = destinoCidade;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    @Override
    public String emitirPassagem() {
        return "Voo{" +
                "origemPais='" + origemPais + '\'' +
                ", destinoPais='" + destinoPais + '\'' +
                ", origemCidade='" + origemCidade + '\'' +
                ", destinoCidade='" + destinoCidade + '\'' +
                ", passageiro=" + passageiro +
                '}';
    }
}
