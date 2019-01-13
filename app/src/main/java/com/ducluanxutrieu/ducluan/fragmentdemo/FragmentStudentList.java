package com.ducluanxutrieu.ducluan.fragmentdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentStudentList extends Fragment {
    RecyclerView recyclerView;
    ArrayList<Student> students;
    StudentAdapter adapter;
    TransferData transferData;

    public FragmentStudentList(){}

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        transferData = (TransferData) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_list, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        DividerItemDecoration decoration = new DividerItemDecoration(view.getContext(), manager.getOrientation());
        recyclerView.addItemDecoration(decoration);

        adapter = new StudentAdapter(students, getContext());

        recyclerView.setAdapter(adapter);
        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addStudents();
    }

    private void addStudents(){
        students = new ArrayList<>();
        students.add(new Student(R.drawable.boy, "Luan", "16520704", "Sài gòn", "10"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.girl, "Tuyet", "16520705", "Hà nội", "9"));
        students.add(new Student(R.drawable.boy, "A", "16520706", "Quảng Trị", "10"));
        students.add(new Student(R.drawable.girl, "B", "16520707", "Bình Thuận", "10"));
        students.add(new Student(R.drawable.boy, "C", "16520708", "Temp", "7"));
        students.add(new Student(R.drawable.boy, "C", "16520708", "Temp", "7"));
        students.add(new Student(R.drawable.boy, "C", "16520708", "Temp", "7"));
        students.add(new Student(R.drawable.boy, "C", "16520708", "Temp", "7"));
        students.add(new Student(R.drawable.boy, "C", "16520708", "Temp", "7"));
        students.add(new Student(R.drawable.boy, "C", "16520708", "Temp", "7"));
        students.add(new Student(R.drawable.boy, "C", "16520708", "Temp", "7"));
        students.add(new Student(R.drawable.boy, "C", "16520708", "Temp", "7"));
        students.add(new Student(R.drawable.boy, "C", "16520708", "Temp", "7"));
        students.add(new Student(R.drawable.boy, "C", "16520708", "Temp", "7"));
        students.add(new Student(R.drawable.boy, "C", "16520708", "Temp", "7"));
        students.add(new Student(R.drawable.boy, "C", "16520708", "Temp", "7"));
        students.add(new Student(R.drawable.boy, "C", "16520708", "Temp", "7"));
        students.add(new Student(R.drawable.boy, "C", "16520708", "Temp", "7"));
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
