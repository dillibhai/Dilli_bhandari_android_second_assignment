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
public class AreaofCircleFragment extends Fragment {

    private EditText etRadius;
    private Button btnCalculate;
    private TextView tvAreaResult;
    public AreaofCircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_areaof_circle, container, false);
        etRadius = view.findViewById(R.id.etRadius);
        btnCalculate=view.findViewById(R.id.btnCalculate);
        tvAreaResult=view.findViewById(R.id.tvAreaResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etRadius.getText().toString())) {
                    etRadius.setError("Enter Radius of Circle");
                    etRadius.requestFocus();
                    return;
                }
                else {
                    int radius  = Integer.parseInt(etRadius.getText().toString()) ;
                    Arithmetica algorithm= new Arithmetica();
                    tvAreaResult.setText( "Area of Circle is "+Integer.toString(algorithm.areaOFCircle(radius)) );


                }
            }
        });
        return view;
    }
}
