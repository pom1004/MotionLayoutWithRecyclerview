package io.armcha.motionlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FourActivity extends AppCompatActivity {

    RecyclerView mRecylerView;
    LinearLayoutManager mRecordedListLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        mRecylerView=findViewById(R.id.myWishList);

        mRecordedListLayoutManager = new LinearLayoutManager(getBaseContext(), LinearLayoutManager.VERTICAL, false);

        mRecylerView.setLayoutManager(mRecordedListLayoutManager);
        mRecylerView.setAdapter(new MyWishListAdapter(this));

    }
}
