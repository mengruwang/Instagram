package com.mengrudaddy.instagram;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import com.mengrudaddy.instagram.Interface.EditImageFragmentListener;

public class EditFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {

    private EditImageFragmentListener listener;
    SeekBar seekBar_brighteness;

    public void setListener(EditImageFragmentListener listener1){
        this.listener = listener1;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_edit, container, false);
        seekBar_brighteness = (SeekBar)itemView.findViewById(R.id.brightness_seekbar);

        seekBar_brighteness.setMax(200);
        seekBar_brighteness.setProgress(100);
        seekBar_brighteness.setOnSeekBarChangeListener(this);

        return itemView;
    }

    public EditFragment(){

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if(listener != null){
            if (seekBar.getId() == R.id.brightness_seekbar){
                listener.onBrightnessChanged(i-100);
            }
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        if (listener != null){
            listener.onEditCompleted();
        }
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        if(listener!=null){
            listener.onEditCompleted();
        }
    }
    public void resetControls(){
        seekBar_brighteness.setProgress(100);
    }
}
