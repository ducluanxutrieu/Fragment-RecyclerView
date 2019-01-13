package com.ducluanxutrieu.ducluan.fragmentdemo;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TransferData{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        FragmentStudentList studentList = new FragmentStudentList();
        FragmentStudentInfo studentInfo = new FragmentStudentInfo();
        transaction.add(R.id.frame_list_student, studentList);
        transaction.add(R.id.frame_info_student, studentInfo);
*//*
        //gửi dữ liệu rồi bên studentList getArguments rồi setText tùy ý
        Bundle bundle = new Bundle();
        bundle.putString("temp", "Nội dung");
        studentList.setArguments(bundle);*//*
        transaction.commit();*/
    }

    @Override
    public void transferStudent(Student student) {
        FragmentStudentInfo studentInfo = (FragmentStudentInfo) getSupportFragmentManager().findFragmentById(R.id.fragment_info);
        studentInfo.setInfo(student);
    }
}
