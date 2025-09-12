package Semana02_CriptografiaXOR;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // declaração de variaveis
        BufferedReader leitor = new BufferedReader(
                new InputStreamReader(System.in));
        int opcao = 0;
        String mensagem = "";
        String senha = "";
        String cifra = "";

        //entrada de dados
        try {
            System.out.println("Digite <1> para encriptar ou" + "<2> para decriptar: ");
            opcao = Integer.parseInt(leitor.readLine());

            if (opcao == 1) {
                System.out.println("Digite a mensagem: ");
                mensagem = leitor.readLine();
            } else if (opcao == 2) {
                System.out.println("Digite a cifra: ");
                cifra = leitor.readLine();
            }
            System.out.println("Digite uma senha: ");
            senha = leitor.readLine();
        } catch (Exception erro) {
            System.out.println(erro);
        }

        //processamento
        if (opcao == 1) {
            cifra = encriptar(mensagem, senha);
            System.out.println(cifra);
        } else if (opcao == 2) {
            mensagem = decriptar(cifra, senha);
            System.out.println(mensagem);
        }
    }

    private static String encriptar(String mensagem, String senha) {
        String cifra = "";

        for (int i = 0 ; i < mensagem.length() ; i ++) {
            int letraMensagem = mensagem.charAt(i);
            int letraSenha = senha.charAt(i % senha.length());
            int letraCifra = (letraMensagem ^ letraSenha);
            String temp = Integer.toHexString(0xff & letraCifra);
            if (temp.length() == 1) temp = "0" + temp;
            cifra += temp;
        }


        return cifra;
    }
    private static String decriptar(String cifra, String senha) {
        String mensagem = "";

        for (int i = 0 ; i < cifra.length() ; i+=2) {
            int letraCifra = Integer.parseInt(cifra.substring(i, i + 2), 16);
            int letraSenha = senha.charAt((i / 2) % senha.length());
            int letraMensagem = (letraCifra ^ letraSenha);
            mensagem += ((char) letraMensagem);
        }

        return mensagem;
    }
}