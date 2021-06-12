package tp2.ui;
//import tp2.EpassStandard;


import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Apass {

    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	String nome;
        int codigo;

    	System.out.println("Digita uma string: ");
        nome = ler.nextLine();
        System.out.println("Digita o codigo");
        codigo = ler.nextInt();

        System.out.println("Data de nascimento: ");
        String ddn = ler.umaString();

        LocalDate datanasc = null;

        DateTimeFormater formatter = DateTimeFormater.ofPattern("dd-MM-uuu");
        try
        {
           datanasc = LocalDate.parse(ddn,formatter);
        }
        catch(DataTimeParseExcepion e)
        {
            System.out.println("Deve inserir data no formato dia-mes-ano");
        }

        System.out.println("data nascimento eh  "+ datanasc.format(formatter));

        //DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-uuu");
        //datanasc = LocalDate.parse("10-06-2001",format);


        //Titular x = new Titular("123",TipoDocumento.BI,"William","15-03-2001",9849242);
        //EpassStudent p1 = new EpassStudent(123,20,"15-03-2001","12-08-2001");

        System.out.println(p1.criarChave(nome,codigo));



    }

    public static String criarChave(String nome, int codigo)
    {
            String nomeP,apelido;

            String[] array = nome.split(" ");
            nomeP = array[0];
            apelido= array[1];
            
            String x = nomeP.substring(0,5);
                
            String inverterX = new StringBuilder(x).reverse().toString();   
            String y = apelido.substring(apelido.length()-5);
            String inverterY = new StringBuilder(y).reverse().toString();
            String key = inverterX.concat(inverterY)+codigo;
            

         return key;

    }

}
