package chainofresponsability;

import chainofresponsability.Funcionario;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoLivro.getTipoDocumentoLivro());
        listaDocumentos.add(TipoDocumentoArtigo.getTipoDocumentoArtigo());
        listaDocumentos.add(TipoDocumentoRevista.getTipoDocumentoRevista());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}