package com.projectemplate.worldcup2014.fragment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.json.JSONException;
import org.json.JSONObject;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.projectemplate.worldcup2014.BaseFragment;
import com.projectemplate.worldcup2014.R;
import com.projectemplate.worldcup2014.activity.config.GlobalValue;
import com.projectemplate.worldcup2014.activity.config.JsonConfig;
import com.projectemplate.worldcup2014.activity.config.WebServiceConfig;
import com.projectemplate.worldcup2014.adapter.DetailGroupsPointAdapter;
import com.projectemplate.worldcup2014.database.DatabaseUtility;
import com.projectemplate.worldcup2014.modelmanager.ModelManager;
import com.projectemplate.worldcup2014.modelmanager.ModelManagerListener;
import com.projectemplate.worldcup2014.modelmanager.ParserUitility;
import com.projectemplate.worldcup2014.object.Country;
import com.projectemplate.worldcup2014.utility.AssetUtil;
import com.projectemplate.worldcup2014.utility.NetworkUtility;

public class DetailGroupsPoint extends BaseFragment {
	private TextView lblNameDetailGroupPoint;
	private ListView lsvPoint;
	private ArrayList<Country> arrCountry;
	private DetailGroupsPointAdapter detaiGroupsPointAdapter;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.page_detail_group_point,
				container, false);
		initUi(view);
		return view;
	}

	public void initUi(View view) {

		lsvPoint = (ListView) view.findViewById(R.id.lsvPoint);
		lblNameDetailGroupPoint = (TextView) view
				.findViewById(R.id.lblNameDetailGroupPoint);
		lblNameDetailGroupPoint.setText(getString(R.string.point_group_title)
				+ " " + GlobalValue.Name);
		loadData();

	}

	public void loadData() {

		// if (NetworkUtility.getInstance(self).checkNetworkStatus()) {
		// ModelManager.getData(getActivity(), true,
		// WebServiceConfig.URL_GET_GROUP_DETAIL
		// + getGroupId(GlobalValue.IdGroup),
		// new ModelManagerListener() {
		//
		// @Override
		// public void onWSError() {
		// }
		//
		// @Override
		// public void OnSuccess(String json) {
		// if (json != null)
		// bindData(json);
		// }
		//
		// });
		// } else {
		String json = DatabaseUtility.getJsonContent(self,
				WebServiceConfig.URL_GET_GROUP_DETAIL
						+ getGroupId(GlobalValue.IdGroup));
		bindData(json);
		// }

	}

	private void bindData(String json) {
		Log.d("ALL SCHEDULE", "JSON : " + json);
		try {
			arrCountry = ParserUitility.parserListCountryPoint(new JSONObject(
					json));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		Collections.sort(arrCountry, new Comparator<Country>() {

			public int compare(Country lhs, Country rhs) {
				if (rhs.getPoint() == lhs.getPoint()) {
					int hs1 = rhs.getAllGoalNumber() - rhs.getAllLoseNumber();
					int hs2 = lhs.getAllGoalNumber() - lhs.getAllLoseNumber();
					if (hs1 == hs2) {
						return rhs.getAllGoalNumber() - lhs.getAllGoalNumber();
					} else
						return (hs1 - hs2);
				} else
					return rhs.getPoint() - lhs.getPoint();
			}
		});
		detaiGroupsPointAdapter = new DetailGroupsPointAdapter(getActivity(),
				arrCountry);
		lsvPoint.setAdapter(detaiGroupsPointAdapter);
	}

	private String getJsonData(int idGroup) {
		String url = "";
		switch (idGroup) {
		case 1:
			url = JsonConfig.FILE_GROUP_A;
			break;
		case 2:
			url = JsonConfig.FILE_GROUP_B;
			break;
		case 3:
			url = JsonConfig.FILE_GROUP_C;
			break;
		case 4:
			url = JsonConfig.FILE_GROUP_D;
			break;
		case 5:
			url = JsonConfig.FILE_GROUP_E;
			break;
		case 6:
			url = JsonConfig.FILE_GROUP_F;
			break;
		case 7:
			url = JsonConfig.FILE_GROUP_G;
			break;
		case 8:
			url = JsonConfig.FILE_GROUP_H;
			break;

		default:
			break;

		}
		return AssetUtil.getString(self, url);
	}
}
