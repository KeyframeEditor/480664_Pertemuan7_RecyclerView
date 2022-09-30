package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    private final ArrayList<Animal> values;
    private final LayoutInflater inflater;

    public AnimalAdapter(Context context,ArrayList<Animal> values) {
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AnimalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_animal, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AnimalAdapter.ViewHolder holder, int position) {
        final Animal animal = values.get(position);
        holder.txt_name.setText(animal.name);
        holder.txtColor.setText(animal.color);
        holder.txt_description.setText(animal.desc);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "This is: "+animal.name, Toast.LENGTH_SHORT).show();
            }
        });
//        holder.btnClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(holder.itemView.getContext(),DetailAnimalActivity.class);
//                intent.putExtra("name",animal.name);
//                intent.putExtra("color",animal.color);
//                intent.putExtra("desc",animal.desc);
//                v.getContext().startActivity(intent);
//            }
//        });
    }

//    @Override
//    public void onBindViewHolder(@NonNull final AnimalAdapter.ViewHolder holder, position) {
//        final Animal animal = values.get(position);
//        holder.txt_name.setText(animal.name);
//        holder.txtColor.setText(animal.color);
//        holder.txt_description.setText(animal.desc);
//
//        holder.btnClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(holder.itemView.getContext(), String.valueOf(position), Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(holder.itemView.getContext(),DetailAnimalActivity.class);
//                intent.putExtra("name",animal.name);
//                intent.putExtra("color",animal.color);
//                intent.putExtra("desc",animal.desc);
//                v.getContext().startActivity(intent);
//            }
//        });
//    }

    @Override
    public int getItemCount() {
        return values.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_name;
        TextView txtColor;
        TextView txt_description;
//        Button btnClick;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_name = itemView.findViewById(R.id.txt_name);
            txtColor = itemView.findViewById(R.id.txt_color);
            txt_description = itemView.findViewById(R.id.txt_description);
//            btnClick = itemView.findViewById(R.id.btnClick);
        }
    }
}
