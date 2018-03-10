package com.alien.islam.owlxo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int turn = 0 ;
    private static int xwins = 0 , owins=0 ;
    TextView tx1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        tx1 = (TextView) findViewById(R.id.tx1);

        tx1.setText("X :"+xwins + " ,                                O :" +owins);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        b1.setText("X");
                        turn=0;
                    }
                    else if (turn ==0)
                    {
                        b1.setText("O");
                        turn = 1 ;
                    }
                }
                check();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        b2.setText("X");
                        turn=0;
                    }
                    else if (turn ==0)
                    {
                        b2.setText("O");
                        turn = 1 ;
                    }
                }
                check();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        b3.setText("X");
                        turn=0;
                    }
                    else if (turn ==0)
                    {
                        b3.setText("O");
                        turn = 1 ;
                    }
                }
                check();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b4.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        b4.setText("X");
                        turn=0;
                    }
                    else if (turn ==0)
                    {
                        b4.setText("O");
                        turn = 1 ;
                    }
                }
                check();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b5.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        b5.setText("X");
                        turn=0;
                    }
                    else if (turn ==0)
                    {
                        b5.setText("O");
                        turn = 1 ;
                    }
                }
                check();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b6.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        b6.setText("X");
                        turn=0;
                    }
                    else if (turn ==0)
                    {
                        b6.setText("O");
                        turn = 1 ;
                    }
                }
                check();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b7.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        b7.setText("X");
                        turn=0;
                    }
                    else if (turn ==0)
                    {
                        b7.setText("O");
                        turn = 1 ;
                    }
                }
                check();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b8.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        b8.setText("X");
                        turn=0;
                    }
                    else if (turn ==0)
                    {
                        b8.setText("O");
                        turn = 1 ;
                    }
                }
                check();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b9.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        b9.setText("X");
                        turn=0;
                    }
                    else if (turn ==0)
                    {
                        b9.setText("O");
                        turn = 1 ;
                    }
                }
                check();
            }
        });



    }
    public void check ()
    {
        String a,b,c,d,e,f,g,h,i ;
        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X"))
        {
            xwins++;
            Intent movX = new Intent(Main2Activity.this , Main3Activity.class);
            startActivity(movX);
        }
        if (a.equals("X") && e.equals("X") && i.equals("X"))
        {
            xwins++;
            Intent movX = new Intent(Main2Activity.this , Main3Activity.class);
            startActivity(movX);
        }
        if (a.equals("X") && d.equals("X") && g.equals("X"))
        {
            xwins++;
            Intent movX = new Intent(Main2Activity.this , Main3Activity.class);
            startActivity(movX);
        }
        if (b.equals("X") && e.equals("X") && h.equals("X"))
        {
            xwins++;
            Intent movX = new Intent(Main2Activity.this , Main3Activity.class);
            startActivity(movX);
        }
        if (c.equals("X") && f.equals("X") && i.equals("X"))
        {
            xwins++;
            Intent movX = new Intent(Main2Activity.this , Main3Activity.class);
            startActivity(movX);
        }
        if (c.equals("X") && e.equals("X") && g.equals("X"))
        {
            xwins++;
            Intent movX = new Intent(Main2Activity.this , Main3Activity.class);
            startActivity(movX);
        }
        if (d.equals("X") && e.equals("X") && f.equals("X"))
        {
            xwins++;
            Intent movX = new Intent(Main2Activity.this , Main3Activity.class);
            startActivity(movX);
        }
        if (g.equals("X") && h.equals("X") && i.equals("X"))
        {
            xwins++;
            Intent movX = new Intent(Main2Activity.this , Main3Activity.class);
            startActivity(movX);
        }


        if (a.equals("O") && b.equals("O") && c.equals("O"))
        {
            owins++;
            Intent movO = new Intent(Main2Activity.this , Main4Activity.class);
            startActivity(movO);
        }
        if (a.equals("O") && e.equals("O") && i.equals("O"))
        {
            owins++;
            Intent movO = new Intent(Main2Activity.this , Main4Activity.class);
            startActivity(movO);
        }
        if (a.equals("O") && d.equals("O") && g.equals("O"))
        {
            owins++;
            Intent movO = new Intent(Main2Activity.this , Main4Activity.class);
            startActivity(movO);
        }
        if (b.equals("O") && e.equals("O") && h.equals("O"))
        {
            owins++;
            Intent movO = new Intent(Main2Activity.this , Main4Activity.class);
            startActivity(movO);
        }
        if (c.equals("O") && f.equals("O") && i.equals("O"))
        {
            owins++;
            Intent movO = new Intent(Main2Activity.this , Main4Activity.class);
            startActivity(movO);
        }
        if (c.equals("O") && e.equals("O") && g.equals("O"))
        {
            owins++;
            Intent movO = new Intent(Main2Activity.this , Main4Activity.class);
            startActivity(movO);
        }
        if (d.equals("O") && e.equals("O") && f.equals("O"))
        {
            owins++;
            Intent movO = new Intent(Main2Activity.this , Main4Activity.class);
            startActivity(movO);
        }
        if (g.equals("O") && h.equals("O") && i.equals("O"))
        {
            owins++;
            Intent movO = new Intent(Main2Activity.this , Main4Activity.class);
            startActivity(movO);
        }

        if(!a.equals("") && !b.equals("")&& !c.equals("")&& !d.equals("")&& !e.equals("")&& !f.equals("")&& !g.equals("")&& !h.equals("")&& !i.equals(""))
        {
            owins++;
            Intent movL = new Intent(Main2Activity.this , Main5Activity.class);
            startActivity(movL);
        }

        tx1.setText("X :"+xwins + " , O :" +owins);


    }


}
