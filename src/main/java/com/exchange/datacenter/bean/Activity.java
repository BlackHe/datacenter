package com.exchange.datacenter.bean;

public class Activity {
    private String coinName;
    private String clientId;
    private String amount;
    private String tradingDate;
    private String direction;
    private String id;

    public String getCoinName() {
        return coinName;
    }

    public Activity setCoinName(String coinName) {
        this.coinName = coinName;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public Activity setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getAmount() {
        return amount;
    }

    public Activity setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getTradingDate() {
        return tradingDate;
    }

    public Activity setTradingDate(String tradingDate) {
        this.tradingDate = tradingDate;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public Activity setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getId() {
        return id;
    }

    public Activity setId(String id) {
        this.id = id;
        return this;
    }
}
