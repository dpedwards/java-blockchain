package com.dpedwards.blockchain;

   /**
    * Used to define tests for mining and creating transactions
    * 
    * @author Davain Pablo Edwards
    * @license MIT 
    * @version 1.0
    */
public class App {

	public static void main(String[] ags) {
	
	BlockChain blockChain = new BlockChain();
	Miner miner = new Miner();
	
	Block block0 = new Block(0,"transaction1",Constants.GENESIS_PREV_HASH);
	miner.mine(block0, blockChain);
	
	Block block1 = new Block(1,"transaction2",blockChain.getBlockChain().get(blockChain.size()-1).getHash());
	miner.mine(block1, blockChain);
	
	Block block2 = new Block(2,"transaction3",blockChain.getBlockChain().get(blockChain.size()-1).getHash());
	miner.mine(block2, blockChain);
	
	Block block3 = new Block(3,"transaction4",blockChain.getBlockChain().get(blockChain.size()-1).getHash());
	miner.mine(block3, blockChain);
	
    System.out.println("\n"
    		+ "BLOCKCHAIN:\n"+blockChain);
    System.out.println("Miner's reward: " + miner.getReward());
  }
}
