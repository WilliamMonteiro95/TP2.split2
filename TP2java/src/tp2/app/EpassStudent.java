package tp2.app;

import java.util.ArrayList;

public class EpassStudent extends  EpassStandard implements TituloTransporte {
	private int ano;
	private String escola;
	private ArrayList<Zona> zona;
	private final double precoViagem = 20;
    private int viagensFree = 4;

	public EpassStudent(Titular titular, int pontos, int numeroViagem, String chaveValida, int ano, String escola) {
		super(titular, pontos, numeroViagem, chaveValida);
		this.ano = ano;
		this.escola = escola;
	}

	//public EpassStudent( int ano, String escola) {

		//this.ano = ano;
		//this.escola = escola;
	//}

	public void EpassStudent(EpassStudent outro) {

		this.ano = outro.ano;
		this.escola = outro.escola;
		this.zona = outro.zona;
	}

	public EpassStudent(Titular titular, int pontos, int numeroViagem, String chaveValida, int ano, String escola, ArrayList<Zona> zona, int viagensFree) {
		super(titular, pontos, numeroViagem, chaveValida);
		this.ano = ano;
		this.escola = escola;
		this.zona = zona;
		this.viagensFree = viagensFree;
		this.chaveValida= chaveValida;
	}

	public int getAno()
	{

		return ano;
	}
	public void setAno(int  ano)
	{

		this.ano = ano;
	}
	public String getEscola()
	{

		return escola;
	}
	public void setEscola(String escola)
	{

		this.escola = escola;
	}

	public ArrayList<Zona> getZona() {
		return zona;
	}

	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}



	public int getViagensFree() {
		return viagensFree;
	}

	public void setViagensFree() {

		this.viagensFree = viagensFree;
	}
	public double getPrecoViagem()
	{
		return precoViagem;
	}
	public double getSaldo()
	{
		return Saldo;
	}
	public void setSaldo()
	{
		this.Saldo = Saldo;
	}

	@Override
	public void carregar(double valor) {

		setSaldo(getSaldo() + valor);
        System.out.println("passe carregado com o valor de "+valor+" escudos");
   

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
