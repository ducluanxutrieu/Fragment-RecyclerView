package com.ducluanxutrieu.ducluan.fragmentdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder>{
    private ArrayList<Student> students;
    Context context;
    TransferData transferData;


    public StudentAdapter(ArrayList<Student> students, Context context) {
        this.students = students;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.student, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.avatar.setImageResource(students.get(i).getAvatar());
        viewHolder.name.setText(students.get(i).getName());
        viewHolder.id.setText(students.get(i).getId());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView avatar;
        TextView name, id;
        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.student_avatar);
            name = itemView.findViewById(R.id.txt_student_name);
            id = itemView.findViewById(R.id.txt_student_id);
            transferData = (TransferData) itemView.getContext();
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(context, name.getText(), Toast.LENGTH_LONG).show();
                    transferData.transferStudent(students.get(getAdapterPosition()));
                    //transferData.transferStudent(students.get(getAdapterPosition()));
                    //get position getAdapterPosition
                }
            });
        }
    }
}
