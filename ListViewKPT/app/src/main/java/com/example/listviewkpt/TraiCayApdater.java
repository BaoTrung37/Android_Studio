package com.example.listviewkpt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraiCayApdater extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TraiCay> traiCayList;

    public TraiCayApdater(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }

    @Override
    public int getCount() {
        return traiCayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        TextView txtTen,txtMota;
        ImageView imgAnh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(layout,null);
            viewHolder = new ViewHolder();
            // anh xa
            viewHolder.txtTen = convertView.findViewById(R.id.textviewTen);
            viewHolder.txtMota = convertView.findViewById(R.id.textviewMota);
            viewHolder.imgAnh = convertView.findViewById(R.id.imageViewAnh);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        TraiCay traiCay = traiCayList.get(position);
        viewHolder.txtTen.setText(traiCay.getTen());
        viewHolder.txtMota.setText(traiCay.getMoTa());
        viewHolder.imgAnh.setImageResource(traiCay.getHinh());
        return convertView;

    }
}
