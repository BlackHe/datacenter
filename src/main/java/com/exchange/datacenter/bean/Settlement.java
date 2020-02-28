package com.exchange.datacenter.bean;

public class Settlement {

    private String coinName;
    private String amount;
    private String fee;
    private String feeCoinName;
    private String tradingDate;
    private String direction;
    private String blockChainFee;
    private String id;

    private String client;

    public String getCoinName() {
        return coinName;
    }

    public Settlement setCoinName(String coinName) {
        this.coinName = coinName;
        return this;
    }

    public String getAmount() {
        return amount;
    }

    public Settlement setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getFee() {
        return fee;
    }

    public Settlement setFee(String fee) {
        this.fee = fee;
        return this;
    }

    public String getFeeCoinName() {
        return feeCoinName;
    }

    public Settlement setFeeCoinName(String feeCoinName) {
        this.feeCoinName = feeCoinName;
        return this;
    }

    public String getTradingDate() {
        return tradingDate;
    }

    public Settlement setTradingDate(String tradingDate) {
        this.tradingDate = tradingDate;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public Settlement setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getBlockChainFee() {
        return blockChainFee;
    }

    public Settlement setBlockChainFee(String blockChainFee) {
        this.blockChainFee = blockChainFee;
        return this;
    }

    public String getId() {
        return id;
    }

    public Settlement setId(String id) {
        this.id = id;
        return this;
    }

    public String getClient() {
        return client;
    }

    public Settlement setClient(String client) {
        this.client = client;
        return this;
    }
}
