package com.dinosoftlabs.binder.Registration;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dinosoftlabs.binder.AppUtils.MySharePreferences;
import com.dinosoftlabs.binder.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PopupListAdapter extends RecyclerView.Adapter<PopupListAdapter.ViewHolder> {
    Context context;
    List<String> list;
    private RecyclerClickInterface recyclerClickInterface;
    MySharePreferences sharePreferences;

    public PopupListAdapter(Context context, List<String> list, RecyclerClickInterface recyclerClickInterface) {
        this.context = context;
        this.list = list;
        this.recyclerClickInterface=recyclerClickInterface;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        sharePreferences= new MySharePreferences(context);
        View view= LayoutInflater.from(context).inflate(R.layout.layout_for_popup_list,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String name=list.get(position);
        holder.tvname.setText(name);
        holder.tvname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerClickInterface.recyclerviewOnClick(list.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvname=(TextView)itemView.findViewById(R.id.tvname);
        }
    }
}
