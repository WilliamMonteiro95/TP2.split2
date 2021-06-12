package tp2.app;

import java.time.LocalDate;

public class EpassFuncionario extends EpassStandard implements TituloTransporte{

    public EpassFuncionario(DocumentoID documentoID, TipoDocumento tipoDocumento, LocalDate ddn, String nome, String email, double saldo, Titular titular, int pontos, int numeroViagem, String ChaveValida) {
        super(documentoID, tipoDocumento, ddn, nome, email, saldo, titular, pontos, numeroViagem, ChaveValida);
    }

    public EpassFuncionario(Titular titular, int pontos, int numeroViagem, String chaveValida) {
        super(titular, pontos, numeroViagem, chaveValida);
    }

    public EpassFuncionario(EpassStandard pass) {
        super(pass);
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
