package com.example.day06;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterLaptop extends RecyclerView.Adapter<AdapterLaptop.ViewHolder> {

    private ArrayList<ModelLaptop> modelLaptop;
    private OnItemClickListener listener;

    public AdapterLaptop(ArrayList<ModelLaptop> modelLaptop) {
        this.modelLaptop = modelLaptop;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.namaLaptop.setText(modelLaptop.get(position).getNamaLaptop());
        holder.gambarLaptop.setImageResource(modelLaptop.get(position).getGambarLaptop());
    }

    @Override
    public int getItemCount() {
        return modelLaptop.size();
    }

    public interface OnItemClickListener {
        void onItemClick(ModelLaptop model);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView namaLaptop;
        ImageView gambarLaptop;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaLaptop = itemView.findViewById(R.id.nama_laptop);
            gambarLaptop = itemView.findViewById(R.id.laptops_image);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    listener.onItemClick(modelLaptop.get(position));
                }
            }
        }
    }
}
