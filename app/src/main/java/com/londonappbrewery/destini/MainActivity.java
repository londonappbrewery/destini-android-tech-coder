package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView StoryView;
    Button top_button;
    Button bottom;
    int mStoryIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        StoryView=findViewById(R.id.storyTextView);
        top_button=findViewById(R.id.buttonTop);
        bottom=findViewById(R.id.buttonBottom);

        StoryView.setText(R.string.T1_Story);
        top_button.setText(R.string.T1_Ans1);
        bottom.setText(R.string.T1_Ans2);
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        top_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(mStoryIndex==1 || mStoryIndex==3 || mStoryIndex==2 || mStoryIndex==4) {
                if (mStoryIndex == 1 || mStoryIndex==2) {
                    mStoryIndex = mStoryIndex + 2;
                    StoryView.setText(R.string.T3_Story);
                    top_button.setText(R.string.T3_Ans1);
                    bottom.setText(R.string.T3_Ans2);
                }
                else if(mStoryIndex==3 ){
                    mStoryIndex = mStoryIndex +3;
                    StoryView.setText(R.string.T6_End);
                    top_button.setVisibility(View.GONE);
                    bottom.setVisibility(View.GONE);
                }else if(mStoryIndex==4){
                    mStoryIndex = mStoryIndex +2;
                    StoryView.setText(R.string.T6_End);
                    top_button.setVisibility(View.GONE);
                    bottom.setVisibility(View.GONE);
                }
            }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1 || mStoryIndex==3 || mStoryIndex==4 || mStoryIndex==2) {
                    if (mStoryIndex == 1) {
                        mStoryIndex = mStoryIndex + 1;
                        StoryView.setText(R.string.T2_Story);
                        top_button.setText(R.string.T2_Ans1);
                        bottom.setText(R.string.T2_Ans2);
                    }else if(mStoryIndex==4 || mStoryIndex==3){
                        mStoryIndex=mStoryIndex+2;
                        StoryView.setText(R.string.T5_End);
                        top_button.setVisibility(View.GONE);
                        bottom.setVisibility(View.GONE);
                    }else if(mStoryIndex==2){
                        mStoryIndex=mStoryIndex+2;
                        StoryView.setText(R.string.T4_End);
                        top_button.setVisibility(View.GONE);
                        bottom.setVisibility(View.GONE);
                    }
                }
            }
        });

    }
}
