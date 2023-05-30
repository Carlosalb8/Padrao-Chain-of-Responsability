package chainofresponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList<TipoDocumento> listaDocumentos = new ArrayList<>();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String acessarDocumento(Documento documento) {
        if (listaDocumentos.contains(documento.getTipoDocumento())) {
            return getDescricaoCargo() + " pode acessar o documento.";
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.acessarDocumento(documento);
            }
            else {
                return "Sem acesso ao documento.";
            }
        }
    }
}
