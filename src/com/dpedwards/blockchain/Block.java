package com.dpedwards.blockchain;

import java.util.Date; // import java util

   /**
    * Used to define block
    * 
    * @author Davain Pablo Edwards
    * @license MIT 
    * @version 1.0
    */
public class Block {

	// Declare attributes 
	private int id;
	private int nonce;
	private long timeStamp;
	private String hash;
	private String previousHash;
	private String transaction;
	
	
	/*
	 * Constructor initializes parameters and calls generateHash() void method
	 * 
	 * @param id
	 * @param transaction
	 * @param previousHash
	 */
	public Block (int id, String transaction, String previousHash)
	{
		this.id = id;
		this.transaction = transaction;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		generateHash();
	}
	
	/*
	 * Method to generate hashes
	 */
	public void generateHash() {
		String dataToHash = Integer.toString(id) + previousHash + Long.toString(timeStamp) + Integer.toString(nonce) + transaction.toString(); 
		String hashValue = SHA256Helper.generateHash(dataToHash);
		this.hash = hashValue;
	}
	
	/*
	 * Getter method to get hash
	 * 
	 * @return hash
	 */
	public String getHash() {
		return this.hash;
	}
	
	/*
	 * Setter method to set hash
	 * 
	 * @param hash
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}
	
	/*
	 * Getter method to get previous hash
	 * 
	 * @return previousHash
	 */
	public String getPreviousHash() {
		return this.previousHash;
	}
	
	/*
	 * Setter method to set previous hash 
	 * 
	 * @param previousHash
	 */
	public void setPreviousHash(String previousHash) {
		this.previousHash = previousHash;
	}
	
	/*
	 * Method to increment if a minor gets a given block and it tries to find the hash value 
	 */
	public void incrementNonce() {
		this.nonce++;
	}
	
	/*
	 * Method to override string  
	 * 
	 * @return id + transaction + hash + previousHash 
	 */
	@Override 
	public String toString() {
		return this.id + "-" + this.transaction + "-" + this.hash + "-" + "this.previousHash" + "-";
	}
	 
	

	
}
