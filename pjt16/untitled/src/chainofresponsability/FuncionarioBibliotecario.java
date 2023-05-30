package chainofresponsability;

import chainofresponsability.Funcionario;

public class FuncionarioBibliotecario extends Funcionario {

    public FuncionarioBibliotecario(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoLivro.getTipoDocumentoLivro());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Bibliotecário";
    }
}