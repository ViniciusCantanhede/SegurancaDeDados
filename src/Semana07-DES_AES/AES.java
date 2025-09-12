import javax.crypto.Cipher;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Base64;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES {
    private static String encriptar(String texto, String chave)throws Exception {
        Cipher objCifra = Cipher.getInstance("AES/CBC/PKCS5Padding");  //Completa com 0 os blocos pequenos
        Key objChave = new SecretKeySpec(chave.getBytes("UTF-8"), "AES");
        IvParameterSpec objIv = new IvParameterSpec("Junior e bonitao".getBytes("UTF-8")); //O texto tem que ter 128 bits, esse é o Iv inicial
        objCifra.init(Cipher.ENCRYPT_MODE, objChave, objIv);
        byte[] temp = objCifra.doFinal(texto.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(temp);
    }

    private static String decriptar(String criptograma, String chave)throws Exception {
        Cipher objCifra = Cipher.getInstance("AES/CBC/PKCS5Padding");
        Key objChave =new SecretKeySpec(chave.getBytes("UTF-8"), "AES");
        IvParameterSpec objIv = new IvParameterSpec("Junior e bonitao".getBytes("UTF-8"));
        objCifra.init(Cipher.DECRYPT_MODE, objChave, objIv);
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
