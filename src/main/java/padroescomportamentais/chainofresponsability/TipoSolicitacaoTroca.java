package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoTroca implements TipoSolicitacao {

    private static TipoSolicitacaoTroca tipoSolicitacaoTroca = new TipoSolicitacaoTroca();

    private TipoSolicitacaoTroca() {};

    public static TipoSolicitacaoTroca getTipoSolicitacaoTroca() {
        return tipoSolicitacaoTroca;
    }
}
