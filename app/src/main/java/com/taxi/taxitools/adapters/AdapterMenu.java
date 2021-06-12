package com.taxi.taxitools.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.taxi.taxitools.R;
import com.taxi.taxitools.modelos.ItemMenu;

import java.util.ArrayList;

public class AdapterMenu extends RecyclerView.Adapter {
    ArrayList<ItemMenu> itemMenus;
    Context context;
    onItemClickListener miListener;
    public AdapterMenu(ArrayList<ItemMenu> itemsMenu, Context context, onItemClickListener miListener) {
        this.context= context;
        this.itemMenus= itemsMenu;
        this.miListener= miListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MenuViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.itemmenu,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        final ItemMenu item= itemMenus.get(position);
        MenuViewHolder menuViewHolder= (MenuViewHolder) holder;
        menuViewHolder.titulo.setText(item.titulo);
        menuViewHolder.detalle.setText(item.detalle);
        menuViewHolder.imageView.setImageDrawable(context.getResources().getDrawable(item.imagen));
        menuViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                miListener.onItemClick(item,position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemMenus.size();
    }
    class MenuViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView titulo,detalle;
        ImageView imageView;
        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView= itemView.findViewById(R.id.itemMenu);
            titulo= itemView.findViewById(R.id.tituloItemMenu);
            detalle= itemView.findViewById(R.id.desripcionItemMenu);
            imageView= itemView.findViewById(R.id.imgItemMenu);
        }
    }
    public interface onItemClickListener{ // Puede tener cualquier nombre
        void onItemClick(ItemMenu item, int posicion);

    }
}
