package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoParceria implements TipoSolicitacao {

    private static TipoSolicitacaoParceria tipoSolicitacaoParceria = new TipoSolicitacaoParceria();

    private TipoSolicitacaoParceria() {};

    public static TipoSolicitacaoParceria getTipoSolicitacaoParceria() {
        return tipoSolicitacaoParceria;
    }
}
