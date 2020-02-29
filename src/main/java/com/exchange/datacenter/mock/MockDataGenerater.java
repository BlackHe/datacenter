package com.exchange.datacenter.mock;

import com.exchange.datacenter.bean.*;

import java.util.ArrayList;
import java.util.List;

public class MockDataGenerater {

    public static List generateMockData(Class clazz) {
        switch (clazz.getSimpleName()) {
            case "Assert":
                return assertList();
            case "Trade":
                return tradeList();
            case "Settlement":
                return settlementList();
            case "Activity":
                return activityList();
            case "CompanyInput":
                return companyInputList();
            case "BlockchainFee":
                return blockchainFeeList();
            case "AbnormalTurnedhot":
                return abnormalTurnedhotList();
            default:
                return null;
        }
    }


    public static List<Assert> assertList() {
        ArrayList<Assert> asserts = new ArrayList<>();
        asserts.add(new Assert("BTC", "0000000021", "0.291829"));
        asserts.add(new Assert("ETH", "0000000021", "10.9283939"));
        asserts.add(new Assert("CYB", "0000000021", "823784.82932"));
        asserts.add(new Assert("EOS", "0000000021", "920392.2"));
        asserts.add(new Assert("BTC", "0000000022", "2.231232"));
        asserts.add(new Assert("ETH", "0000000022", "9283.99999"));
        asserts.add(new Assert("USDT", "0000000023", "100000.93829"));
        return asserts;
    }

