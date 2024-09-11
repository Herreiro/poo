package src.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Utilitário para criptografar senhas utilizando o algoritmo SHA-256.
 * <p>
 * Esta classe fornece um método para criptografar senhas de forma segura usando o algoritmo de hash SHA-256.
 * O resultado é uma representação hexadecimal da senha criptografada.
 * </p>
 */
public class CriptografiaUtil {

    /**
     * Criptografa uma senha utilizando o algoritmo SHA-256.
     *
     * @param senha A senha a ser criptografada.
     * @return A senha criptografada em formato hexadecimal.
     */
    public static String criptografarSenha(String senha) {
        try {
            // Cria uma instância do MessageDigest para o algoritmo SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            
            // Gera o hash da senha em bytes
            byte[] hash = md.digest(senha.getBytes());
            
            // Converte o hash em uma representação hexadecimal
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            // Lança uma exceção em caso de erro na criação do MessageDigest
            throw new RuntimeException("Erro na criptografia da senha", e);
        }
    }
}
