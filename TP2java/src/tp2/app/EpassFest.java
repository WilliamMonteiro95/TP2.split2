package tp2.app;


public abstract class EpassFest extends EpassSazonal implements TituloTransporte,CartaoPagamento {

	private double saldoCartaoPgmt;
	private String nomeEvento;

	public EpassFest(double saldoCartaoPgmt, String nomeEvento)
	{
		this.nomeEvento = nomeEvento;
		this.saldoCartaoPgmt = saldoCartaoPgmt;
	}

	public EpassFest(EpassFest outro)
	{
		this.nomeEvento = outro.nomeEvento;
		this.saldoCartaoPgmt = outro.saldoCartaoPgmt;
	}

	public double getSaldoCartaoPgmt()
	{

		return saldoCartaoPgmt;
	}
	public void setSaldoCataoPgmt(double saldoCartaoPgmt)
	{

		this.saldoCartaoPgmt = saldoCartaoPgmt;
	}

	public String getNomeEvento()
	{

		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento)
	{

		this.nomeEvento = nomeEvento;
	}

	public boolean pagar(double valor)
	{
		if(getSaldoCartaoPgmt()>= valor){
            setSaldoCartaoPgmt(saldoCartaoPgmt-= valor);
            return true;
        }
        else {
            return false;
        }
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
