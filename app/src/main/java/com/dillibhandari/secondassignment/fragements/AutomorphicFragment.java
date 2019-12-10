package com.dillibhandari.secondassignment.fragements;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dillibhandari.secondassignment.R;
import com.dillibhandari.secondassignment.algorithm.Arithmetica;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutomorphicFragment extends Fragment {

    private EditText et_input;
    private Button btnautomorphic;
    private TextView tvResult;
    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_automorphic, container, false);
        et_input = view.findViewById(R.id.et_input);
        btnautomorphic=view.findViewById(R.id.btnautomorphic);
        tvResult = view.findViewById(R.id.tvResult);

        btnautomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(et_input.getText().toString())){
                    et_input.setError("Enter some Text");
                    et_input.requestFocus();
                    return;
                }
                int getInput = Integer.parseInt(et_input.getText().toString());
                Arithmetica algorithm= new Arithmetica();
                tvResult.setText( algorithm.automorphicNum(getInput));
            }
        });
        return  view;
    }
}
