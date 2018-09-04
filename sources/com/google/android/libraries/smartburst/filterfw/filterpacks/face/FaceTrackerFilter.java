package com.google.android.libraries.smartburst.filterfw.filterpacks.face;

import android.annotation.TargetApi;
import android.hardware.Camera.Face;
import android.media.effect.Effect;
import android.media.effect.EffectContext;
import android.media.effect.EffectFactory;
import android.media.effect.EffectUpdateListener;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.TextureSource;

@TargetApi(14)
/* compiled from: PG */
public final class FaceTrackerFilter extends Filter {
    public static final String FACE_TRACKER_EFFECT = "com.google.android.media.effect.effects.FaceTrackingEffect";
    public EffectContext mEffectContext = null;
    public EffectUpdateListener mFaceListener = new C00881();
    public Effect mFaceTracker = null;
    public Face[] mFaces = null;
    public TextureSource mIgnoreTex = null;

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.filterpacks.face.FaceTrackerFilter$1 */
    class C00881 implements EffectUpdateListener {
        C00881() {
        }

        public void onEffectUpdated(Effect effect, Object obj) {
            synchronized (FaceTrackerFilter.this) {
                FaceTrackerFilter.this.mFaces = (Face[]) obj;
            }
        }
    }

    public FaceTrackerFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addOutputPort("faces", 2, FrameType.array(Face.class)).disallowOtherPorts();
    }

    public static boolean isSupported() {
        return EffectFactory.isEffectSupported(FACE_TRACKER_EFFECT);
    }

    protected final void onPrepare() {
        this.mEffectContext = EffectContext.createWithCurrentGlContext();
        EffectFactory factory = this.mEffectContext.getFactory();
        if (EffectFactory.isEffectSupported(FACE_TRACKER_EFFECT)) {
            this.mFaceTracker = factory.createEffect(FACE_TRACKER_EFFECT);
            this.mFaceTracker.setParameter("ignoreOutput", Boolean.valueOf(true));
            this.mFaceTracker.setUpdateListener(this.mFaceListener);
            this.mIgnoreTex = TextureSource.newTexture();
            this.mIgnoreTex.allocate(640, 480);
            return;
        }
        String valueOf = String.valueOf(this);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
        stringBuilder.append("Cannot find a face-tracker engine for ");
        stringBuilder.append(valueOf);
        stringBuilder.append("!");
        throw new RuntimeException(stringBuilder.toString());
    }

    protected final void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("faces");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        this.mFaceTracker.apply(asFrameImage2D.lockTextureSource().getTextureId(), asFrameImage2D.getWidth(), asFrameImage2D.getHeight(), this.mIgnoreTex.getTextureId());
        asFrameImage2D.unlock();
        synchronized (this) {
            if (this.mFaces == null) {
                this.mFaces = new Face[0];
            }
            Frame asFrameValues = connectedOutputPort.fetchAvailableFrame(new int[]{this.mFaces.length}).asFrameValues();
            asFrameValues.setValues(this.mFaces);
            connectedOutputPort.pushFrame(asFrameValues);
        }
    }

    protected final void onTearDown() {
        EffectContext effectContext = this.mEffectContext;
        if (effectContext != null) {
            effectContext.release();
            this.mEffectContext = null;
        }
        TextureSource textureSource = this.mIgnoreTex;
        if (textureSource != null) {
            textureSource.release();
            this.mIgnoreTex = null;
        }
    }
}
