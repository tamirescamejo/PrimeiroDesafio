import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] habitantes = new String[2];
        double[] salarios = new double[12];

        for (int y=0; y<100; y++){
       
        System.out.println("                  SEJA BEM VINDO A SIMCITY                    ");
        System.out.println("              SISTEMA DE CÁLCULO DE IMPOSTO                   ");
        System.out.println("                           MENU                               ");
        System.out.println("    =========================================================" );
        System.out.println("   |          Escolha uma das opção abaixo                   |");
		System.out.println("   |     1 -> Cadastrar habitante e profissão                |");
		System.out.println("   |     2 -> Exibir informações cadastradas                 |");
		System.out.println("   |     3 -> Cadastrar Salários do habitante                |");
		System.out.println("   |     4 -> Calcular imposto sobre o salário de cada mês   |");
		System.out.println("   |     5 -> Sair do sistema                                |");
		System.out.println("   =========================================================\n");

        int menu = leitor.nextInt();
        
        if (menu == 1){
           menu1 (habitantes);

       }else if (menu == 2){
             System.out.println(menu2(habitantes));

        } else if (menu == 3){
            menu3 (salarios);

        } else if (menu == 4){
            menu4 (salarios);
           
        } else if (menu == 5){
             System.out.println("Obrigada Volte Sempre!");
            System.exit(0);

        } else{
            System.out.println("ERRO");
            }
        }
    }

    public static void menu1(String[] habitantes){

        Scanner leitor = new Scanner(System.in);

        System.out.println("1 -> Cadastrar habitante e profissão");

        System.out.println("Digite seu nome: ");
        habitantes[0] = leitor.nextLine();

        System.out.println("Digite sua profissão: ");
        habitantes[1] = leitor.nextLine();

        System.out.println("Habitante cadastrado com sucesso");
    }

    public static String menu2(String[] habitantes){
        System.out.println("2 -> Exibir informações cadastradas");
        String cadastroHabitantes = "Habitante cadastrado: "+habitantes[0]+"\nProfissão cadastrada: "+habitantes[1];
        return cadastroHabitantes; 
    }

    public static void menu3(double[] salarios){
        Scanner leitor = new Scanner(System.in);

        System.out.println("3 -> Cadastrar Salários de habitantes");
        for(int i=0; i < salarios.length; i++){
            System.out.println("Digite o valor do salário no mês "+(i+1)+"º: ");
            salarios[i] = leitor.nextDouble();
        }
        System.out.println("Salários cadastrados com sucesso");
    }

    public static void menu4(double[] salarios) {
        
        System.out.println("4 -> Calcular imposto de cada Mês");
    
        for(int i=0; i < salarios.length; i++){
            System.out.println("No "+(i+1)+"º mês o valor foi de: ");

            if(salarios[i] <= 2000.00){
                System.out.println("Isento do imposto!");

            } else if (salarios[i] >= 2001.00 & salarios[i] <= 3000.00){
                double imposto = salarios[i] * 0.08;
                System.out.println(imposto);
                        
            } else if (salarios[i] >= 3001.00 & salarios[i] <= 4500.00){
                double imposto = salarios[i] * 0.18;
                System.out.println(imposto);

            } else if (salarios[i] > 4500.00){
                double imposto = salarios[i] * 0.28;
                System.out.println(imposto);

            } else {
                System.out.println("Erro");
        }
        
        }
    }  
}