package com.example.music.tab_music;

import android.content.Context;
import android.media.Image;
import android.media.MediaMetadataRetriever;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.music.R;

import java.io.IOException;
import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MyViewHolder> {
    private Context mcontext;
    private ArrayList<MusicFiles> mFiles;
    MusicAdapter (Context mcontext,ArrayList<MusicFiles>mFiles){
        this.mcontext=mcontext;
        this.mFiles=mFiles;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.music_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.music_name.setText(mFiles.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return mFiles.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView music_name;
        ImageView album_img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            music_name=itemView.findViewById(R.id.music_name);
            album_img=itemView.findViewById(R.id.music_img);
        }
    }

}
