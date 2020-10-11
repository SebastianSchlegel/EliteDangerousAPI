package com.github.ChristopheCVB.EliteDangerous.events.trade;

import com.github.ChristopheCVB.EliteDangerous.events.Event;

public class MarketSellEvent extends Event {
	public Long marketID;
	public String type;
	public String typeLocalised;
	public Integer count;
	public Integer sellPrice;
	public Integer totalSale;
	public Integer avgPricePaid;
	public Boolean illegalGoods;
	public Boolean stolenGoods;
	public Boolean blackMarket;
}
