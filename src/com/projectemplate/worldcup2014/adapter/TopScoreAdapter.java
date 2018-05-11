package com.projectemplate.worldcup2014.adapter;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.projectemplate.worldcup2014.R;
import com.projectemplate.worldcup2014.object.TopScoreInfo;
import com.projectemplate.worldcup2014.utility.lazylist.ImageLoader;

public class TopScoreAdapter extends BaseAdapter {

	private ArrayList<TopScoreInfo> listTopEvent;
	public ImageLoader imageLoader;
	public Context context;
	private static LayoutInflater inflater = null;
	public String TAG = "TopScoreAdapter";

	public TopScoreAdapter(Activity activity, ArrayList<TopScoreInfo> d) {
		listTopEvent = d;
		context = activity;
		inflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		imageLoader = new ImageLoader(activity.getApplicationContext());
	}

	public int getCount() {
		return listTopEvent.size();
	}

	@Override
	public Object getItem(int position) {
		return listTopEvent.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.row_top_score, null);
			holder = new ViewHolder();
			holder.lblNameCountry = (TextView) convertView
					.findViewById(R.id.lblNameCountry);
			holder.lblPlayer = (TextView) convertView
					.findViewById(R.id.lblPlayer);
			holder.lblPoint = (TextView) convertView
					.findViewById(R.id.lblScore);
			holder.lblOrder = (TextView) convertView
					.findViewById(R.id.lblOrderNumber);
			holder.imgCountry = (ImageView) convertView
					.findViewById(R.id.imgCountry);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		TopScoreInfo h = listTopEvent.get(position);
		if (h != null) {

			holder.imgCountry.setImageResource(h.getImageId());
			holder.lblNameCountry.setText(h.getCountryName());
			holder.lblOrder.setText(String.valueOf(position + 1));
			holder.lblPlayer.setText(h.getPlayerNamwe());
			holder.lblPlayer.setSelected(true);
			holder.lblNameCountry.setSelected(true);
			holder.lblPoint.setText(h.getScore() + "");

		}
		return convertView;
	}

	static class ViewHolder {

		private ImageView imgCountry;
		private TextView lblNameCountry, lblPlayer, lblPoint, lblOrder;

	}

}
