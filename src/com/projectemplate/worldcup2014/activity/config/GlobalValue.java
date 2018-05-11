package com.projectemplate.worldcup2014.activity.config;

import java.util.ArrayList;
import java.util.List;

import com.projectemplate.worldcup2014.R;
import com.projectemplate.worldcup2014.object.Country;
import com.projectemplate.worldcup2014.object.ImageInfo;
import com.projectemplate.worldcup2014.object.Match;
import com.projectemplate.worldcup2014.object.Stadium;

public final class GlobalValue {
	
	public GlobalValue()
	{
		listImage();
		listImageFullInfo();
		getImageListStadium();
	}

	public static String NameCountry;
	public static String Name;
	public static String deviceTimeZone="";
	public static int IdGroup;
	public static List<Country> listCountries;
	public static List<ArrayList<Country>> listCountriesByGroup;
	public static List<Integer> listFlags;
	public static List<ImageInfo> listImageInfo;
	public static List<Integer> listImageStadium;
	public static MySharedPreferences prefs;
	public static List<Stadium> listStadium;
	public static List<String> allDayofWeek;
	public static List<String> allDay;
	public static List<String> allMonth;
	public static List<String> allStartTimeMatch;
	public static ArrayList<Match> listAllMath;
	public static final String FRUITY_NEWS_PREFERENCES = "FRUITY_NEWS_PREFERENCES";
	public static final String FRUITY_DROID_PREFERENCES = "FRUITY_DROID_PREFERENCES";
	public static final String EVANDRO_DROID_PREFERENCES = "EVANDRO_DROID_PREFERENCES";

	// -------------------Value
	// Config------------------------------------------------------//

	public static String URL_FILE_VERSION_HOST = "http://fruitysolution.vn:8020/worldcup/version.txt";
	public static String URL_FILE_DATABASE_HOST = "http://fruitysolution.vn:8020/worldcup/Worldcup2014.txt";
	public static String ADMOB_ID = "ca-app-pub-1733231109842363/3522902938";
	public static String alarmRing = "alarm.mp3";
	public static int vibrateAlarm = 7;
	public static int vibrateOnRimider = 0;
	public static String timeCountDown = "12.06.2014,17:00";
	public static boolean DEBUG_MODE = true;
	public static int TIME_CHECK_UPDATE_INTERVAL = 1;// 3 Mins
	
	
	//get data
	public void listImage() {
		GlobalValue.listFlags = new ArrayList<Integer>();
		GlobalValue.listFlags.add(R.drawable.icon_noname);
		GlobalValue.listFlags.add(R.drawable.icon_brazil);
		GlobalValue.listFlags.add(R.drawable.icon_croatia);
		GlobalValue.listFlags.add(R.drawable.icon_mexico);
		GlobalValue.listFlags.add(R.drawable.icon_cameroon);
		GlobalValue.listFlags.add(R.drawable.icon_spain);
		GlobalValue.listFlags.add(R.drawable.icon_netherland);
		GlobalValue.listFlags.add(R.drawable.icon_chile);
		GlobalValue.listFlags.add(R.drawable.icon_australia);
		GlobalValue.listFlags.add(R.drawable.icon_colombia);
		GlobalValue.listFlags.add(R.drawable.icon_ivory_coast);
		GlobalValue.listFlags.add(R.drawable.icon_japan);
		GlobalValue.listFlags.add(R.drawable.icon_greece);
		GlobalValue.listFlags.add(R.drawable.icon_uruguay);
		GlobalValue.listFlags.add(R.drawable.icon_costa_rica);
		GlobalValue.listFlags.add(R.drawable.icon_england);
		GlobalValue.listFlags.add(R.drawable.icon_italy);
		GlobalValue.listFlags.add(R.drawable.icon_switzerland);
		GlobalValue.listFlags.add(R.drawable.icon_ecuador);
		GlobalValue.listFlags.add(R.drawable.icon_honduras);
		GlobalValue.listFlags.add(R.drawable.icon_france);
		GlobalValue.listFlags.add(R.drawable.icon_argentina);
		GlobalValue.listFlags.add(R.drawable.icon_bosnia);
		GlobalValue.listFlags.add(R.drawable.icon_iran);
		GlobalValue.listFlags.add(R.drawable.icon_nigeria);
		GlobalValue.listFlags.add(R.drawable.icon_germany);
		GlobalValue.listFlags.add(R.drawable.icon_portugal);
		GlobalValue.listFlags.add(R.drawable.icon_ghana);
		GlobalValue.listFlags.add(R.drawable.icon_usa);
		GlobalValue.listFlags.add(R.drawable.icon_belgium);
		GlobalValue.listFlags.add(R.drawable.icon_algeria);
		GlobalValue.listFlags.add(R.drawable.icon_russia);
		GlobalValue.listFlags.add(R.drawable.icon_korea);
		GlobalValue.listFlags.add(R.drawable.icon_noname);
	}

