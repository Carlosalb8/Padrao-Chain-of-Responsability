package Test;


import chainofresponsability.*;
import org.junit.Assert;
import org.junit.Test;

public class TesteFuncionario {

    @Test
    public void testAcessarDocumentoBibliotecario() {
        FuncionarioBibliotecario bibliotecario = new FuncionarioBibliotecario(null);
        Documento documentoLivro = new Documento(TipoDocumentoLivro.getTipoDocumentoLivro());
        Documento documentoArtigo = new Documento(TipoDocumentoArtigo.getTipoDocumentoArtigo());
        Documento documentoRevista = new Documento(TipoDocumentoRevista.getTipoDocumentoRevista());

        Assert.assertEquals("Bibliotecário pode acessar o documento.", bibliotecario.acessarDocumento(documentoLivro));
        Assert.assertEquals("Sem acesso ao documento.", bibliotecario.acessarDocumento(documentoArtigo));
        Assert.assertEquals("Sem acesso ao documento.", bibliotecario.acessarDocumento(documentoRevista));
    }

    @Test
    public void testAcessarDocumentoSupervisor() {
        FuncionarioSupervisor supervisor = new FuncionarioSupervisor(null);
        Documento documentoLivro = new Documento(TipoDocumentoLivro.getTipoDocumentoLivro());
        Documento documentoArtigo = new Documento(TipoDocumentoArtigo.getTipoDocumentoArtigo());
        Documento documentoRevista = new Documento(TipoDocumentoRevista.getTipoDocumentoRevista());

        Assert.assertEquals("Supervisor pode acessar o documento.", supervisor.acessarDocumento(documentoLivro));
        Assert.assertEquals("Supervisor pode acessar o documento.", supervisor.acessarDocumento(documentoArtigo));
        Assert.assertEquals("Sem acesso ao documento.", supervisor.acessarDocumento(documentoRevista));
    }

    @Test
    public void testAcessarDocumentoGerente() {
        FuncionarioGerente gerente = new FuncionarioGerente(null);
        Documento documentoLivro = new Documento(TipoDocumentoLivro.getTipoDocumentoLivro());
        Documento documentoArtigo = new Documento(TipoDocumentoArtigo.getTipoDocumentoArtigo());
        Documento documentoRevista = new Documento(TipoDocumentoRevista.getTipoDocumentoRevista());

        Assert.assertEquals("Gerente pode acessar o documento.", gerente.acessarDocumento(documentoLivro));
        Assert.assertEquals("Gerente pode acessar o documento.", gerente.acessarDocumento(documentoArtigo));
        Assert.assertEquals("Gerente pode acessar o documento.", gerente.acessarDocumento(documentoRevista));
    }

    @Test
    public void testAcessarDocumentoHierarquia() {
        FuncionarioBibliotecario bibliotecario = new FuncionarioBibliotecario(null);
        FuncionarioSupervisor supervisor = new FuncionarioSupervisor(bibliotecario);
        FuncionarioGerente gerente = new FuncionarioGerente(supervisor);

        Documento documentoLivro = new Documento(TipoDocumentoLivro.getTipoDocumentoLivro());
        Documento documentoArtigo = new Documento(TipoDocumentoArtigo.getTipoDocumentoArtigo());
        Documento documentoRevista = new Documento(TipoDocumentoRevista.getTipoDocumentoRevista());

        Assert.assertEquals("Bibliotecário pode acessar o documento.", bibliotecario.acessarDocumento(documentoLivro));
        Assert.assertEquals("Supervisor pode acessar o documento.", supervisor.acessarDocumento(documentoArtigo));
        Assert.assertEquals("Gerente pode acessar o documento.", gerente.acessarDocumento(documentoRevista));
    }
}

