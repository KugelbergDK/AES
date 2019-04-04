public class Main {

    public static void main(String[] args) {
	    // write your code here

        String plainText = "This is a secret message!";

        AES aes = new AES("MyRe4llyStr0ngPassw@rd!");
        String encrypted = aes.encrypt(plainText);
        System.out.println("Encrypted:\t" + encrypted);

        // TIme to decrypt that fucker
        String decrypted = aes.decrypt(encrypted);
        System.out.println("Decrypted:\t" + decrypted);





    }
}