	public void listImageFullInfo() {

		GlobalValue.listImageInfo = new ArrayList<ImageInfo>();
		GlobalValue.listImageInfo.add(new ImageInfo("BRAZIL", "BRA",
				R.drawable.icon_brazil));
		GlobalValue.listImageInfo.add(new ImageInfo("CROATIA", "CRO",
				R.drawable.icon_croatia));
		GlobalValue.listImageInfo.add(new ImageInfo("MEXICO", "MEX",
				R.drawable.icon_mexico));
		GlobalValue.listImageInfo.add(new ImageInfo("CAMEROON", "CMR",
				R.drawable.icon_cameroon));
		GlobalValue.listImageInfo.add(new ImageInfo("SPAIN", "ESP",
				R.drawable.icon_spain));
		GlobalValue.listImageInfo.add(new ImageInfo("NETHERLANDS", "NED",
				R.drawable.icon_netherland));
		GlobalValue.listImageInfo.add(new ImageInfo("CHILE", "CHI",
				R.drawable.icon_chile));
		GlobalValue.listImageInfo.add(new ImageInfo("AUSTRALIA", "AUS",
				R.drawable.icon_australia));
		GlobalValue.listImageInfo.add(new ImageInfo("COLOMBIA", "COL",
				R.drawable.icon_colombia));
		GlobalValue.listImageInfo.add(new ImageInfo("IVORY COAST", "CIV",
				R.drawable.icon_ivory_coast));
		GlobalValue.listImageInfo.add(new ImageInfo("JAPAN", "JPN",
				R.drawable.icon_japan));
		GlobalValue.listImageInfo.add(new ImageInfo("GREECE", "GRE",
				R.drawable.icon_greece));
		GlobalValue.listImageInfo.add(new ImageInfo("URUGUAY", "URU",
				R.drawable.icon_uruguay));
		GlobalValue.listImageInfo.add(new ImageInfo("COSTA RICA", "CRC",
				R.drawable.icon_costa_rica));
		GlobalValue.listImageInfo.add(new ImageInfo("ENGLAND", "ENG",
				R.drawable.icon_england));
		GlobalValue.listImageInfo.add(new ImageInfo("ITALY", "ITA",
				R.drawable.icon_italy));
		GlobalValue.listImageInfo.add(new ImageInfo("SWITZERLAND", "CHE",
				R.drawable.icon_switzerland));
		GlobalValue.listImageInfo.add(new ImageInfo("ECUADOR", "ECU",
				R.drawable.icon_ecuador));
		GlobalValue.listImageInfo.add(new ImageInfo("HONDURAS", "HON",
				R.drawable.icon_honduras));
		GlobalValue.listImageInfo.add(new ImageInfo("FRANCE", "FRA",
				R.drawable.icon_france));
		GlobalValue.listImageInfo.add(new ImageInfo("ARGENTINA", "ARG",
				R.drawable.icon_argentina));
		GlobalValue.listImageInfo.add(new ImageInfo("BOSNIA-HERZEGOVINA",
				"BIH", R.drawable.icon_bosnia));
		GlobalValue.listImageInfo.add(new ImageInfo("IRAN", "IRN",
				R.drawable.icon_iran));
		GlobalValue.listImageInfo.add(new ImageInfo("NIGERIA", "NGA",
				R.drawable.icon_nigeria));
		GlobalValue.listImageInfo.add(new ImageInfo("GERMANY", "GER",
				R.drawable.icon_germany));
		GlobalValue.listImageInfo.add(new ImageInfo("PORTUGAL", "POR",
				R.drawable.icon_portugal));
		GlobalValue.listImageInfo.add(new ImageInfo("GHANA", "GHA",
				R.drawable.icon_ghana));
		GlobalValue.listImageInfo.add(new ImageInfo("USA", "USA",
				R.drawable.icon_usa));
		GlobalValue.listImageInfo.add(new ImageInfo("BELGIUM", "BEL",
				R.drawable.icon_belgium));
		GlobalValue.listImageInfo.add(new ImageInfo("ALGERIA", "ALG",
				R.drawable.icon_algeria));
		GlobalValue.listImageInfo.add(new ImageInfo("RUSSIA", "RUS",
				R.drawable.icon_russia));
		GlobalValue.listImageInfo.add(new ImageInfo("SOUTH KOREA", "KOR",
				R.drawable.icon_korea));
		GlobalValue.listImageInfo.add(new ImageInfo("UNKNOW", "UKN",
				R.drawable.icon_noname));
	}

	public void getImageListStadium() {
		GlobalValue.listImageStadium = new ArrayList<Integer>();
		GlobalValue.listImageStadium.add(R.drawable.stadium1);
		GlobalValue.listImageStadium.add(R.drawable.stadium2);
		GlobalValue.listImageStadium.add(R.drawable.stadium3);
		GlobalValue.listImageStadium.add(R.drawable.stadium4);
		GlobalValue.listImageStadium.add(R.drawable.stadium5);
		GlobalValue.listImageStadium.add(R.drawable.stadium6);
		GlobalValue.listImageStadium.add(R.drawable.stadium7);
		GlobalValue.listImageStadium.add(R.drawable.stadium8);
		GlobalValue.listImageStadium.add(R.drawable.stadium9);
		GlobalValue.listImageStadium.add(R.drawable.stadium10);
		GlobalValue.listImageStadium.add(R.drawable.stadium11);
		GlobalValue.listImageStadium.add(R.drawable.stadium12);
	}
	
}
