package chainofresponsability;

public class TipoDocumentoLivro implements TipoDocumento {

    private static TipoDocumentoLivro tipoDocumentoLivro = new TipoDocumentoLivro();

    private TipoDocumentoLivro() {};

    public static TipoDocumentoLivro getTipoDocumentoLivro() {
        return tipoDocumentoLivro;
    }
}

