package tp2.app;

public abstract class EpassTurista extends EpassSazonal implements TituloTransporte{

	private Duracao duracao;

    public EpassTurista(Duracao duracao) {

        this.duracao = duracao;
    }

    public Duracao getDuracao() {
        return duracao;
    }

    public void setDuracao(Duracao duracao) {

        this.duracao = duracao;

    }

    private void inSaldo(){
        
        if (dias == 1){
            setSaldo(500);
        }
        else if (dias == 3){
            setSaldo(700);
        }
        else if (dias == 7){
            setSaldo(1500);
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