package chainofresponsability;

public class TipoDocumentoArtigo implements TipoDocumento {

    private static TipoDocumentoArtigo tipoDocumentoArtigo = new TipoDocumentoArtigo();

    private TipoDocumentoArtigo() {};

    public static TipoDocumentoArtigo getTipoDocumentoArtigo() {
        return tipoDocumentoArtigo;
    }
}
