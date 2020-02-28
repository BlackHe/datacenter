package com.exchange.datacenter.bean;

public class AbnormalTurnedhot {

    private String coinName;
    private String amount;
    private String tradingDate;
    private String id;

    public String getCoinName() {
        return coinName;
    }

    public AbnormalTurnedhot setCoinName(String coinName) {
        this.coinName = coinName;
        return this;
    }

    public String getAmount() {
        return amount;
    }

    public AbnormalTurnedhot setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getTradingDate() {
        return tradingDate;
    }

    public AbnormalTurnedhot setTradingDate(String tradingDate) {
        this.tradingDate = tradingDate;
        return this;
    }


    public String getId() {
        return id;
    }

    public AbnormalTurnedhot setId(String id) {
        this.id = id;
        return this;
    }
}
