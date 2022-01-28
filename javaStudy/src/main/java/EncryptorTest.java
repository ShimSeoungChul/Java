import org.junit.Test;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EncryptorTest {

    @Test
    public void 암호화하고복호화하면_복호하된것은원본과같다() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        String encryptionKeyString = "thisisa128bitkey";
        String originalMessage = "암호화 메시지 입니다.";
        byte[] encryptionKeyBytes = encryptionKeyString.getBytes(StandardCharsets.UTF_8);

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKey secretKey = new SecretKeySpec(encryptionKeyBytes, "AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] encrpyedMessageBytes = cipher.doFinal(originalMessage.getBytes());


        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedMessageBytes = cipher.doFinal(encrpyedMessageBytes);
        assert(originalMessage).equals(new String(decryptedMessageBytes));

    }

}