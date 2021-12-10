public abstract class Documento implements IDocumento{
    String tipo;
    String identificacao;

    public Documento() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "tipo='" + tipo + '\'' +
                ", identificacao='" + identificacao + '\'' +
                '}';
    }
}
