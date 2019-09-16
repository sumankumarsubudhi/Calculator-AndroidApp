    package com.example.sumankumarsubudhi.calculator;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        TextView resultDisplay, operationsDisplay, operationValue;
        boolean mAddition, mSubtract, mMultiplication, mDivision ;
        float Value1, Value2;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            resultDisplay = findViewById(R.id.view_result);
            operationsDisplay = findViewById(R.id.view_operation);
            operationValue = findViewById(R.id.view_operation2);

        }

        public void clickDigit1(View v) {

            operationsDisplay.setText(operationsDisplay.getText()+"1");
            operationValue.setText(operationValue.getText()+"1");
        }

        public void clickDigit2(View v) {

            operationsDisplay.setText(operationsDisplay.getText()+"2");
            operationValue.setText(operationValue.getText()+"2");
        }

        public void clickDigit3(View v) {

            operationsDisplay.setText(operationsDisplay.getText()+"3");
            operationValue.setText(operationValue.getText()+"3");
        }

        public void clickDigit4(View v) {

            operationsDisplay.setText(operationsDisplay.getText()+"4");
            operationValue.setText(operationValue.getText()+"4");
        }

        public void clickDigit5(View v) {

            operationsDisplay.setText(operationsDisplay.getText()+"5");
            operationValue.setText(operationValue.getText()+"5");
        }

        public void clickDigit6(View v) {

            operationsDisplay.setText(operationsDisplay.getText() + "6");
            operationValue.setText(operationValue.getText()+"6");
        }

        public void clickDigit7(View v) {

            operationsDisplay.setText(operationsDisplay.getText()+"7");
            operationValue.setText(operationValue.getText()+"7");
        }

        public void clickDigit8(View v) {

            operationsDisplay.setText(operationsDisplay.getText()+"8");
            operationValue.setText(operationValue.getText()+"8");
        }

        public void clickDigit9(View v) {

            operationsDisplay.setText(operationsDisplay.getText()+"9");
            operationValue.setText(operationValue.getText()+"9");
        }

        public void clickDigit0(View v) {

            operationsDisplay.setText(operationsDisplay.getText()+"0");
            operationValue.setText(operationValue.getText()+"0");
        }

        public void clickDot(View v) {

            operationsDisplay.setText(operationsDisplay.getText()+".");
            operationValue.setText(operationValue.getText()+".");
        }



        public void clickAddition(View v) {

            if (operationsDisplay == null){
                operationsDisplay.setText("");
            }else {
                Value1 = Float.parseFloat(operationValue.getText() + "");
                mAddition = true;
                operationsDisplay.setText(operationsDisplay.getText() + "+");
                operationValue.setText(null);
                }
        }


        public void clickSubtraction(View v) {
            Value1 = Float.parseFloat(operationValue.getText() + "");
            mSubtract = true ;
            operationsDisplay.setText(operationsDisplay.getText() + "-");
            operationValue.setText(null);
        }


        public void clickMultiplication(View v) {
            Value1 = Float.parseFloat(operationValue.getText() + "");
            mMultiplication = true ;
            operationsDisplay.setText(operationsDisplay.getText() + "*");
            operationValue.setText(null);
        }


        public void clickDivision(View v) {
            Value1 = Float.parseFloat(operationValue.getText()+"");
            mDivision = true ;
            operationsDisplay.setText(operationsDisplay.getText() + "/");
            operationValue.setText(null);
        }


        public void clickEquals(View v) {
            Value2 = Float.parseFloat(operationValue.getText() + "");
            if (mAddition == true){
                double final_result;
                final_result = Value1 + Value2;
                if(final_result%1 != 0.0){
                    resultDisplay.setText(final_result +"");}
                    else{
                        resultDisplay.setText((int) final_result + "");
                    }
                    mAddition=false;
            }


            if (mSubtract == true){
                double final_result;
                final_result = Value1 - Value2;
                if(final_result%1 != 0.0){
                    resultDisplay.setText(final_result +"");}
                    else{
                        resultDisplay.setText((int) final_result + "");
                    }
                    mSubtract=false;
            }

            if (mMultiplication == true){
                double final_result;
                final_result = Value1 * Value2;
                if(final_result%1 != 0.0){
                    resultDisplay.setText(final_result +"");}
                    else{
                        resultDisplay.setText((int) final_result + "");
                    }
                    mMultiplication=false;
            }

            if (mDivision == true){
                double final_result;
                final_result = Value1 / Value2;
                if(final_result%1 != 0.0){
                    resultDisplay.setText(final_result +"");}
                    else{
                        resultDisplay.setText((int) final_result + "");
                    }
                    mDivision=false;
            }
        }


        public void clickClear(View v) {
            operationsDisplay.setText("");
            operationValue.setText("");
            resultDisplay.setText("");
        }

    }
