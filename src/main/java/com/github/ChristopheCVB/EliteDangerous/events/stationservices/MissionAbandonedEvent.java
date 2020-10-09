/*
Author: XenoPyax
Discord: XenoPyax#5647
File created: 05/12/2020 12:15
*/

package com.github.ChristopheCVB.EliteDangerous.events.stationservices;

import com.github.ChristopheCVB.EliteDangerous.events.Event;
import com.github.ChristopheCVB.EliteDangerous.utils.GameFilesUtils;
import com.github.ChristopheCVB.EliteDangerous.utils.JsonUtils;
import com.google.gson.JsonObject;

public class MissionAbandonedEvent extends Event {
	
	private String name;
	private Long missionId;
	
	public MissionAbandonedEvent(String timestamp, JsonObject jsonEvent) {
        super(timestamp);

        this.name = JsonUtils.pullString(jsonEvent, "Name");
        this.missionId = JsonUtils.pullLong(jsonEvent, "MissionID");

        GameFilesUtils.isAllEventDataProcessed(this, jsonEvent);
    }

	public String getName() {
		return name;
	}

	public Long getMissionId() {
		return missionId;
	}

}
