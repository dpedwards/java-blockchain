package com.dpedwards.blockchain;

   /**
    * Used to define miner 
    * 
    * @author Davain Pablo Edwards
    * @license MIT 
    * @version 1.0
    */
public class Miner {

	// Declare attribute
	private double reward;
	
	/*
	 * Method to generate hash values until find the right hash
	 * 
	 * @param block
	 * @param blockChain
	 */
	public void mine (Block block, BlockChain blockChain) {
		while (notGoldenHash(block)) {
			block.generateHash();
			block.incrementNonce();
		}
		
		System.out.println(block + " has just mined...");
		System.out.println("Hash is: " + block.getHash());
		
		blockChain.addBlock(block);
		reward += Constants.MINER_REWARD;
	}
	
	/*
	 * Method to return the golden hatch with the right amount of leading zeros
	 * Maybe if the difficulty is set to the value 5 in the constants class, 5 leading zeros will return 
	 *
	 *@return leadingZeros
	 */
	public boolean notGoldenHash(Block block) {
		String leadingZeros = new String(new char[Constants.DIFFICULTY]).replace('\0', '0'); 
		return !block.getHash().substring(0,Constants.DIFFICULTY).equals(leadingZeros);
	}
	
	/*
	 * Method to get reward
	 * 
	 * @return reward
	 */
	public double getReward() {
		return this.reward;
	}
	
}
