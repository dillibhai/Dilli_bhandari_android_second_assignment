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
public class PalindromeFragment extends Fragment {

    private EditText etInput;
    private Button btnpalindrome;
    private TextView tvResult;
    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_palindrome, container, false);

        etInput = view.findViewById(R.id.etInput);
        btnpalindrome=view.findViewById(R.id.btnpalindrome);
        tvResult = view.findViewById(R.id.tvResult);

        btnpalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etInput.getText().toString())){
                    etInput.setError("Enter some Text");
                    etInput.requestFocus();
                    return;
                }
                String getInput = etInput.getText().toString();
                Arithmetica algorithm= new Arithmetica();
                tvResult.setText( algorithm.palindrome(getInput));
            }
        });
        return  view;
    }
}
