

    // Interação Menú de Opção
    import java.util.Scanner;
    import package br.senai.project;

    public class Main { // Apertura a la clase principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Digite uma Opção no Menú!");
        System.out.println("1 - Reproducir");
        System.out.println("2 - Pausar Música");
        System.out.println("3 - Voltar Música");
        System.out.println("4 - Pular Música");
        System.out.println("5 - Sair");
        int opcao = sc.nextInt();


        if (opcao == 1) {
            System.out.println("Reproducir Música");
            tocar();
        } else if (opcao == 2) {
            System.out.println("Pausar Música");
            pausar();
        } else if (opcao == 3) {
            System.out.println("Voltar Música");
            voltarMusica();
        } else if (opcao == 4) {
            System.out.println("Pular Música");
            pularMusica();
        } else if (opcao == 5) {
            System.out.println("Sair");
            sair();
        }

        public static void tocar() {
            System.out.println("Ejecutando lógica: Tocar música...");
        }

        public static void pausar() {
            System.out.println("Música pausada");
        }

        public static void voltarMusica() {
            System.out.println("Regresando a la música anterior");
        }

        public static void pularMusica() {
            System.out.println("Saltando a la siguiente canción");
        }


    }

//
//        public static void
//        for (int i = 1; i <= 4; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
