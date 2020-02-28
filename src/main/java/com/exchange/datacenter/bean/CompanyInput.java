package com.exchange.datacenter.bean;

public class CompanyInput {

    private String coinName;
    private String clientId;
    private String amount;
    private String tradingDate;
    private String id;

    public String getCoinName() {
        return coinName;
    }

    public CompanyInput setCoinName(String coinName) {
        this.coinName = coinName;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public CompanyInput setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getAmount() {
        return amount;
    }

    public CompanyInput setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getTradingDate() {
        return tradingDate;
    }

    public CompanyInput setTradingDate(String tradingDate) {
        this.tradingDate = tradingDate;
        return this;
    }


    public String getId() {
        return id;
    }

    public CompanyInput setId(String id) {
        this.id = id;
        return this;
    }
}
