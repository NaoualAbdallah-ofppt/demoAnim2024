package aa.bb.demoanim;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn5;
    ImageView img;
    Animation Anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btnFade);
        btn1.setOnClickListener(this);
        btn2 = (Button)findViewById(R.id.btnScale);
        btn2.setOnClickListener(this);
        btn3 = (Button)findViewById(R.id.btnRotate);
        btn3.setOnClickListener(this);
        btn4 = (Button)findViewById(R.id.btnTranslate);

        btn4.setOnClickListener(this);
        btn5 = (Button)findViewById(R.id.btnCode);

        btn5.setOnClickListener(this);
        img = (ImageView)findViewById(R.id.imgAnimation);

    }

    @Override
    public void onClick(View v) {
        int eltId=v.getId();
            if (eltId==R.id.btnFade){
                Anim= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                img.startAnimation(Anim);
                return;}
            if (eltId==R.id.btnScale){
                Anim=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scaleanim);
                img.startAnimation(Anim);
                return;}
        if (eltId==R.id.btnRotate){
                Anim=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotateanim);
                img.startAnimation(Anim);
                return;}
        if (eltId==R.id.btnTranslate){
                Anim=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translateanim);
                img.startAnimation(Anim);
                return;}
        if (eltId== R.id.btnCode){
                img.animate()
                        .alpha(0.5f)
                        .translationX(200)
                        .setDuration(5000)
                        .setListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                Toast.makeText(MainActivity.this,"Ok",Toast.LENGTH_LONG).show();
                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        }).setStartDelay(500).start();
                return;}
        }



}