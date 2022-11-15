package com.example.baikt1_quanlycongan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter {
    private Context context;
    private int layout;
    private List<Model> modelList;

    public Adapter(Context context, int layout, List<Model> sachList) {
        this.context = context;
        this.layout = layout;
        this.modelList = modelList;
    }


    private class ViewHolder{
        ImageView img;
        TextView txtTen,txtCapBac,txtNoiCongTac,txtQuocGia,txtSao;
    }
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if(view == null ){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout ,null);
            holder = new ViewHolder();
            // ánh xạ view
            holder.txtTen = (TextView) view.findViewById(R.id.tvTen);
            holder.txtCapBac = (TextView) view.findViewById(R.id.tvCapBac);
            holder.txtNoiCongTac = (TextView) view.findViewById(R.id.tvNoiCongTac);
            holder.txtQuocGia = (TextView) view.findViewById(R.id.tvQuocGia);
            holder.txtSao = (TextView) view.findViewById(R.id.tvsao);
            holder.img = (ImageView) view.findViewById(R.id.imageviewHinh);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }


        //gán giá trị
        Model model = modelList.get(i);
        holder.txtTen.setText(model.getTen());
        holder.txtCapBac.setText(model.getCapbac());
        holder.txtNoiCongTac.setText(model.getNoicongtac());
        holder.txtQuocGia.setText(model.getQuocgia());
        holder.txtSao.setText(model.getSao());
        holder.img.setImageResource(model.getHinh());
        return view;
    }
}
