package com.example.listingview;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListRolesAdapter extends RecyclerView.Adapter<ListRolesAdapter.CategoryViewHolder> {
    public ListRolesAdapter(Context context) {
        this.context = context;
    }

    private Context context;

    public ArrayList<Roles> getListRoles() {
        return listRoles;
    }

    public void setListRoles(ArrayList<Roles> listRoles) {
        this.listRoles = listRoles;
    }

    private ArrayList<Roles> listRoles;
    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_roles, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, final int position) {
        categoryViewHolder.tvName.setText(getListRoles().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListRoles().get(position).getRemarks());
        Glide.with(context)
                .load(getListRoles().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);

        categoryViewHolder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context.getApplicationContext(), DetailListActivity.class);
                i.putExtra("name",getListRoles().get(position).getName());
                i.putExtra("deskrip",getListRoles().get(position).getDeskrip());
                i.putExtra("gambar",getListRoles().get(position).getPhoto());
                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return getListRoles().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;
        LinearLayout detail_list;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            detail_list = itemView.findViewById(R.id.list_linier);
        }
    }
}