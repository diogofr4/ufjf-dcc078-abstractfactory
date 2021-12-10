public class Passageiro {
    private IDocumento documento;
    private IVoo voo;
    private String nome;

    public Passageiro(IFabricaAbstrata fabrica, String nome, String origemPais, String destinoPais, String origemCidade, String destinoCidade) {
        this.documento = fabrica.criaDocumentacao();
        this.nome = nome;
        this.voo = fabrica.criaVoo(origemPais, destinoPais, origemCidade, destinoCidade, this);
    }

    public String informarDocumentosNecessarios(){
        return this.documento.informarDocumentoNecessario();
    }

    public String obterPassagem(){
        return  this.voo.emitirPassagem();
    }

    public Documento getDocumento() {
        return (Documento) documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "documento=" + documento +
                ", nome='" + nome + '\'' +
                '}';
    }
}
