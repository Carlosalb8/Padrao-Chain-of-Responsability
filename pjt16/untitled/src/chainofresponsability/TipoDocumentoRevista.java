package chainofresponsability;

public class TipoDocumentoRevista implements TipoDocumento {

    private static TipoDocumentoRevista tipoDocumentoRevista = new TipoDocumentoRevista();

    private TipoDocumentoRevista() {};

    public static TipoDocumentoRevista getTipoDocumentoRevista() {
        return tipoDocumentoRevista;
    }
}