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

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CryptoManagerTestStudent {
	CryptoManager cryptoManager;

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() 
	{
		assertTrue(CryptoManager.isStringInBounds("CRYPTO"));
		assertTrue(CryptoManager.isStringInBounds("\"ENCRYPTION\""));
		assertFalse(CryptoManager.isStringInBounds("crypto"));
		assertFalse(CryptoManager.isStringInBounds("{CRYPTO"));
		assertFalse(CryptoManager.isStringInBounds("\"THIS TEST THAT SHOULD FAIL BECAUSE { IS OUTSIDE THE RANGE\""));
	}

	@Test
	public void testEncryptCaesar() 
	{
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("bye", 3));
		assertEquals("DEF", CryptoManager.caesarEncryption("ABC", 3));
		assertEquals("Z", CryptoManager.caesarEncryption("W", 3));
		assertEquals("JKL", CryptoManager.caesarEncryption("GHI", 3));
		assertEquals("HIJKLMN", CryptoManager.caesarEncryption("ABCDEFG", 7));
		assertEquals("RSTU", CryptoManager.caesarEncryption("WXYZ", -5));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("ABC", CryptoManager.caesarDecryption("DEF", 3));
		assertEquals("W", CryptoManager.caesarDecryption("Z", 3));
		assertEquals("GHI", CryptoManager.caesarDecryption("JKL", 3));
		assertEquals("WXYZ", CryptoManager.caesarDecryption("RSTU", -5));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("IGOMQ", CryptoManager.bellasoEncryption("HELLO", "ABC"));
		assertEquals("H%TPSYX", CryptoManager.bellasoEncryption("EXAMPLE", "CMSC"));
		assertEquals("KN#S\\-_XPOXU", CryptoManager.bellasoEncryption("HAPPY LUMBER", "CMSC"));

	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("HELLO", CryptoManager.bellasoDecryption("IGOMQ", "ABC"));
		assertEquals("EXAMPLE", CryptoManager.bellasoDecryption("H%TPSYX", "CMSC"));
		assertEquals("HAPPY LUMBER", CryptoManager.bellasoDecryption("KN#S\\-_XPOXU", "CMSC"));

	}
}
