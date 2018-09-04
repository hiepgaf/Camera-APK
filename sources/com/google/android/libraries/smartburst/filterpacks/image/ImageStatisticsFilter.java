package com.google.android.libraries.smartburst.filterpacks.image;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.utils.Feature;
import p000.jii;
import p000.jza;

/* compiled from: PG */
public class ImageStatisticsFilter extends Filter implements jii {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public ImageStatisticsCalculator mCalculator = null;
    public FeatureTable mFeatureTable = null;
    public int mNumBlocksX = 1;
    public int mNumBlocksY = 1;
    public long mPreviousTimestamp = Long.MIN_VALUE;

    public ImageStatisticsFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("blurredX", 2, image2D).addInputPort("blurredY", 2, image2D).addInputPort("numBlocksX", 1, FrameType.single(Integer.TYPE)).addInputPort("numBlocksY", 1, FrameType.single(Integer.TYPE)).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("numBlocksX")) {
            inputPort.bindToFieldNamed("mNumBlocksX");
            inputPort.setAutoPullEnabled(true);
        }
        if (inputPort.getName().equals("numBlocksY")) {
            inputPort.bindToFieldNamed("mNumBlocksY");
            inputPort.setAutoPullEnabled(true);
        }
    }

    public void onOpen() {
        if (this.mFeatureTable == null) {
            throw new NullPointerException("No FeatureTable set on ImageStatisticsFilter!");
        }
    }

    protected void onProcess() {
        InputPort connectedInputPort = getConnectedInputPort("image");
        InputPort connectedInputPort2 = getConnectedInputPort("blurredX");
        InputPort connectedInputPort3 = getConnectedInputPort("blurredY");
        FrameImage2D asFrameImage2D = connectedInputPort.pullFrame().asFrameImage2D();
        long timestamp = asFrameImage2D.getTimestamp();
        if (timestamp > this.mPreviousTimestamp) {
            this.mPreviousTimestamp = timestamp;
            FrameImage2D asFrameImage2D2 = connectedInputPort2.pullFrame().asFrameImage2D();
            FrameImage2D asFrameImage2D3 = connectedInputPort3.pullFrame().asFrameImage2D();
            if (this.mCalculator == null) {
                this.mCalculator = new ImageStatisticsCalculator(this.mNumBlocksX, this.mNumBlocksY);
            }
            ImageStatistics extractImageStatistics = this.mCalculator.extractImageStatistics(asFrameImage2D, asFrameImage2D2, asFrameImage2D3);
            writeFeature(timestamp, jza.PERCEPTUAL_SHARPNESS, extractImageStatistics.getPerceptualSharpness());
            writeFeature(timestamp, jza.MAX_GRID_SHARPNESS, extractImageStatistics.getMaxBlockPerceptualSharpness());
            writeFeature(timestamp, jza.BRIGHTNESS_MEAN, extractImageStatistics.getMeanGray());
            writeFeature(timestamp, jza.BRIGHTNESS_VARIANCE, extractImageStatistics.getVarianceGray());
            writeFeature(timestamp, jza.MAX_BLOCK_BRIGHTNESS_MEAN, extractImageStatistics.getMaxBlockMeanGray());
            writeFeature(timestamp, jza.MIN_BLOCK_BRIGHTNESS_MEAN, extractImageStatistics.getMinBlockMeanGray());
            writeFeature(timestamp, jza.MAX_BLOCK_BRIGHTNESS_VARIANCE, extractImageStatistics.getMaxBlockVarianceGray());
            writeFeature(timestamp, jza.MIN_BLOCK_BRIGHTNESS_VARIANCE, extractImageStatistics.getMinBlockVarianceGray());
        }
    }

    public void setFeatureTable(FeatureTable featureTable) {
        this.mFeatureTable = featureTable;
    }

    private void writeFeature(long j, jza jza, float f) {
        this.mFeatureTable.setFeatureValue(j, new Feature(jza, f));
    }
}
