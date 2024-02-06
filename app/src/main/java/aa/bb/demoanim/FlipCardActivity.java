package aa.bb.demoanim;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

public class FlipCardActivity extends AppCompatActivity {
TextView card_front, card_back;
Button btn;
Animator front_animation,back_animation;
boolean isFront=true;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_flip_card);
         card_front = findViewById(R.id.card_front);
         card_back = findViewById(R.id.card_back);
         // var scale = applicationContext.resources.displayMetrics.density

         btn = findViewById(R.id.flip_btn);

         //    front.cameraDistance = 8000 * scale
         //  back.cameraDistance = 8000 * scale


         // Now we will set the front animation
         front_animation = AnimatorInflater.loadAnimator(getApplicationContext(), R.animator.card_flip_front);
         back_animation = AnimatorInflater.loadAnimator(getApplicationContext(), R.animator.card_flip_back);
         btn.setOnClickListener(
                 new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         if (isFront) {
                             front_animation.setTarget(card_front);
                             back_animation.setTarget(card_back);
                             front_animation.start();
                             back_animation.start();
                             isFront = false;

                         } else {
                             front_animation.setTarget(card_back);
                             back_animation.setTarget(card_front);
                             back_animation.start();
                             front_animation.start();
                             isFront = true;

                         }
                     }
                 }
         );
         // Now we will set the event listener
     }
}