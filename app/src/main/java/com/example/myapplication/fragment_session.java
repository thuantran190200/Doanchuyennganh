package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.model.Session_gv;

import java.util.ArrayList;
import java.util.List;


public class fragment_session extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private RecyclerView rcv_sessiongv;
    private SessionGV_Adaper sessionGV_adaper;



    public fragment_session() {
        // Required empty public constructor
    }


    public static fragment_session newInstance(String param1, String param2) {
        fragment_session fragment = new fragment_session();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_session, container, false);

        rcv_sessiongv = (RecyclerView) view.findViewById(R.id.rcv_sessiongv);
        sessionGV_adaper = new SessionGV_Adaper(getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL,false);
        //LinearLayoutManager linearLayoutManager = new view.LinearLayoutManager(this);
        rcv_sessiongv.setLayoutManager(layoutManager);

        sessionGV_adaper.setData(getListSessionGV());
        rcv_sessiongv.setAdapter(sessionGV_adaper);
        return view;
    }





    //vi???t h??m load m??n h???c
    private List<Session_gv> getListSessionGV(){
        List<Session_gv> list = new ArrayList<>();

        list.add(new Session_gv(1,"M??n h???c: "+("C??ng ngh??? ph???n m???m"),"L???p: "+("18DTHB4"),"Nh??m HP: "+("9")));
        list.add(new Session_gv(2,"Ki???m th??? v?? ?????m b???o ch???t l?????ng ph???n m???m","18DTHB3","6"));
        list.add(new Session_gv(3,"L???p tr??nh m???ng","18DTHB3","5"));
        list.add(new Session_gv(4,"Th???c h??nh l???p tr??nh m???ng","18DTHA3","2"));
        list.add(new Session_gv(5,"K??? n??ng thuy???t tr??nh v?? t??m vi???c","18DTHB9","6"));
        list.add(new Session_gv(6,"C??ng ngh??? ph???n m???m","18DTHB3","10"));
        return  list;
    }

}