/*
 * 
 * 
 * 
 * 
 * 
 */
package io.mosip.kernel.security.bouncycastle.algorithm;

import org.bouncycastle.crypto.engines.DESEngine;

import io.mosip.kernel.security.bouncycastle.processor.SymmetricProcessor;

/**
 * DES Initialization for Mosip
 * 
 * @author Urvil Joshi
 * @since 1.0.0
 */
public class MosipDES extends SymmetricProcessor {
	/**
	 * Constructor for this class
	 */
	private MosipDES() {
	}

	/**
	 * DES Engine Initialization with PKCS7Padding
	 * 
	 * @param key  key for encryption/decryption
	 * @param data data for encryption/decryption
	 * @param mode if true process mode is Encrypt ,else process mode is Decrypt
	 * @return Processed array
	 */
	public static byte[] desWithCBCandPKCS7Padding(byte[] key, byte[] data, boolean mode) {
		return process(new DESEngine(), key, data, mode);
	}

}
