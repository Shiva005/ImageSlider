package com.sab.imageslider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class Adapter extends RecyclerView.Adapter <Adapter.viewModel>{

    private final Model[] sliderData;

    public Adapter(Model[] sliderData) {
        this.sliderData=sliderData;
    }

    @NonNull
    @Override
    public Adapter.viewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_design,parent,false);
        return new viewModel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewModel holder, int position) {
        final Model model= sliderData[position];
        holder.sliderImage.setImageResource(model.getImages());
        holder.sliderText.setText(model.getTexts());
    }

    @Override
    public int getItemCount() {
        return sliderData.length;
    }

    public class viewModel extends RecyclerView.ViewHolder {
        ImageView sliderImage;
        TextView sliderText;
        public viewModel(@NonNull View itemView) {
            super(itemView);
            sliderImage=itemView.findViewById(R.id.iv);
            sliderText=itemView.findViewById(R.id.tv);
        }
    }
}
