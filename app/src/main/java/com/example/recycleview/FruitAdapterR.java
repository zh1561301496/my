package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitAdapterR extends RecyclerView.Adapter<FruitAdapterR.ViewHolderR>{
    private List<Fruit> mFruitList;

    public FruitAdapterR(List<Fruit> fruitList) {
        mFruitList = fruitList;
    }

    /*onCreateViewHolder方法用于引入子项布局创建ViewHolderR实例，并将加载出的布局传入构造函数中，最后返回该实例*/
    @NonNull
    @Override
    public ViewHolderR onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item, parent, false);

        final ViewHolderR holderR = new ViewHolderR(view);

        /*此代码块用于实现RecyclerView中的点击事件*/


        holderR.fruitName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holderR.getAdapterPosition();
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(view.getContext(), "You Click view " + fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        holderR.fruitImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holderR.getAdapterPosition();
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(view.getContext(), "You Click view " + fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        return holderR;
    }

    /*onBindViewHolder方法用于对RecyclerView子项的数据进行赋值，即将Fruit实例取出的图片和文本信息设置ViewHolderR中对应变量*/
    @Override
    public void onBindViewHolder(@NonNull ViewHolderR holder, int position) {
        Fruit fruit = mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
    }

    /*getItemCount方法用于告诉RecyclerView一共有多少个子项*/
    @Override
    public int getItemCount() {
        return mFruitList.size();
    }

    static class ViewHolderR extends RecyclerView.ViewHolder {
        //View fruitView;    //为点击事件做准备
        ImageView fruitImage;
        TextView fruitName;

        public ViewHolderR(@NonNull View itemView) {
            super(itemView);
            //fruitView = itemView;     //为点击事件做准备
            fruitImage = itemView.findViewById(R.id.fruit_image);
            fruitName = itemView.findViewById(R.id.fruit_name);
        }
    }
}
