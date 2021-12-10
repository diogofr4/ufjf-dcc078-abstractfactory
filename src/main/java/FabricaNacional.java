public class FabricaNacional implements IFabricaAbstrata{
    @Override
    public IDocumento criaDocumentacao() {
        return new DocumentoNacional();
    }

    @Override
    public IVoo criaVoo(String origemPais, String destinoPais, String origemCidade, String destinoCidade, Passageiro passageiro) {
        return new VooNacional(origemCidade, destinoCidade, passageiro);
    }
}
