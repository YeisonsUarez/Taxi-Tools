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
import com.taxi.taxitools.modelos.ViajesModel;

import java.util.ArrayList;

public class AdaptadorViajes extends RecyclerView.Adapter {
    ArrayList<ViajesModel> itemMenus;
    Context context;
    AdaptadorViajes.onItemClickListener miListener;
    public AdaptadorViajes(ArrayList<ViajesModel> itemsMenu, Context context, AdaptadorViajes.onItemClickListener miListener) {
        this.context= context;
        this.itemMenus= itemsMenu;
        this.miListener= miListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      return   new AdaptadorViajes.viajesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.itemviajes,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final ViajesModel item= itemMenus.get(position);
       AdaptadorViajes.viajesViewHolder menuViewHolder= (AdaptadorViajes.viajesViewHolder) holder;
        menuViewHolder.nombre.setText(item.getNombreUsuario());
        menuViewHolder.pd.setText(item.getPuntoDestino());
        menuViewHolder.po.setText(item.getPuntoOrigen());
        menuViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
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
    class viajesViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView nombre,pd,po;
        public viajesViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre= itemView.findViewById(R.id.tituloItemViaje);
            pd= itemView.findViewById(R.id.desripcionItemViaje);
            po= itemView.findViewById(R.id.desripcionItemViaje3);
        }
    }
    public interface onItemClickListener{ // Puede tener cualquier nombre
        void onItemClick(ViajesModel item, int posicion);

    }
}
