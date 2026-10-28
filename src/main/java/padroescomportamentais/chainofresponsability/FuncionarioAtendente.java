package padroescomportamentais.chainofresponsability;

public class FuncionarioAtendente extends Funcionario {

    public FuncionarioAtendente(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoTroca.getTipoSolicitacaoTroca());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente";
    }
}
