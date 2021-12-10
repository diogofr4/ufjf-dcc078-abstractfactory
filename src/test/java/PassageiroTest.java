import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassageiroTest {

    @Test
    void deveEmitirPassagemNacional(){
        IFabricaAbstrata fabrica = new FabricaNacional();
        Passageiro passageiro = new Passageiro(fabrica, "Pessoa", "Brasil", "Brasil", "Rio de Janeiro", "São Paulo");
        passageiro.getDocumento().setTipo("Cpf");
        passageiro.getDocumento().setIdentificacao("000.000.000-00");

        assertEquals("Voo{origemPais='Brasil', destinoPais='Brasil', origemCidade='Rio de Janeiro', destinoCidade='São Paulo', passageiro=Passageiro{documento=Documento{tipo='Cpf', identificacao='000.000.000-00'}, nome='Pessoa'}}", passageiro.obterPassagem());
    }

    @Test
    void deveinformarDocumentoNecessarioNacional(){
        IFabricaAbstrata fabrica = new FabricaNacional();
        Passageiro passageiro = new Passageiro(fabrica, "Pessoa", "Brasil", "Brasil", "Rio de Janeiro", "São Paulo");

        assertEquals("Necessário cpf", passageiro.informarDocumentosNecessarios());
    }

    @Test
    void deveEmitirPassagemInternacional(){
        IFabricaAbstrata fabrica = new FabricaInternacional();
        Passageiro passageiro = new Passageiro(fabrica, "Pessoa", "Brasil", "Alemanha", "Rio de Janeiro", "Munster");
        passageiro.getDocumento().setTipo("Passaporte");
        passageiro.getDocumento().setIdentificacao("XXXX");

        assertEquals("Voo{origemPais='Brasil', destinoPais='Alemanha', origemCidade='Rio de Janeiro', destinoCidade='Munster', passageiro=Passageiro{documento=Documento{tipo='Passaporte', identificacao='XXXX'}, nome='Pessoa'}}", passageiro.obterPassagem());
    }

    @Test
    void deveinformarDocumentoNecessarioInternacional(){
        IFabricaAbstrata fabrica = new FabricaInternacional();
        Passageiro passageiro = new Passageiro(fabrica, "Pessoa", "Brasil", "Alemanha", "Rio de Janeiro", "Munster");

        assertEquals("Necessário Passaporte", passageiro.informarDocumentosNecessarios());
    }

}