package project;

public interface Crypto {
//Holds the data in a byte array
	byte[] encrypt(byte[] data);
	
	byte[] decrypt(byte[] data);
	
	
}
