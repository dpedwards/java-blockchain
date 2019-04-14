package com.dpedwards.blockchain;

// import java utils
import java.util.ArrayList;
import java.util.List;

   /**
    * TODO
    * 
    * @author Davain Pablo Edwards
    * @license MIT 
    * @version 1.0
    */
public class BlockChain {

	// Use an 'ArrayList' which is an implementation of the 'List' interface to define the blockchain (list)
	private List<Block> blockChain;
	
	/*
	 * Constructor
	 */
	public BlockChain() {
		this.blockChain = new ArrayList<>();
	}
	
	/*
	 * Method to add new block to the chain (blockchain)
	 *
	 *@param block
	 */
	public void addBlock(Block block) {
		this.blockChain.add(block);
	}
	
	/*
	 * Method to get blockchain (list)
	 * 
	 * @return blockChain
	 */
	public List<Block> getBlockChain() {
		return this.blockChain;
	}
	
	/*
	 * Method to return blockchain size 
	 * 
	 * @return blockChain.size
	 */
	public int size() {
		return this.blockChain.size();
	}
	
	/*
	 * Method to override string 
	 * 
	 * @return blockChain
	 */
	@Override
	public String toString() {
		
		String blockChain = "";
		
		for(Block block : this.blockChain)
			blockChain += block.toString() + "\n";
		
		return blockChain;
	}
	
}
