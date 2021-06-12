package tp2.app;

public interface TituloTransporte {
    public void  carregar(double valor);
    public  void pagarViagem();
    public boolean checkValidade();
    public boolean  passarSaldo(EpassStandard outro, double valor);
}
