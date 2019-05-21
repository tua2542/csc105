/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.cs.csc105.banking.utils;

import com.mysql.cj.protocol.Message;
import java.security.MessageDigest;

/**
 *
 * @author User
 */
public class PasswordEncrytion {
	public static void main(String[] args) throws Exception {
		byte [] rawData = "myPassword".getBytes("UTF-8");
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] digested = md.digest(rawData);
		for (int i = 0; i < digested.length; i++) {
			System.out.print(digested[i]);
		}
		
		
	}
}
