package com.projectemplate.worldcup2014.fragment;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.projectemplate.worldcup2014.BaseFragment;
import com.projectemplate.worldcup2014.R;
import com.projectemplate.worldcup2014.activity.InfoMatchActivity;
import com.projectemplate.worldcup2014.activity.config.GlobalValue;
import com.projectemplate.worldcup2014.activity.config.JsonConfig;
import com.projectemplate.worldcup2014.activity.config.WebServiceConfig;
import com.projectemplate.worldcup2014.adapter.ScheduleAdapter;
import com.projectemplate.worldcup2014.database.DatabaseUtility;
import com.projectemplate.worldcup2014.modelmanager.ParserUitility;
import com.projectemplate.worldcup2014.object.Match;
import com.projectemplate.worldcup2014.utility.AssetUtil;

public class DetailGroupsSchedule extends BaseFragment {

	private ListView lsvDetailGroupsSchedule;
	private ArrayList<Match> listMatchDetaiGroups;
	private ScheduleAdapter scheduleDetaiGroupAdapter;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.page_detail_groups_schedule,
				container, false);
		initUI(view);
		initData();
		initControl();
		return view;

	}

	private void initControl() {
		lsvDetailGroupsSchedule
				.setOnItemClickListener(new OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> parent, View view,
							int position, long id) {

						Bundle b = new Bundle();
						Match clickedMath = listMatchDetaiGroups.get(position);
						// b.putInt("Match", clickedMath.getMatchId());
						// b.putString("Day", clickedMath.getMatchDate());
						// b.putString("Time", clickedMath.getMatchStartTime());
						// b.putString("Stadium", clickedMath.getStadiumId());
						// b.putInt("Country1", clickedMath.getCountry1());
						// b.putInt("Country2", clickedMath.getCountry2());
						// b.putLong("Goal1", clickedMath.getGoalCountry1());
						// b.putLong("Goal2", clickedMath.getGoalCountry2());
						// b.putString("Info", clickedMath.getMatchInfo());
						// b.putString("Status", clickedMath.getMatchStatus());
						// b.putInt("idStadium", clickedMath.getIdStadium());
						Intent i = new Intent(getActivity(),
								InfoMatchActivity.class);
						InfoMatchActivity.currentMath = clickedMath;
						// i.putExtras(b);
						startActivity(i);
					}
				});

	}

	private void initUI(View view) {
		lsvDetailGroupsSchedule = (ListView) view
				.findViewById(R.id.lsvDetailGroupsSchedule);
	}

	public void initData() {
		String url = WebServiceConfig.URL_GET_MATCH_BY_GROUPD
				+ getGroupId(GlobalValue.IdGroup);
//		if (NetworkUtility.getInstance(self).checkNetworkStatus()) {
//
//			ModelManager.getData(getActivity(), true, url,
//					new ModelManagerListener() {
//
//						@Override
//						public void onWSError() {
//						}
//
//						@Override
//						public void OnSuccess(String json) {
//							if (json != null) {
//								try {
//									listMatchDetaiGroups = ParserUitility
//											.parserListMatch(new JSONObject(
//													json));
//								} catch (JSONException e) {
//									// TODO Auto-generated catch block
//									e.printStackTrace();
//								}
//								scheduleDetaiGroupAdapter = new ScheduleAdapter(
//										getActivity(), listMatchDetaiGroups);
//								lsvDetailGroupsSchedule
//										.setAdapter(scheduleDetaiGroupAdapter);
//							}
//						}
//					});
//
//		} else {
			String json = DatabaseUtility.getJsonContent(self, WebServiceConfig.URL_GET_MATCH_BY_GROUPD
					+ getGroupId(GlobalValue.IdGroup));
			try {
				listMatchDetaiGroups = ParserUitility
						.parserListMatch(new JSONObject(json));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			scheduleDetaiGroupAdapter = new ScheduleAdapter(getActivity(),
					listMatchDetaiGroups);
			lsvDetailGroupsSchedule.setAdapter(scheduleDetaiGroupAdapter);
//		}

	}

	private String getJsonData(int idGroup) {
		String url = "";
		switch (idGroup) {
		case 1:
			url = JsonConfig.FILE_MATCH_BY_GROUP_A;
			break;
		case 2:
			url = JsonConfig.FILE_MATCH_BY_GROUP_B;
			break;
		case 3:
			url = JsonConfig.FILE_MATCH_BY_GROUP_C;
			break;
		case 4:
			url = JsonConfig.FILE_MATCH_BY_GROUP_D;
			break;
		case 5:
			url = JsonConfig.FILE_MATCH_BY_GROUP_E;
			break;
		case 6:
			url = JsonConfig.FILE_MATCH_BY_GROUP_F;
			break;
		case 7:
			url = JsonConfig.FILE_MATCH_BY_GROUP_G;
			break;
		case 8:
			url = JsonConfig.FILE_MATCH_BY_GROUP_H;
			break;

		default:
			break;

		}
		return AssetUtil.getString(self, url);
	}

}
