package com.kayalprints.calculator.ui.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.kayalprints.calculator.classes.CurrentInputHolder;
import com.kayalprints.calculator.classes.ExpressionTree;
import com.kayalprints.calculator.databinding.FragmentCalculatorBinding;

public class CalculatorFragment extends Fragment {

    private FragmentCalculatorBinding binding;

    private StringBuilder histValue, currentEntered;

    private ExpressionTree equation;
    private CurrentInputHolder inputHolder;

    private boolean eqlOn = false;
    private boolean isDotOn = false;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CalculatorViewModel calculatorViewModel =
                new ViewModelProvider(this).get(CalculatorViewModel.class);

        inputHolder = new CurrentInputHolder("0","0");
        binding = FragmentCalculatorBinding.inflate(inflater, container, false);
        binding.setClickListener(this);
        binding.setInputHolder(inputHolder);

        equation = new ExpressionTree();
        histValue = new StringBuilder();
        currentEntered = new StringBuilder();
        initializeListener();

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
        inputHolder = null;
        equation = null;
    }

    private void initializeListener() {
        binding.button0.setOnClickListener(v -> insert("0"));
        binding.button1.setOnClickListener(v -> insert("1"));
        binding.button2.setOnClickListener(v -> insert("2"));
        binding.button3.setOnClickListener(v -> insert("3"));
        binding.button4.setOnClickListener(v -> insert("4"));
        binding.button5.setOnClickListener(v -> insert("5"));
        binding.button6.setOnClickListener(v -> insert("6"));
        binding.button7.setOnClickListener(v -> insert("7"));
        binding.button8.setOnClickListener(v -> insert("8"));
        binding.button9.setOnClickListener(v -> insert("9"));

        binding.buttonPlus.setOnClickListener(v -> signClicked("+"));
        binding.buttonMinus.setOnClickListener(v -> signClicked("-"));
        binding.buttonDivide.setOnClickListener(v -> signClicked("/"));
        binding.buttonMulti.setOnClickListener(v -> signClicked("*"));
        binding.buttonExpo.setOnClickListener(v -> signClicked("^"));
    }

    public void del(View v) {
        if(!eqlOn) {
            Log.i("test","in del(1) -- Current: "+currentEntered+" -- Hist: "+histValue+" -- Exp: "+equation.getRE()+" -- value: "+equation.getExpValue());

            if(currentEntered.length() > 0) {
                if(currentEntered.charAt(currentEntered.length()-1) == '.') isDotOn = false;
                currentEntered.deleteCharAt(currentEntered.length() - 1);
                if (currentEntered.length() > 0) inputHolder.setResult(wrapFormat(currentEntered));
                else inputHolder.setResult("0");

                histValue.deleteCharAt(histValue.length() - 1);
                inputHolder.setHist(histValue.toString());
                Log.i("test","in del(2) -- Current: "+currentEntered+" -- Hist: "+histValue+" -- Exp: "+equation.getRE()+" -- value: "+equation.getExpValue());
            } else if(histValue.length()>0) {
                currentEntered.append(histValue);
                Log.i("test","in del(3) -- Current: "+currentEntered+" -- Hist: "+histValue+" -- Exp: "+equation.getRE()+" -- value: "+equation.getExpValue());
                del(v);
            } else binding.buttonDelete.setClickable(false);
        } else ac(binding.buttonAC);
    }

    public void ac(View v) {
        Log.i("test","in ac(1) -- Current: "+currentEntered+" -- Hist: "+histValue+" -- Exp: "+equation.getRE()+" -- value: "+equation.getExpValue());

        inputHolder.setResult("0");
        histValue.delete(0, histValue.length());
        currentEntered.delete(0,currentEntered.length());
        inputHolder.setHist("0");
        isDotOn = false;
        equation.clearExpTree();
        Log.i("test","in ac(2) -- Current: "+currentEntered+" -- Hist: "+histValue+" -- Exp: "+equation.getRE()+" -- value: "+equation.getExpValue());
    }

    public void dot(View v) {
        if(!isDotOn) {
            insert(".");
            isDotOn = true;
        }
    }

    public void equal(View v) {
        if(!eqlOn) {
            equation.clearExpTree();
            equation.addExp(histValue.toString());
            Log.i("test","in equal(1) -- Current: "+currentEntered+" -- Hist: "+histValue+" -- Exp: "+equation.getRE()+" -- value: "+equation.getExpValue());

            if (equation.canGetValue()) {
                Log.i("test","in equal(2) -- Current: "+currentEntered+" -- Hist: "+histValue+" -- Exp: "+equation.getRE()+" -- value: "+equation.getExpValue());

                currentEntered.delete(0,currentEntered.length());
                currentEntered.append(equation.getExpValue());
                inputHolder.setResult(wrapFormat(currentEntered));
                histValue.delete(0,histValue.length());
                histValue.append(equation.getExpValue());
                inputHolder.setHist(histValue.toString());
                eqlOn = true;

                Log.i("test","in equal(3) -- Current: "+currentEntered+" -- Hist: "+histValue+" -- Exp: "+equation.getRE()+" -- value: "+equation.getExpValue());
            } else {
                Log.i("test","in equal(4) -- Current: "+currentEntered+" -- Hist: "+histValue+" -- Exp: "+equation.getRE()+" -- value: "+equation.getExpValue());

                Toast.makeText(binding.getRoot().getContext(), "Expression is invalid.",Toast.LENGTH_LONG).show();
                binding.buttonEqual.setClickable(false);
            }
        }
    }

    private void signClicked(String c) {
        Log.i("test","in signClicked(1) -- Current: "+currentEntered+" -- Hist: "+histValue+" -- Exp: "+equation.getRE()+" -- value: "+equation.getExpValue());

        isDotOn = false;
        currentEntered.delete(0,currentEntered.length());
        eqlOn = false;
        binding.buttonEqual.setClickable(true);
        histValue.append(c);
        inputHolder.setResult(wrapFormat(currentEntered));
        inputHolder.setHist(histValue.toString());
        Log.i("test","in signClicked(2) -- Current: "+currentEntered+" -- Hist: "+histValue+" -- Exp: "+equation.getRE()+" -- value: "+equation.getExpValue());

    }

    private void callHist(String hist) {}

    private void insert(String c) {
        Log.i("test","in insert(1) -- Current: "+currentEntered+" -- Hist: "+histValue+" -- Exp: "+equation.getRE()+" -- value: "+equation.getExpValue());

        eqlOn = false;
        binding.buttonEqual.setClickable(true);
        currentEntered.append(c);
        histValue.append(c);
        inputHolder.setResult(wrapFormat(currentEntered));
        inputHolder.setHist(histValue.toString());
        Log.i("test","in insert(2) -- Current: "+currentEntered+" -- Hist: "+histValue+" -- Exp: "+equation.getRE()+" -- value: "+equation.getExpValue());
    }

    @NonNull
    private String wrapFormat(StringBuilder string) {
        StringBuilder r = new StringBuilder(string);
        int p = r.indexOf(".");

        if(r.length()>=4 && p < 0)
            for(int i = r.length()-3; i>0; i=i-3) r.insert(i,",");

        if (p >= 0)
            for(int i = p-3; i>0; i=i-3) r.insert(i,",");
        return r.toString();
    }

}