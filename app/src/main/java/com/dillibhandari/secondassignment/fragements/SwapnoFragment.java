package com.dillibhandari.secondassignment.fragements;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.dillibhandari.secondassignment.R;
import com.dillibhandari.secondassignment.algorithm.Arithmetica;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SwapnoFragment extends Fragment {
    private EditText etFirstValue,etSecValue;
    private Button btnSwap;
    public SwapnoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swapno, container, false);
        etFirstValue= view.findViewById(R.id.etFirstVale);
        etSecValue= view.findViewById(R.id.etSecVale);
        btnSwap = view.findViewById(R.id.btnSwap);

        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etFirstValue.getText().toString())){
                    etFirstValue.setError("Input First Value");
                    etFirstValue.requestFocus();
                    return;
                }
                else if(TextUtils.isEmpty(etSecValue.getText().toString())){
                    etSecValue.setError("Input second Value");
                    etSecValue.requestFocus();
                    return;
                }
                String firstvalue =etFirstValue.getText().toString();
                String secValue = etSecValue.getText().toString();
                Arithmetica algorithm = new Arithmetica();
                ArrayList<String> list =  algorithm.swap(firstvalue,secValue);
                etFirstValue.setText(list.get(0));
                etSecValue.setText(list.get(1));
            }
        });
        return view;
    }
}
