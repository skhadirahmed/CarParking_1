package com.khadir.android.carparking;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SlotAdapter extends RecyclerView.Adapter<SlotAdapter.MyViewHolder> {

    private List<Slot> slotList;

    public SlotAdapter(List<Slot> slotList) {
        this.slotList = slotList;
    }

    @NonNull
    @Override
    public SlotAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_slot, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SlotAdapter.MyViewHolder holder, int position) {
        Log.e("position", "" + position);
        Slot slot = slotList.get(position);

        if (position % 11 == 0 || position == 0) {
            switch (position) {
                case 0:
                    holder.single_slot_text.setText("A");
                    break;
                case 11:
                    holder.single_slot_text.setText("B");
                    break;
                case 22:
                    holder.single_slot_text.setText("C");
                    break;
                case 33:
                    holder.single_slot_text.setText("D");
                    break;
                case 44:
                    holder.single_slot_text.setText("E");
                    break;
                case 55:
                    holder.single_slot_text.setText("F");
                    break;
                case 66:
                    holder.single_slot_text.setText("G");
                    break;
                case 77:
                    holder.single_slot_text.setText("H");
                    break;
                case 88:
                    holder.single_slot_text.setText("I");
                    break;
                case 99:
                    holder.single_slot_text.setText("J");
                    break;
            }
        } else if (slot.isAvailable()) {
            holder.single_slot.setImageResource(R.drawable.availabe);
        } else {
            holder.single_slot.setImageResource(R.drawable.not_available);
        }

    }

    @Override
    public int getItemCount() {
        return slotList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView single_slot;
        public TextView single_slot_text;

        public MyViewHolder(View itemView) {
            super(itemView);
            single_slot = itemView.findViewById(R.id.single_slot);
            single_slot_text = itemView.findViewById(R.id.single_slot_text);
        }
    }


}
