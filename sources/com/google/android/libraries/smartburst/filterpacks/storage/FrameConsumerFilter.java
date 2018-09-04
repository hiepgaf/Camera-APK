package com.google.android.libraries.smartburst.filterpacks.storage;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;
import p000.jla;
import p000.jri;

/* compiled from: PG */
public class FrameConsumerFilter extends Filter {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String INPUT_PORT_FRAME = "frame";
    public volatile jla mFrameConsumer = null;

    public FrameConsumerFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("frame", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2)).disallowOtherPorts();
    }

    protected void onClose() {
        this.mFrameConsumer.mo2017a();
    }

    protected void onOpen() {
        if (this.mFrameConsumer == null) {
            throw new IllegalStateException("Frame buffer is not set.");
        }
    }

    protected void onProcess() {
        this.mFrameConsumer.mo2018a(getConnectedInputPort("frame").pullFrame().asFrameImage2D());
    }

    public void setFrameConsumer(jla jla) {
        jri.m13152b((Object) jla);
        this.mFrameConsumer = jla;
    }
}
