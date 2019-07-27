package com.bridgelabz.commercial.service;

public interface StockService {

	public double valueOf();

	public void buy(int numOfShares, String stockName);

	public void sell(int numOfShares, String stockName);

	public void save(String filename);

	public void printReport();
}
