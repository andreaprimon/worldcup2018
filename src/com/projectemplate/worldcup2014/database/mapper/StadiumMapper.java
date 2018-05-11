package com.projectemplate.worldcup2014.database.mapper;

import android.database.Cursor;

import com.projectemplate.worldcup2014.database.DBKeyConfig;
import com.projectemplate.worldcup2014.object.Stadium;

public class StadiumMapper implements RowMapper<Stadium>{

	@Override
	public Stadium mapRow(Cursor row, int rowNum) {
		Stadium stadium = new Stadium();
		stadium.setIdStadium(CursorParseUtility.getInt(row, DBKeyConfig.KEY_STADIUM_ID));
		stadium.setCapacity(CursorParseUtility.getString(row, DBKeyConfig.KEY_STADIUM_CAPACITY));
		stadium.setFullNameStadium(CursorParseUtility.getString(row, DBKeyConfig.KEY_STADIUM_FULL_NAME));
		return stadium;
	}

}
