/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: This Java Project explores utilizing Cipher Methods, specifically the Caesar and Bellaro cipher Methods.
 * Caesar Methods utilizes shifting characters by an specific amount, an Bellaro method
 * utilizes a keyword for offsets. The program should encrypt and decrypt specific phrases or words overall.
 * Due: 03/19/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Inshaal Chaudhury
*/

public class CryptoManager 
{
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	
	public static boolean isStringInBounds (String plainText) 
	{
		int size = plainText.length();
		for (int i = 0; i < size; i++)
		{
			if (plainText.charAt(i) < LOWER_RANGE || plainText.charAt(i) > UPPER_RANGE)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	
	public static String caesarEncryption(String plainText, int key) 
	{
	    if (!isStringInBounds(plainText)) 
	    {
	        return "The selected string is not in bounds, Try again.";
	    }
		
	    key %= RANGE;
		String encrypt = "";
		
		int SIZE = plainText.length();
		
		for (int i = 0; i < SIZE; i++)
		{
			int encryptChar = (int)plainText.charAt(i) + key;
			
			while (encryptChar > UPPER_RANGE)
			{
				encryptChar -= RANGE;
			}
			encrypt += (char)encryptChar;
		}
		
		return encrypt;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	
	public static String bellasoEncryption (String plainText, String bellasoStr) 
	{
		String encrypt = "";
		
		int SIZE = plainText.length();
		
		for (int i = 0; i < SIZE; i++)
		{
			int keyIndex = i % bellasoStr.length();
			int encryptChar = plainText.charAt(i) + bellasoStr.charAt(keyIndex);
			
			while (encryptChar > UPPER_RANGE)
			{
				encryptChar -= RANGE;
			}
			encrypt += (char)encryptChar;
			
		}
		return encrypt;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	
	public static String caesarDecryption (String encryptedText, int key) 
	{
		key %= RANGE;
		String decrypt = "";
		
		int SIZE = encryptedText.length();
		
		for (int i = 0; i < SIZE; i++) {
			int decryptChar = (char)(encryptedText.charAt(i) - key);
			while (decryptChar < LOWER_RANGE) {
				decryptChar += RANGE;
			}
			decrypt += (char)decryptChar;
		}
		return decrypt;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	
	public static String bellasoDecryption(String encryptedText, String bellasoStr) 
	{
		String decrypt = "";
		int SIZE = encryptedText.length();
		
		for (int i = 0; i < SIZE; i++)
		{
			int keyIndex = i % bellasoStr.length();
			int decryptChar = encryptedText.charAt(i) - bellasoStr.charAt(keyIndex);
			
			while (decryptChar < LOWER_RANGE)
			{
				decryptChar += RANGE;
			}
			
			decrypt += (char)decryptChar;
		}
		return decrypt;
	}
}