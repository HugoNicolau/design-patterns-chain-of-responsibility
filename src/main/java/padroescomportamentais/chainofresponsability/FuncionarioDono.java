package padroescomportamentais.chainofresponsability;

public class FuncionarioDono extends Funcionario {

    public FuncionarioDono(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoParceria.getTipoSolicitacaoParceria());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Dono";
    }
}
