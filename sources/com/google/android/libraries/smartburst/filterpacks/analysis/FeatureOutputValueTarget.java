package com.google.android.libraries.smartburst.filterpacks.analysis;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.FrameValue;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.utils.Feature;
import p000.jii;

/* compiled from: PG */
public class FeatureOutputValueTarget extends Filter implements jii {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public FeatureTable mFeatureTable = null;

    public FeatureOutputValueTarget(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("feature", 2, FrameType.single(Feature.class)).disallowOtherInputs();
    }

    protected void onOpen() {
        if (this.mFeatureTable == null) {
            throw new IllegalStateException("Feature table must be set before the filter is run");
        }
    }

    protected void onProcess() {
        FrameValue asFrameValue = getConnectedInputPort("feature").pullFrame().asFrameValue();
        if (asFrameValue != null) {
            this.mFeatureTable.setFeatureValue(asFrameValue.getTimestamp(), (Feature) asFrameValue.getValue());
        }
    }

    public void setFeatureTable(FeatureTable featureTable) {
        if (isRunning()) {
            throw new IllegalStateException("Adding listener after graph has started!");
        }
        this.mFeatureTable = featureTable;
    }
}
