package padroescomportamentais.chainofresponsability;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoReembolso.getTipoSolicitacaoReembolso());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}
