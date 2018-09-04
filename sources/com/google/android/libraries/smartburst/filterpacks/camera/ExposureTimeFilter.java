package com.google.android.libraries.smartburst.filterpacks.camera;

import android.content.Context;
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
public class ExposureTimeFilter extends Filter {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String INPUT_PORT_FRAME = "frame";
    public static final String OUTPUT_PORT_EXPOSURE = "exposure";
    public ExposureMeasurer mExposureMeasurer = null;

    /* compiled from: PG */
    interface ExposureMeasurer {
        float getFrameExposure(Frame frame);

        void start();

        void stop();
    }

    /* compiled from: PG */
    class FixedExposureMeasurer implements ExposureMeasurer {
        public final float mExposure;

        public FixedExposureMeasurer(float f) {
            this.mExposure = f;
        }

        public float getFrameExposure(Frame frame) {
            return this.mExposure;
        }

        public void start() {
        }

        public void stop() {
        }
    }

    /* compiled from: PG */
    class IlluminationBasedExposureMeasurer implements SensorEventListener, ExposureMeasurer {
        public static final float TYPICAL_APERTURE = 2.4f;
        public static final float TYPICAL_ILC = 250.0f;
        public static final float TYPICAL_ISO = 800.0f;
        public final Sensor mLight;
        public volatile float mLightLx;
        public final SensorManager mSensorManager;

        public IlluminationBasedExposureMeasurer(Context context) {
            Sensor defaultSensor;
            this.mSensorManager = (SensorManager) context.getSystemService("sensor");
            SensorManager sensorManager = this.mSensorManager;
            if (sensorManager != null) {
                defaultSensor = sensorManager.getDefaultSensor(5);
            } else {
                defaultSensor = null;
            }
            this.mLight = defaultSensor;
        }

        private static float estimateExposureFromLux(float f) {
            if (f == 0.0f) {
                f = 80.0f;
            }
            return 1440.0f / (800.0f * f);
        }

        public float getFrameExposure(Frame frame) {
            return estimateExposureFromLux(this.mLightLx);
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            this.mLightLx = sensorEvent.values[0];
        }

        public void start() {
            SensorManager sensorManager = this.mSensorManager;
            if (sensorManager != null) {
                Sensor sensor = this.mLight;
                if (sensor != null) {
                    sensorManager.registerListener(this, sensor, 3);
                }
            }
        }

        public void stop() {
            SensorManager sensorManager = this.mSensorManager;
            if (sensorManager != null && this.mLight != null) {
                sensorManager.unregisterListener(this);
            }
        }
    }

    public ExposureTimeFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("frame", 2, FrameType.any()).addOutputPort(OUTPUT_PORT_EXPOSURE, 2, FrameType.single(Float.TYPE)).disallowOtherPorts();
    }

    protected void onClose() {
        ExposureMeasurer exposureMeasurer = this.mExposureMeasurer;
        if (exposureMeasurer != null) {
            exposureMeasurer.stop();
        }
    }

    protected void onOpen() {
        if (this.mExposureMeasurer == null) {
            this.mExposureMeasurer = new IlluminationBasedExposureMeasurer(getContext().getApplicationContext());
        }
        this.mExposureMeasurer.start();
    }

    protected void onProcess() {
        Frame pullFrame = getConnectedInputPort("frame").pullFrame();
        OutputPort connectedOutputPort = getConnectedOutputPort(OUTPUT_PORT_EXPOSURE);
        float frameExposure = this.mExposureMeasurer.getFrameExposure(pullFrame);
        Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        asFrameValue.setValue(Float.valueOf(frameExposure));
        connectedOutputPort.pushFrame(asFrameValue);
    }

    public void setFixedExposure(float f) {
        if (isRunning()) {
            throw new IllegalStateException("Must call this before running!");
        }
        this.mExposureMeasurer = new FixedExposureMeasurer(f);
    }
}
