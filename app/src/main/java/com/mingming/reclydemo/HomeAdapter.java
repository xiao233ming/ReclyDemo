package com.mingming.reclydemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mingming on 2016/9/11.
 * Created by 2016
 *
 * @ 描述
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>{

    private Context context;
    private List<String> data;
    public HomeAdapter(Context context, List<String> mDatas) {
        this.context = context;
        this.data = mDatas;
    }

    //获取数据的数量
    @Override
    public int getItemCount() {
        // TODO Auto-generated method stub
        return data.size();
    }

    //将数据与界面进行绑定
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(data.get(position));
    }

    //创建新view,被layoutManager所调用
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(context).
                inflate(R.layout.item_home, parent,false));
        return holder;
    }


    //自定义viewHolder，持有每个item的所有界面元素
    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv;
        public MyViewHolder(View view) {
            super(view);
            tv = (TextView) view.findViewById(R.id.id_num);
        }

    }
}
