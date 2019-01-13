package com.ducluanxutrieu.ducluan.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentStudentInfo extends Fragment{
    TextView name, id, address, score;
    ImageView avatar;

    public FragmentStudentInfo(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_info, container, false);
        anhXa(view);
        return view;
    }
    public void setInfo(Student student){
        name.setText(student.getName());
        id.setText(student.getId());
        address.setText(student.getAddress());
        score.setText(student.getScore());
        avatar.setImageResource(student.getAvatar());
    }
    private void anhXa(View view){
        name = view.findViewById(R.id.name);
        id = view.findViewById(R.id.id);
        address = view.findViewById(R.id.address);
        score = view.findViewById(R.id.score);
        avatar = view.findViewById(R.id.avatar);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

}
