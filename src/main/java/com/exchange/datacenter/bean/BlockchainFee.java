package com.exchange.datacenter.bean;

public class BlockchainFee {

    private String coinName;
    private String amount;
    private String tradingDate;
    private String id;
    private String type;

    public String getCoinName() {
        return coinName;
    }

    public BlockchainFee setCoinName(String coinName) {
        this.coinName = coinName;
        return this;
    }

    public String getAmount() {
        return amount;
    }

    public BlockchainFee setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getTradingDate() {
        return tradingDate;
    }

    public BlockchainFee setTradingDate(String tradingDate) {
        this.tradingDate = tradingDate;
        return this;
    }


    public String getId() {
        return id;
    }

    public BlockchainFee setId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public BlockchainFee setType(String type) {
        this.type = type;
        return this;
    }
}
