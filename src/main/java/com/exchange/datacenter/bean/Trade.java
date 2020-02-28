package com.exchange.datacenter.bean;

public class Trade {

    private String coinName;
    private String clientId;
    private String amount;
    private String fee;
    private String tradingDate;
    private String direction;
    private String id;

    public String getCoinName() {
        return coinName;
    }

    public Trade setCoinName(String coinName) {
        this.coinName = coinName;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public Trade setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getAmount() {
        return amount;
    }

    public Trade setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getFee() {
        return fee;
    }

    public Trade setFee(String fee) {
        this.fee = fee;
        return this;
    }

    public String getTradingDate() {
        return tradingDate;
    }

    public Trade setTradingDate(String tradingDate) {
        this.tradingDate = tradingDate;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public Trade setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getId() {
        return id;
    }

    public Trade setId(String id) {
        this.id = id;
        return this;
    }
}
