public class FabricaInternacional implements IFabricaAbstrata{
    @Override
    public IDocumento criaDocumentacao() {
        return new DocumentoInternacional();
    }

    @Override
    public IVoo criaVoo(String origemPais, String destinoPais, String origemCidade, String destinoCidade, Passageiro passageiro) {
        return new VooInternacional(origemPais, destinoPais, origemCidade, destinoCidade, passageiro);
    }
}
