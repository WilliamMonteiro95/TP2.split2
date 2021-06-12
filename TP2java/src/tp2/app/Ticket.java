package tp2.app;
import java.time.LocalDate;
public class Ticket extends EpassFest{

	private String nome;
	private int numero;
	private LocalDate data;

	public int getNumero()
	{
		return numero;
	}
	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public LocalDate getData()
	{
		return data;
	}

	public void setData(LocalDate data)
	{
		this.data = data;
	}

	public Ticket(String nome, int numero, LocalDate data)
	{
		this.nome = nome;
		this.numero = numero;
		this.data = data;
	}

}