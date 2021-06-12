package tp2.app;
import java.time.LocalDate;


public class Titular{

    private  final DocumentoID docID;
    private  String nome;
    private String apelido;
    private LocalDate ddh;
    private  String morada;
    private  String email;
    private  int telef;

    public  Titular(String codigoDoc, TipoDocumento tipoDoc, String nome, LocalDate ddn, int telef)
    {
        this.docID = new DocumentoID(codigoDoc, tipoDoc);
        this.nome = nome;
        this.ddh = ddn;
        this.telef = telef;

    }

    public Titular(DocumentoID docID, String nome, LocalDate ddh, String morada, String email, int telef) {
        this.docID = docID;
        this.nome = nome;
        this.ddh = ddh;
        this.morada = morada;
        this.email = email;
        this.telef = telef;
    }

    public Titular(DocumentoID docID, String nome, LocalDate ddh, String email) {

        this.docID = docID;
        this.nome = nome;
        this.ddh = ddh;
        this.email = email;
    }

    public DocumentoID getDocID()
    {

        return docID;
    }

    public String getNome()
    {

        return nome;
    }
    public String getApelido()
    {

        return apelido;
    }

    public LocalDate getDdh() {
        return ddh;
    }

    public void setDdh(LocalDate ddh) {
        this.ddh = ddh;
    }

    public String getMorada()
    {

        return morada;
    }

    public void setMorada(String morada)
    {

        this.morada = morada;
    }

    public String getEmail()
    {

        return email;
    }

    public void setEmail(String email)
    {

        this.email = email;
    }

    public int getTelef()
    {

        return telef;
    }

    public void setTelef(int telef)
    {

        this.telef = telef;
    }

    public void setApelido(String apelido) {

        this.apelido = apelido;
    }
}
