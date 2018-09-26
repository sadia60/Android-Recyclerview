package com.example.aleenarehman.aleena;

/**
 * Created by Aleena Rehman on 11/09/2017.
 */


import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context context;
    ArrayList<Flag> flagList = new ArrayList<>();
    int position;

    public MyAdapter(ArrayList<Flag> objects,Context cont) {
        this.context = cont;
        this.flagList = objects;

    }
    @Override
    public int getItemCount() {
        return flagList.size();
    }

    private Context getContext() {
        return context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView FM;
        public TextView FN;

        public ViewHolder(final Context contxt, View v) {
            super(v);
            this.FM = (ImageView)v.findViewById(R.id.imageView);
            this.FN = (TextView)v.findViewById(R.id.textView);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    Intent intent = new Intent(view.getContext(), MediaActivity.class);
                    System.out.println("hi"+flagList.get(position).getFlagName() );
                    intent.putExtra("FlagName", flagList.get(position).getFlagName());
                    intent.putExtra("FlagKey",flagList.get(position).getKey());
                    contxt.startActivity(intent);
                }

            });

        }
    }
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grid_view_items, parent, false);

        ViewHolder flag = new ViewHolder(getContext(), view);
        return flag;
    }
    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        Flag F = flagList.get(position);
        holder.FM.setImageResource(F.fImage);
        holder.FN.setText(String.valueOf(F.fName));
    }
}

