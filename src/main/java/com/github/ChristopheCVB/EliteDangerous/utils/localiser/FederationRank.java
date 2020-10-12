package com.github.ChristopheCVB.EliteDangerous.utils.localiser;

public class FederationRank {
	private static String[] LOCALISED_NAMES = {"None", "Recruit", "Cadet", "Midshipman", "Petty Officer", "Chief Petty Officer", "Warrant Officer", "Ensign", "Lieutenant", "Lt. Commander", "Post Commander", "Post Captain", "Rear Admiral", "Vice Admiral", "Admiral"};

	public static String getLocalisedName(int rank) {
		return LOCALISED_NAMES[rank];
	}

	public static int getRank(String rankName) {
		int rank = 0;
		for (int i = 0; i < LOCALISED_NAMES.length; i++) {
			if (LOCALISED_NAMES[i].equals(rankName)) {
				rank = i;
			}
		}

		return rank;
	}
}
