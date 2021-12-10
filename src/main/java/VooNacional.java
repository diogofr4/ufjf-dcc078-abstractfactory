public class VooNacional extends Voo implements IVoo{

    public VooNacional(String origemCidade, String destinoCidade, Passageiro passageiro) {
        super("Brasil", "Brasil", origemCidade, destinoCidade, passageiro);
    }
}
