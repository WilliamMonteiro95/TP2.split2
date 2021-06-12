package tp2.app;
import java.time.LocalDate;


public abstract class EpassStandard extends EPass {

	private Titular titular;
	private int pontos = 0;
	private int numeroViagem = 0;
	private String chaveValida;

	
	public EpassStandard(DocumentoID documentoID, TipoDocumento tipoDocumento, LocalDate ddn, String nome, String email, double saldo, Titular titular, int pontos, int numeroViagem, String ChaveValida) {
		super(documentoID, tipoDocumento, ddn, nome, email, saldo);
		this.titular = titular;
		this.pontos = pontos;
		this.numeroViagem = numeroViagem;
		this.chaveValida = ChaveValida;
	}

	public EpassStandard(DocumentoID documentoID, LocalDate ddn, String nome, String email)

	{
		super();
		this.titular = new Titular(documentoID,nome,ddn,email);
		this.chaveValida = gerarchave(nome,codigo);
	}

	public EpassStandard(Titular titular, int pontos, int numeroViagem, String chaveValida) {
		this.titular = titular;
		this.pontos = pontos;
		this.numeroViagem = numeroViagem;
		this.chaveValida = chaveValida;
	}

	public EpassStandard(EpassStandard pass) {

	}

	public int getNumeroViagem()
	{
		return numeroViagem;
	}

	public void setNumeroViagem(int numeroViagem)
	{
		this.numeroViagem = numeroViagem;
	}

	public Titular getTitular()
	{
		return titular;
	}

	public int getPontos()
	{
		return pontos;
	}



public void pagarViagemComPontos(int numeroViagem){

        pontos = numeroViagem / 10 ;

       if (pontos >= 100){
            pontos -= 40;
            System.out.println("PAGAMENTO COM PONTOS REALIZADO COM SUCESSO!");
        }
        else {
            System.out.println("PONTOS INSUFICIENTE!");
       }

	}

	public String getChaveValida() {
		return chaveValida;
	}

	public void setChaveValida(String chaveValida) {

		this.chaveValida = chaveValida;
	}

	public String criarChave(String nome, LocalDate ddn, int codigo)
    {
            String nomeP,apelido;

            String[] array = nome.split(" ");
            nomeP = array[0];
            apelido= array[1];
            
            String x = nomeP.substring(0,5);
                
            String inverterX = new StringBuilder(x).reverse().toString();   
            String y = apelido.substring(apelido.length()-5);
            String inverterY = new StringBuilder(y).reverse().toString();
            String key = inverterX.concat(inverterY)+ddn+codigo;
            

            return key;

    }

   
}
