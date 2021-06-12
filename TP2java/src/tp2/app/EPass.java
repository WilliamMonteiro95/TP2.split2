package tp2.app;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class EPass{
    private final long codigo;
    private double saldo;
    private  double precoViagem;
    private final LocalDateTime emissao;
    private LocalDate carregamento;
    private LocalDate validade;
    private  static  long ultCodigo;

    static {

        if(Long.valueOf(ultCodigo)== null)
            ultCodigo = 0;
    }

    public EPass( double saldo, double precoViagem, LocalDateTime emissao, LocalDate carregamento, LocalDate validade) {
        this.codigo = ultCodigo +1;
        this.saldo = saldo;
        this.precoViagem = precoViagem;
        this.emissao = emissao;
        this.carregamento = carregamento;
        this.validade = validade;

    }
    public EPass(DocumentoID documentoID, TipoDocumento tipoDocumento, LocalDate ddn, String nome, String email, double saldo)
    {
        this.saldo = saldo;
        this.codigo = ultCodigo +1;
        this.emissao = LocalDateTime.now();
    }

    public  EPass()
    {
        this.codigo = ultCodigo +1;
        this.emissao = LocalDateTime.now();
        ultCodigo ++;
    }

    public double getPrecoViagem()
    {
        return precoViagem;
    }

    public void setPrecoViagem(double precoViagem) {

        this.precoViagem = precoViagem;
    }

    public LocalDate getCarregamento() {

        return carregamento;
    }

    public double getSaldo()
    {

        return saldo;
    }

    public void setCarregamento(LocalDate carregamento)
    {

        this.carregamento = carregamento;
    }

    public void setValidade(LocalDate validade)
    {

        this.validade = validade;
    }

    public LocalDate getValidade()
    {

        return validade;
    }

    public void setSalario(double saldo)
    {

        this.saldo = saldo;
    }

    public long getCodigo()
    {

        return codigo;
    }
}
