package com.bcsg.mytestapplication.fragments;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bcsg.mytestapplication.R;
import com.bcsg.mytestapplication.dao.TarefaProximaRevisao;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotifyFragment extends Fragment {

    private static final String TAG = "NotifyFragment";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_notify, container, false);

        Context context = view.getContext();
        RecyclerView recyclerView = view.findViewById(R.id.recycle_view_itens);
        TextView textView = view.findViewById(R.id.txtValorRevisao);

        TarefaProximaRevisao tarefaProximaRevisao = new TarefaProximaRevisao(context,recyclerView, textView);
        tarefaProximaRevisao.execute();

        // Inflate the layout for this fragment
        return view;
    }

}
