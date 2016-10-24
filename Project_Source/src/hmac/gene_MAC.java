package hmac;

import javax.crypto.*;
import java.io.*;
public class gene_MAC {
	public void  code (String Paintext,String path ) throws Exception {

//"D:\\mac_key.txt"
		KeyGenerator keygen = KeyGenerator.getInstance("HmacMD5");
	    SecretKey macKey = keygen.generateKey();
	    
	    byte[] keyBytes = macKey.getEncoded();
	    
            try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path+"\\mac_key.txt"))) {
                out.write(keyBytes);
                out.flush();
                out.close();
            }
        
	    Mac theMac = Mac.getInstance("HmacMD5");
	    theMac.init(macKey);
        
          
                
                    byte[] plaintextBytes = Paintext.getBytes();
                  
                    theMac.update(plaintextBytes);
           
                    
                      try (BufferedOutputStream out1 = new BufferedOutputStream(new FileOutputStream(path+"\\message.txt"))) {
                out1.write(plaintextBytes);
                out1.flush();
                out1.close();
            }
                    
        
        BufferedOutputStream macData;
            macData = new BufferedOutputStream(new FileOutputStream(path+"\\sender_mac_data.txt"));
        macData.write(theMac.doFinal());
        macData.flush();
        macData.close();
        
        theMac.reset();

	} // main


} // class MACFileExample
