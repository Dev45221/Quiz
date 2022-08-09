    package com.example.quiz;
    
    import androidx.appcompat.app.AppCompatActivity;
    
    import android.graphics.Color;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.RadioButton;
    import android.widget.RadioGroup;
    import android.widget.TextView;
    import android.widget.Toast;
    
    public class MainActivity extends AppCompatActivity {
        TextView tv1,tv2,tv3;
        RadioGroup rg;
        RadioButton rb1,rb2,rb3,rb4;
        Button submit,clear;
    
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            tv1 = findViewById(R.id.tv1);
            tv2 = findViewById(R.id.tv2);
            tv3 = findViewById(R.id.tv3);
    
            rb1 = findViewById(R.id.rb1);
            rb2 = findViewById(R.id.rb2);
            rb3 = findViewById(R.id.rb3);
            rb4 = findViewById(R.id.rb4);
    
            rg = findViewById(R.id.rg);
    
            submit = findViewById(R.id.submit);
            clear = findViewById(R.id.clear);
    
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int id;
                    id = rg.getCheckedRadioButtonId();
                    if(rb3.getId() == id ) {
                        tv3.setText("Correct Answer ✓.");
                        tv3.setTextColor(Color.parseColor("white"));
                        rb1.setBackgroundColor(Color.parseColor("#C6084D"));
                        rb2.setBackgroundColor(Color.parseColor("#C6084D"));
                        rb3.setBackgroundColor(Color.parseColor("#90EE90"));
                        rb4.setBackgroundColor(Color.parseColor("#C6084D"));
                        Toast.makeText(MainActivity.this,"Correct Answer",Toast.LENGTH_SHORT).show();
                    }else {
                        tv3.setText("Wrong Answer !.");
                        tv3.setTextColor(Color.parseColor("white"));
                        rb1.setBackgroundColor(Color.parseColor("#C6084D"));
                        rb2.setBackgroundColor(Color.parseColor("#C6084D"));
                        rb3.setBackgroundColor(Color.parseColor("#90EE90"));
                        rb4.setBackgroundColor(Color.parseColor("#C6084D"));
                        Toast.makeText(MainActivity.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
                    }
                }
            });
    
            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    rg.clearCheck();
                    rb1.setBackgroundColor(Color.parseColor("#6F6A0808"));
                    rb2.setBackgroundColor(Color.parseColor("#6F6A0808"));
                    rb3.setBackgroundColor(Color.parseColor("#6F6A0808"));
                    rb4.setBackgroundColor(Color.parseColor("#6F6A0808"));
                    tv3.setTextColor(Color.parseColor("#006A0808"));
                    Toast.makeText(MainActivity.this,"Cleared.",Toast.LENGTH_SHORT).show();
                }
            });
    
        }
    }