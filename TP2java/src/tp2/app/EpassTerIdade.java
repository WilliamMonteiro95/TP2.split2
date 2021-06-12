package tp2.app;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class EpassTerIdade extends  EpassStandard implements TituloTransporte
{
	private LocalDateTime horaIni;

	public LocalDateTime getHoraIni()
	{

		return horaIni;
	}

	public void setHoraIni(LocalDateTime horaIni)
	{

		this.horaIni = horaIni;
	}

	public EpassTerIdade(DocumentoID documentoID, TipoDocumento tipoDocumento, LocalDate ddn, String nome, String email, double saldo, Titular titular, int pontos, int numeroViagem, String ChaveValida, LocalDateTime horaIni) {
		super(documentoID, tipoDocumento, ddn, nome, email, saldo, titular, pontos, numeroViagem, ChaveValida);
		this.horaIni = horaIni;
	}

	public EpassTerIdade(Titular titular, int pontos, int numeroViagem, String chaveValida, LocalDateTime horaIni) {
		super(titular, pontos, numeroViagem, chaveValida);
		this.horaIni = horaIni;
	}

	public EpassTerIdade(EpassStandard pass, LocalDateTime horaIni) {
		super(pass);
		this.horaIni = horaIni;
	}

	@Override
	public void pagarViagem() {

		if(getSaldo() >= getPrecoViagem()){

            setSaldo(getSaldo() - getPrecoViagem());
            System.out.println("Pagamento realizado com sucesso");
       
        }
        else {
            System.out.println("Saldo insuficente!");
        }

	}

	@Override
	public boolean checkValidade() {
		return false;
	
	}

	@Override
	public boolean passarSaldo(EpassStandard outro, double valor) {
		

		if (getSaldo() > valor ){

            setSaldo(getSaldo() - valor);
            outro.setSaldo(getSaldo() +valor);

            return true;
        }

        else {
              return false;
        }
	}
}