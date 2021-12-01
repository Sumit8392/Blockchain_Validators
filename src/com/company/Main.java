package com.company;

public class Main {

    public static void main(String args[]) {

        BlockChain tcpCoin = new BlockChain();

        Block a = new Block("0x200", new java.util.Date(), "<transactions>");
        Block b = new Block("0x200", new java.util.Date(), "<transactions>");
        Block c = new Block("0x200", new java.util.Date(), "<transactions>");

        tcpCoin.addBlock(a);
        tcpCoin.addBlock(b);
        tcpCoin.addBlock(c);

        //check not valid hash

        //tcpCoin.getLatestBlock().setPreviousHash("sfhhsksgdkhgjkahshsgs");

        tcpCoin.displayChain();

        tcpCoin.isValid();

    }

}