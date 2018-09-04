package com.google.android.libraries.smartburst.filterpacks.video;

import android.annotation.TargetApi;
import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.utils.Feature;
import java.io.File;
import java.io.IOException;
import p000.jii;
import p000.jqk;
import p000.jri;
import p000.jtv;
import p000.juc;
import p000.jwj;
import p000.jxr;
import p000.jza;

@TargetApi(19)
/* compiled from: PG */
public class EncodeFrameFilter extends Filter implements jii {
    public static final String TAG = "EncodeFrameFilter";
    public static final boolean VFR_ON = true;
    public FeatureTable mFeatureTable;
    public jwj mFrameFilter;
    public jtv mFrameScorer;
    public boolean mIsEncoderInitialized;
    public final File mOutputFile;
    public long mPresentationTimeNs;
    public VideoEncoder mVideoEncoder;

    public EncodeFrameFilter(MffContext mffContext, String str) {
        String path = mffContext.getApplicationContext().getCacheDir().getPath();
        String c = jxr.m4682c();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(path).length() + 1) + String.valueOf(c).length());
        stringBuilder.append(path);
        stringBuilder.append("/");
        stringBuilder.append(c);
        this(mffContext, str, new File(stringBuilder.toString()));
    }

    public EncodeFrameFilter(MffContext mffContext, String str, File file) {
        super(mffContext, str);
        jri.m13152b((Object) file);
        this.mOutputFile = file;
        if (jqk.m13100b()) {
            this.mVideoEncoder = new EmulatorEncoder();
        } else {
            this.mVideoEncoder = new HardwareEncoder();
        }
        this.mPresentationTimeNs = 0;
    }

    private long getFrameIntervalNs(boolean z) {
        if (z) {
            return this.mFrameFilter.f19079b;
        }
        return this.mFrameFilter.f19078a;
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("outputFile", 1, FrameType.single(String.class)).disallowOtherPorts();
    }

    protected void onClose() {
        try {
            VideoEncoder videoEncoder = this.mVideoEncoder;
            if (videoEncoder != null) {
                videoEncoder.close();
            }
        } catch (IOException e) {
            throw new RuntimeException("Cannot release the encoder.");
        }
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("outputFile")) {
            inputPort.bindToFieldNamed("mOutputFile");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onOpen() {
        FeatureTable featureTable = this.mFeatureTable;
        if (featureTable == null) {
            throw new NullPointerException("No FeatureTable set on EncodeFrameFilter!");
        }
        this.mFrameScorer = new juc(featureTable, jza.MOTION_SALIENCY);
        this.mFrameFilter = new jwj(this.mFrameScorer);
    }

    protected void onProcess() {
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        long timestamp = asFrameImage2D.getTimestamp();
        if (this.mFrameFilter.mo2057a(timestamp)) {
            long frameIntervalNs = getFrameIntervalNs(true);
            if (!this.mIsEncoderInitialized) {
                try {
                    if (this.mOutputFile.exists()) {
                        this.mOutputFile.delete();
                    }
                    this.mVideoEncoder.initialize(this.mOutputFile.getAbsolutePath(), asFrameImage2D.getWidth(), asFrameImage2D.getHeight());
                    this.mIsEncoderInitialized = true;
                } catch (IOException e) {
                    throw new RuntimeException("Cannot initialize a video encoder.");
                }
            }
            try {
                this.mVideoEncoder.encodeFrame(asFrameImage2D, frameIntervalNs);
                this.mPresentationTimeNs += frameIntervalNs;
                this.mFeatureTable.setFeatureValue(timestamp, new Feature(jza.VIDEO_PRESENTATION_TIME, ((float) this.mPresentationTimeNs) / 1000000.0f));
            } catch (IOException e2) {
                throw new RuntimeException("Cannot encode the current frame.");
            }
        }
    }

    public void setFeatureTable(FeatureTable featureTable) {
        this.mFeatureTable = featureTable;
    }
}
