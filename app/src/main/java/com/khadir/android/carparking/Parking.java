package com.khadir.android.carparking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Parking extends AppCompatActivity {

    private List<Slot> slotList = new ArrayList<>();
    private RecyclerView recyclerView;
    private SlotAdapter mSlotAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);
        recyclerView = findViewById(R.id.recycler_view);

        getSlotData();
        mSlotAdapter = new SlotAdapter(slotList);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 11);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, GridLayoutManager.HORIZONTAL));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, GridLayoutManager.VERTICAL));
        recyclerView.setAdapter(mSlotAdapter);
    }

    private void getSlotData() {
        Slot slot;
        for (int i = 0; i < 50; i++) {
            slot = new Slot("ahmed", "1234", "998932414", "223", false);
            slotList.add(slot);
            slot = new Slot("ahmed", "1234", "998932414", "223", true);
            slotList.add(slot);
        }
    }
}
