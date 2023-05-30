package chainofresponsability;

import chainofresponsability.Funcionario;

public class FuncionarioSupervisor extends Funcionario {

    public FuncionarioSupervisor(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoLivro.getTipoDocumentoLivro());
        listaDocumentos.add(TipoDocumentoArtigo.getTipoDocumentoArtigo());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Supervisor";
    }
}