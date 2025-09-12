import javax.crypto.Cipher;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Base64;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;


//Algoritmo totalmente quebrável. Apenas para fins academicos
public class DES {
    private static String encriptar(String texto, String chave)throws Exception {
        Cipher objCifra = Cipher.getInstance("TripleDES");
        Key objChave = new SecretKeySpec(chave.getBytes("UTF-8"), "TripleDES"); //Utilizando agora triple des
        objCifra.init(Cipher.ENCRYPT_MODE, objChave);
        byte[] temp = objCifra.doFinal(texto.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(temp);
    }

    private static String decriptar(String criptograma, String chave)throws Exception {
        Cipher objCifra = Cipher.getInstance("TripleDES");
        Key objChave =new SecretKeySpec(chave.getBytes("UTF-8"), "TripleDES");
        objCifra.init(Cipher.DECRYPT_MODE, objChave);
        byte[] temp = objCifra.doFinal(Base64.getDecoder().decode(criptograma));
        return new String(temp, "UTF-8");
    }

    public static void main(String[] args) {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        String texto = "";
        String chave = "";
        String criptograma = "";

        try {
            System.out.print("Digite o texto: ");
            texto = leitor.readLine();
            System.out.print("Digite a chave: ");
            chave = leitor.readLine();

            criptograma = encriptar(texto, chave);
            System.out.print(criptograma);
            System.out.println(decriptar(criptograma, chave));
        } catch (Exception erro) {
            System.out.println(erro);
        }
    }
}