package com.google.android.libraries.smartburst.filterfw.filterpacks.sensors;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class MotionSensor extends Filter implements SensorEventListener {
    public Sensor mSensor = null;
    public SensorManager mSensorManager = null;
    public final float[] mValues = new float[3];

    public MotionSensor(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addOutputPort("values", 2, FrameType.array(Float.TYPE)).disallowOtherPorts();
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    protected final void onPrepare() {
        this.mSensorManager = (SensorManager) getContext().getApplicationContext().getSystemService("sensor");
        this.mSensor = this.mSensorManager.getDefaultSensor(10);
        this.mSensorManager.registerListener(this, this.mSensor, 2);
    }

    protected final void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("values");
        Frame asFrameValues = connectedOutputPort.fetchAvailableFrame(null).asFrameValues();
        synchronized (this.mValues) {
            asFrameValues.setValues(this.mValues);
        }
        asFrameValues.setTimestamp(System.currentTimeMillis() * 1000000);
        connectedOutputPort.pushFrame(asFrameValues);
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        synchronized (this.mValues) {
            float[] fArr = this.mValues;
            fArr[0] = sensorEvent.values[0];
            fArr[1] = sensorEvent.values[1];
            fArr[2] = sensorEvent.values[2];
        }
    }

    protected final void onTearDown() {
        this.mSensorManager.unregisterListener(this);
    }
}
