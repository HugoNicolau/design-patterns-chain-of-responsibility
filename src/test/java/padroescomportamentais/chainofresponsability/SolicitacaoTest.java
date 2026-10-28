package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolicitacaoTest {

    FuncionarioDono dono;
    FuncionarioGerente gerente;
    FuncionarioAtendente atendente;

    @BeforeEach
    void setUp() {
        dono = new FuncionarioDono(null);
        gerente = new FuncionarioGerente(dono);
        atendente = new FuncionarioAtendente(gerente);
    }

    @Test
    void deveRetornarAtendenteParaSolicitacaoTroca() {
        assertEquals("Atendente", atendente.resolverSolicitacao(new Solicitacao(TipoSolicitacaoTroca.getTipoSolicitacaoTroca())));
    }

    @Test
    void deveRetornarGerenteParaSolicitacaoReembolso() {
        assertEquals("Gerente", atendente.resolverSolicitacao(new Solicitacao(TipoSolicitacaoReembolso.getTipoSolicitacaoReembolso())));
    }

    @Test
    void deveRetornarDonoParaSolicitacaoParceria() {
        assertEquals("Dono", atendente.resolverSolicitacao(new Solicitacao(TipoSolicitacaoParceria.getTipoSolicitacaoParceria())));
    }

    @Test
    void deveRetornarSemResponsavelParaSolicitacaoFiado() {
        assertEquals("Sem responsável", atendente.resolverSolicitacao(new Solicitacao(TipoSolicitacaoFiado.getTipoSolicitacaoFiado())));
    }

    @Test
    void deveRetornarSemResponsavelParaSolicitacaoTrocaFeitaAoGerente() {
        assertEquals("Sem responsável", gerente.resolverSolicitacao(new Solicitacao(TipoSolicitacaoTroca.getTipoSolicitacaoTroca())));
    }

}
