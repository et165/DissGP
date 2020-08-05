package project;

public class BasicCrypto implements Crypto {
 //The data will be encrypted through this method.
	@Override
	public byte[] encrypt(byte[] data) {
		
		byte[] enc = new byte[data.length];
		
		for (int i = 0; i <data.length; i++) {
			
			enc[i] = (byte) ((i % 2 == 0) ? data[i] + 1 : data[i] - 1);
			
		}
		
		//Returns the new string.
		return enc;
	}
	
	 //The data will be decrypted through this method.
	@Override
	public byte[] decrypt(byte[] data) {
		
	byte[] enc = new byte[data.length];
		
		for (int i = 0; i <data.length; i++) {
			
			enc[i] = (byte) ((i % 2 == 0) ? data[i] - 1 : data[i] + 1);
			
		}
		
		//returns decry value.
		return enc;
	}
	
}