    public static List<Settlement> settlementList() {
        ArrayList<Settlement> settlements = new ArrayList<>();
        settlements.add(new Settlement().setFee("9.23").setCoinName("BTC").setTradingDate("2020-01-01 00:00:00").setBlockChainFee("9.23").setFeeCoinName("BTC").setAmount("8293823.82389").setDirection("1").setId("27332323456423").setClient("0000000021"));
        settlements.add(new Settlement().setFee("2.012212").setCoinName("ETH").setTradingDate("2020-01-02 00:00:00").setBlockChainFee("43.23923").setFeeCoinName("ETH").setAmount("2323.1").setDirection("1").setId("92832734842").setClient("0000000021"));
        settlements.add(new Settlement().setFee("9239.2000023").setCoinName("USDT").setTradingDate("2020-01-03 00:00:00").setBlockChainFee("239.2").setFeeCoinName("USDT").setAmount("928239.8123819").setDirection("1").setId("19484343728334").setClient("0000000021"));
        settlements.add(new Settlement().setFee("19.223").setCoinName("BTC").setTradingDate("2020-01-03 00:00:00").setBlockChainFee("93.232").setFeeCoinName("BTC").setAmount("443434.33").setDirection("0").setId("6534768029923").setClient("0000000021"));
        settlements.add(new Settlement().setFee("122.0122212").setCoinName("ETH").setTradingDate("2020-01-04 00:00:00").setBlockChainFee("423.239323").setFeeCoinName("ETH").setAmount("34321.1").setDirection("0").setId("191282132734").setClient("0000000021"));
        settlements.add(new Settlement().setFee("42.20200023").setCoinName("USDT").setTradingDate("2020-02-03 00:00:00").setBlockChainFee("2839.2").setFeeCoinName("USDT").setAmount("1212.34").setDirection("0").setId("634343434").setClient("0000000021"));
        settlements.add(new Settlement().setFee("33.2").setCoinName("BTC").setTradingDate("2020-02-07 00:00:00").setBlockChainFee("29.23434").setFeeCoinName("BTC").setAmount("98751.34").setDirection("1").setId("119298987912").setClient("0000000022"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("EOS").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.4").setFeeCoinName("EOS").setAmount("1343439776.34").setDirection("0").setId("81192989879").setClient("0000000022"));
        return settlements;
    }


    public static List<Trade> tradeList() {
        ArrayList<Trade> trades = new ArrayList<>();
        trades.add(new Trade().setAmount("29392.121221").setClientId("0000000021").setCoinName("BTC").setDirection("1").setFee("9.827338").setId("92382329238").setTradingDate("2020-01-01 00:00:00"));
        trades.add(new Trade().setAmount("23.2").setClientId("0000000021").setCoinName("ETH").setDirection("1").setFee("923.283392").setId("72837283273").setTradingDate("2020-01-01 01:00:00"));
        trades.add(new Trade().setAmount("938.1921831").setClientId("0000000021").setCoinName("CYB").setDirection("1").setFee("19.1").setId("322232123421").setTradingDate("2020-01-02 00:00:00"));
        trades.add(new Trade().setAmount("923.983121221").setClientId("0000000021").setCoinName("EOS").setDirection("1").setFee("100").setId("93837287372").setTradingDate("2020-01-03 00:00:00"));
        trades.add(new Trade().setAmount("1293922.121221").setClientId("0000000021").setCoinName("BTC").setDirection("0").setFee("19.827338").setId("92382329238").setTradingDate("2020-01-01 12:00:00"));
        trades.add(new Trade().setAmount("21123.2").setClientId("0000000021").setCoinName("ETH").setDirection("0").setFee("423.283392").setId("72837283273").setTradingDate("2020-01-01 11:00:00"));
        trades.add(new Trade().setAmount("232").setClientId("0000000022").setCoinName("BTC").setDirection("1").setFee("1").setId("938279318").setTradingDate("2020-01-04 00:00:00"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("BTC").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00"));
        return trades;
    }

    public static List<Activity> activityList() {
        ArrayList<Activity> activities = new ArrayList<>();
        activities.add(new Activity().setCoinName("BTC").setTradingDate("2020-01-01 11:00:00").setAmount("8232.23").setClientId("0000000021").setDirection("1").setId("932838293923"));
        activities.add(new Activity().setCoinName("ETH").setTradingDate("2020-01-02 11:00:00").setAmount("34232322.23").setClientId("0000000021").setDirection("0").setId("9286438293923"));
        activities.add(new Activity().setCoinName("EOS").setTradingDate("2020-01-01 11:00:00").setAmount("6454.2333").setClientId("0000000022").setDirection("1").setId("92823829343923"));
        activities.add(new Activity().setCoinName("USDT").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923"));
        return activities;
    }


    public static List<CompanyInput> companyInputList() {
        ArrayList<CompanyInput> companyInputs = new ArrayList<>();
        companyInputs.add(new CompanyInput().setCoinName("BTC").setTradingDate("2020-01-01 11:00:00").setAmount("8232.23").setClientId("0000000021").setId("932838293923"));
        companyInputs.add(new CompanyInput().setCoinName("ETH").setTradingDate("2020-01-02 11:00:00").setAmount("34232322.23").setClientId("0000000021").setId("9286438293923"));
        companyInputs.add(new CompanyInput().setCoinName("EOS").setTradingDate("2020-01-01 11:00:00").setAmount("6454.2333").setClientId("0000000022").setId("92823829343923"));
        companyInputs.add(new CompanyInput().setCoinName("USDT").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        return companyInputs;
    }

    public static List<AbnormalTurnedhot> abnormalTurnedhotList() {
        ArrayList<AbnormalTurnedhot> abnormalTurnedhots = new ArrayList<>();
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("BTC").setTradingDate("2020-01-01 11:00:00").setAmount("8232.23").setId("932838293923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("ETH").setTradingDate("2020-01-02 11:00:00").setAmount("34232322.23").setId("9286438293923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("EOS").setTradingDate("2020-01-01 11:00:00").setAmount("6454.2333").setId("92823829343923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("USDT").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923"));
        return abnormalTurnedhots;
    }

    public static List<BlockchainFee> blockchainFeeList() {
        ArrayList<BlockchainFee> blockchainFees = new ArrayList<>();
        blockchainFees.add(new BlockchainFee().setCoinName("BTC").setTradingDate("2020-01-01 11:00:00").setAmount("8232.23").setId("932838293923").setType("1"));
        blockchainFees.add(new BlockchainFee().setCoinName("ETH").setTradingDate("2020-01-02 11:00:00").setAmount("34232322.23").setId("9286438293923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("EOS").setTradingDate("2020-01-01 11:00:00").setAmount("6454.2333").setId("92823829343923").setType("1"));
        blockchainFees.add(new BlockchainFee().setCoinName("USDT").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        return blockchainFees;
    }

}
