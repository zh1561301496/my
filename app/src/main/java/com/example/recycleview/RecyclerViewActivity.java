package com.example.recycleview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

    initFruits();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        /*RecyclerView通过LayoutManager来实现布局排列管理*/
        //下列两行代码用于实现线性滚动布局，默认为纵向滚动
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);


        recyclerView.setLayoutManager(layoutManager);
        FruitAdapterR adapterR = new FruitAdapterR(fruitList);
        recyclerView.setAdapter(adapterR);
    }
    private void initFruits(){
        Fruit apple =new Fruit("牙膏",R.drawable.yagao);
        fruitList.add(apple);
        Fruit banana =new Fruit("牙刷",R.drawable.yashua);
        fruitList.add(banana);
        Fruit orange=new Fruit("镜子",R.drawable.jingzi);
        fruitList.add(orange);
        Fruit lemon =new Fruit("台灯",R.drawable.taideng);
        fruitList.add(lemon);
        Fruit peach =new Fruit("纸",R.drawable.zhi);
        fruitList.add(peach);
        Fruit pear =new Fruit("矿泉水",R.drawable.shui);
        fruitList.add(pear);
        Fruit strawberry =new Fruit("猪肉",R.drawable.rou);
        fruitList.add(strawberry);
        Fruit grape =new Fruit("塑料袋",R.drawable.suliaodai);
        fruitList.add(grape);
        Fruit  mango=new Fruit("smile",R.drawable.smile);
        fruitList.add(mango);
    }


}