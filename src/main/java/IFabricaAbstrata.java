public interface IFabricaAbstrata {
    IDocumento criaDocumentacao();
    IVoo criaVoo(String origemPais, String destinoPais, String origemCidade, String destinoCidade, Passageiro passageiro);
}
