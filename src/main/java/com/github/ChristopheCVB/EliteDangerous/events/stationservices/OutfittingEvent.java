/*
Author: XenoPyax
Discord: XenoPyax#5647
File created: 05/12/2020 20:46
*/

package com.github.ChristopheCVB.EliteDangerous.events.stationservices;

import com.github.ChristopheCVB.EliteDangerous.events.Event;
import com.github.ChristopheCVB.EliteDangerous.utils.GameFilesUtils;
import com.github.ChristopheCVB.EliteDangerous.utils.JsonUtils;
import com.google.gson.JsonObject;

public class OutfittingEvent extends Event {
	
	private Long marketId;
	private String stationName, starSystem;
	
	public OutfittingEvent(String timestamp, JsonObject jsonEvent) {
        super(timestamp);

        this.marketId = JsonUtils.pullLong(jsonEvent, "MarketID");
        this.stationName = JsonUtils.pullString(jsonEvent, "StationName");
        this.starSystem = JsonUtils.pullString(jsonEvent, "StarSystem");

        GameFilesUtils.isAllEventDataProcessed(this, jsonEvent);
    }

	public Long getMarketId() {
		return marketId;
	}

	public String getStationName() {
		return stationName;
	}

	public String getStarSystem() {
		return starSystem;
	}

}