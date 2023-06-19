package com.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvUserInput, tvCalculationOutput;
    AppCompatButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b00, bDot;
    AppCompatButton opClearAll, opModulus, opClear, opDiv, opMul, opMin, opPlus, opIsEq2;

    CalculatorAction calculatorAction;

    String firstNumber = "", secondNumber = "", outputText = "", inputText = "";

    Boolean isResultCalculated = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUserInput = findViewById(R.id.solution_tv);
        tvCalculationOutput = findViewById(R.id.result_tv);

        // number button ids
        b1 = findViewById(R.id.btn_one);
        b2 = findViewById(R.id.btn_two);
        b3 = findViewById(R.id.btn_three);
        b4 = findViewById(R.id.btn_four);
        b5 = findViewById(R.id.btn_five);
        b6 = findViewById(R.id.btn_six);
        b7 = findViewById(R.id.btn_seven);
        b8 = findViewById(R.id.btn_eight);
        b9 = findViewById(R.id.btn_nine);
        b0 = findViewById(R.id.btn_zero);
        b00 = findViewById(R.id.btn_double_zero);
        bDot = findViewById(R.id.btn_dot);

        // operator button ids
        opClearAll = findViewById(R.id.btn_clearAll); // C
        opModulus = findViewById(R.id.btn_modulus); // %
        opClear = findViewById(R.id.btn_clear); // ⌫
        opDiv = findViewById(R.id.btn_divide); // ÷
        opMul = findViewById(R.id.btn_multiply); // x
        opMin = findViewById(R.id.btn_minus); // -
        opPlus = findViewById(R.id.btn_plus); // +
        opIsEq2 = findViewById(R.id.btn_isEqualTo); // =

        // Set click listeners on operators
        opClearAll.setOnClickListener(this);
        opModulus.setOnClickListener(this);
        opClear.setOnClickListener(this);
        opDiv.setOnClickListener(this);
        opMul.setOnClickListener(this);
        opMin.setOnClickListener(this);
        opPlus.setOnClickListener(this);
        opIsEq2.setOnClickListener(this);

        // Set click listeners on numbers
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        b00.setOnClickListener(this);
        bDot.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        AppCompatButton clickedButton = (AppCompatButton) view;
        int viewId = view.getId();

        // Number Section
        if (viewId == R.id.btn_one) {
            if (isResultCalculated) {
                isResultCalculated = false;
                clearAll();
            }
            if (calculatorAction == null) {
                firstNumber = firstNumber + clickedButton.getText();
            } else {
                secondNumber = secondNumber + clickedButton.getText();
            }
            inputText = inputText + clickedButton.getText();
            setInputText();
        }

        if (viewId == R.id.btn_two) {
            if (isResultCalculated) {
                isResultCalculated = false;
                clearAll();
            }
            if (calculatorAction == null) {
                firstNumber = firstNumber + clickedButton.getText();
            } else {
                secondNumber = secondNumber + clickedButton.getText();
            }
            inputText = inputText + clickedButton.getText();
            setInputText();
        }

        if (viewId == R.id.btn_three) {
            if (isResultCalculated) {
                isResultCalculated = false;
                clearAll();
            }
            if (calculatorAction == null) {
                firstNumber = firstNumber + clickedButton.getText();
            } else {
                secondNumber = secondNumber + clickedButton.getText();
            }
            inputText = inputText + clickedButton.getText();
            setInputText();
        }

        if (viewId == R.id.btn_four) {
            if (isResultCalculated) {
                isResultCalculated = false;
                clearAll();
            }
            if (calculatorAction == null) {
                firstNumber = firstNumber + clickedButton.getText();
            } else {
                secondNumber = secondNumber + clickedButton.getText();
            }
            inputText = inputText + clickedButton.getText();
            setInputText();
        }

        if (viewId == R.id.btn_five) {
            if (isResultCalculated) {
                isResultCalculated = false;
                clearAll();
            }
            if (calculatorAction == null) {
                firstNumber = firstNumber + clickedButton.getText();
            } else {
                secondNumber = secondNumber + clickedButton.getText();
            }
            inputText = inputText + clickedButton.getText();
            setInputText();
        }

        if (viewId == R.id.btn_six) {
            if (isResultCalculated) {
                isResultCalculated = false;
                clearAll();
            }
            if (calculatorAction == null) {
                firstNumber = firstNumber + clickedButton.getText();
            } else {
                secondNumber = secondNumber + clickedButton.getText();
            }
            inputText = inputText + clickedButton.getText();
            setInputText();
        }

        if (viewId == R.id.btn_seven) {
            if (isResultCalculated) {
                isResultCalculated = false;
                clearAll();
            }
            if (calculatorAction == null) {
                firstNumber = firstNumber + clickedButton.getText();
            } else {
                secondNumber = secondNumber + clickedButton.getText();
            }
            inputText = inputText + clickedButton.getText();
            setInputText();
        }

        if (viewId == R.id.btn_eight) {
            if (isResultCalculated) {
                isResultCalculated = false;
                clearAll();
            }
            if (calculatorAction == null) {
                firstNumber = firstNumber + clickedButton.getText();
            } else {
                secondNumber = secondNumber + clickedButton.getText();
            }
            inputText = inputText + clickedButton.getText();
            setInputText();
        }

        if (viewId == R.id.btn_nine) {
            if (isResultCalculated) {
                isResultCalculated = false;
                clearAll();
            }
            if (calculatorAction == null) {
                firstNumber = firstNumber + clickedButton.getText();
            } else {
                secondNumber = secondNumber + clickedButton.getText();
            }
            inputText = inputText + clickedButton.getText();
            setInputText();
        }
        //zero
        if (viewId == R.id.btn_zero) {
            if (isResultCalculated) {
                isResultCalculated = false;
                clearAll();
            }
            if (calculatorAction == null) {
                firstNumber = firstNumber + clickedButton.getText();
            } else {
                secondNumber = secondNumber + clickedButton.getText();
            }
            inputText = inputText + clickedButton.getText();
            setInputText();
        }
        //double zero
        if (viewId == R.id.btn_double_zero) {
            if (isResultCalculated) {
                isResultCalculated = false;
                clearAll();
            }
            if (calculatorAction == null) {
                firstNumber = firstNumber + clickedButton.getText();
            } else {
                secondNumber = secondNumber + clickedButton.getText();
            }
            inputText = inputText + clickedButton.getText();
            setInputText();
        }
        //dot
        if (viewId == R.id.btn_dot){
            if (isResultCalculated) {
                isResultCalculated = false;
                clearAll();
            }
            if (calculatorAction == null) {
                firstNumber = firstNumber + clickedButton.getText();
            } else {
                secondNumber = secondNumber + clickedButton.getText();
            }
            inputText = inputText + clickedButton.getText();
            setInputText();
        }


        // Operator Section

        //plus
        if (viewId == R.id.btn_plus) performCalculatorAction(CalculatorAction.ADD);
        //minus
        if (viewId == R.id.btn_minus) performCalculatorAction(CalculatorAction.SUBTRACT);
        //multiply
        if (viewId == R.id.btn_multiply) performCalculatorAction(CalculatorAction.MULTIPLY);
        //divide
        if (viewId == R.id.btn_divide) performCalculatorAction(CalculatorAction.DIVIDE);
        //modulus
        if (viewId == R.id.btn_modulus) {
            if (inputText.isEmpty()) return;
            if (calculatorAction == null){
                float result = getFirstNumber() / 100;
                firstNumber = String.valueOf(result);
                inputText = firstNumber;
                setInputText();
            } else {
                if (secondNumber.isEmpty()) return;
                float result = getSecondNumber() / 100;
                secondNumber = String.valueOf(result);
                inputText = firstNumber + getString(calculatorAction.getSymbol()) + secondNumber;
                setInputText();
            }
        }
        //is equals to
        if (viewId == R.id.btn_isEqualTo) {
            if (firstNumber.isEmpty() || secondNumber.isEmpty()) return;
            calculateResult();
        }
        //clear all
        if (viewId == R.id.btn_clearAll) {
            if (inputText.isEmpty()) return;
            clearAll();
        }
        //clear
        if (viewId == R.id.btn_clear){
            if (inputText.isEmpty()) return;
            clearOutputText();
            if (!secondNumber.isEmpty()){
                secondNumber = secondNumber.replaceFirst(".$","");
                inputText = inputText.replaceFirst(".$","");
            } else if (calculatorAction != null) {
                calculatorAction = null;
                inputText = inputText.replaceFirst(".$","");
            } else {
                firstNumber = firstNumber.replaceFirst(".$","");
                inputText = inputText.replaceFirst(".$","");
            }
            setInputText();
        }
    }

    private void clearAll() {
        calculatorAction = null;
        firstNumber = "";
        secondNumber = "";
        inputText = "";
        outputText = "";
        clearInputText();
        clearOutputText();
    }

    private void handleMoreThanTwoNumbers() {
        float result = calculateResult();
        firstNumber = String.valueOf(result);
        secondNumber = "";
        inputText = firstNumber;
        setInputText();
        isResultCalculated = false;
    }

    private void performCalculatorAction(CalculatorAction action) {
        if (inputText.isEmpty()) return;
        clearOutputText();
        if (calculatorAction != null) handleMoreThanTwoNumbers();
        calculatorAction = action;
        inputText = inputText + getString(calculatorAction.getSymbol());
        setInputText();
    }

    private float calculateResult() {
        isResultCalculated = true;
        float result;
        if (calculatorAction == CalculatorAction.ADD) result = getFirstNumber() + getSecondNumber();
        else if (calculatorAction == CalculatorAction.SUBTRACT)
            result = getFirstNumber() - getSecondNumber();
        else if (calculatorAction == CalculatorAction.MULTIPLY)
            result = getFirstNumber() * getSecondNumber();
        else if (calculatorAction == CalculatorAction.DIVIDE)
            result = getFirstNumber() / getSecondNumber();
        else result = 0f;
        outputText = String.valueOf(result);
        setOutputText();
        return result;
    }

    private float getFirstNumber() {
        return Float.parseFloat(firstNumber);
    }

    private float getSecondNumber() {
        return Float.parseFloat(secondNumber);
    }

    private void setInputText() {
        tvUserInput.setText(inputText);
    }

    private void clearInputText() {
        tvUserInput.setText("");
    }

    private void setOutputText() {
        tvCalculationOutput.setText(outputText);
    }

    private void clearOutputText() {
        tvCalculationOutput.setText("");
    }
}
