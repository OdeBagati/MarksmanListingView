package com.example.listingview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridRolesAdapter extends RecyclerView.Adapter<GridRolesAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<Roles> listRoles;
    private ArrayList<Roles> getListRoles() {
        return listRoles;
    }
    public void setListRoles(ArrayList<Roles> listRoles) {
        this.listRoles = listRoles;
    }
    public GridRolesAdapter(Context context) {
        this.context = context;
    }
    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_roles, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, final int position) {
        Glide.with(context)
                .load(getListRoles().get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {
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

    public class GridViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
