package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.InputPort.FrameListener;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;
import java.io.IOException;

@TargetApi(10)
/* compiled from: PG */
public class ImageRegionSource extends Filter {
    public FrameImage2D mCurrImageFrame = null;
    public String mCurrImagePath = null;
    public RectF mCurrImageRectF = new RectF();
    public String mImagePath = null;
    public FrameType mImageType = null;
    public int mMaxHeight = DepthmapTask.MAX_REFERENCE_SIZE_HR_PX;
    public int mMaxWidth = DepthmapTask.MAX_REFERENCE_SIZE_HR_PX;
    public RectF mRectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public FrameListener mRectListener = new C01491();
    public BitmapRegionDecoder mRegionDecoder = null;

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.filterpacks.image.ImageRegionSource$1 */
    class C01491 implements FrameListener {
        C01491() {
        }

        public void onFrameReceived(InputPort inputPort, Frame frame) {
            ImageRegionSource.this.mRectF.set((RectF) frame.asFrameValue().getValue());
        }
    }

    public ImageRegionSource(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private int getSampleSize(int i, int i2) {
        double ceil = Math.ceil(Math.max(((double) i) / ((double) this.mMaxHeight), ((double) i2) / ((double) this.mMaxWidth)));
        if (ceil <= 1.0d) {
            return 1;
        }
        return (int) Math.pow(2.0d, Math.ceil(Math.log(ceil) / Math.log(2.0d)));
    }

    public Signature getSignature() {
        this.mImageType = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 8);
        return new Signature().addInputPort("imagePath", 2, FrameType.single(String.class)).addInputPort("rect", 1, FrameType.single(RectF.class)).addInputPort("maxWidth", 1, FrameType.single(Integer.TYPE)).addInputPort("maxHeight", 1, FrameType.single(Integer.TYPE)).addOutputPort("image", 2, this.mImageType).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("maxWidth")) {
            inputPort.bindToFieldNamed("mMaxWidth");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("maxHeight")) {
            inputPort.bindToFieldNamed("mMaxHeight");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("imagePath")) {
            inputPort.bindToFieldNamed("mImagePath");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("rect")) {
            inputPort.bindToListener(this.mRectListener);
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onProcess() {
        if (this.mRegionDecoder == null || !this.mImagePath.equals(this.mCurrImagePath)) {
            BitmapRegionDecoder bitmapRegionDecoder = this.mRegionDecoder;
            if (bitmapRegionDecoder != null) {
                bitmapRegionDecoder.recycle();
            }
            try {
                this.mRegionDecoder = BitmapRegionDecoder.newInstance(this.mImagePath, false);
                this.mCurrImagePath = this.mImagePath;
                int i = 1;
            } catch (IOException e) {
                String valueOf = String.valueOf(this.mImagePath);
                String str = "Failed setting up BitmapRegionDecoder for ";
                throw new RuntimeException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            }
        }
        i = 0;
        if (!(i == 0 && this.mRectF.equals(this.mCurrImageRectF))) {
            if (this.mRectF.width() <= 0.0f || this.mRectF.height() <= 0.0f) {
                String valueOf2 = String.valueOf(this.mRectF);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 25);
                stringBuilder.append("invalid input rectangle: ");
                stringBuilder.append(valueOf2);
                throw new RuntimeException(stringBuilder.toString());
            }
            float width = (float) this.mRegionDecoder.getWidth();
            float height = (float) this.mRegionDecoder.getHeight();
            Rect rect = new Rect((int) Math.floor((double) (this.mRectF.left * width)), (int) Math.floor((double) (this.mRectF.top * height)), (int) Math.floor((double) (width * this.mRectF.right)), (int) Math.floor((double) (height * this.mRectF.bottom)));
            Options options = new Options();
            options.inSampleSize = getSampleSize(rect.height(), rect.width());
            int[] iArr = new int[]{r0.getWidth(), this.mRegionDecoder.decodeRegion(rect, options).getHeight()};
            FrameImage2D frameImage2D = this.mCurrImageFrame;
            if (frameImage2D != null) {
                frameImage2D.release();
            }
            this.mCurrImageFrame = Frame.create(this.mImageType, iArr).asFrameImage2D();
            this.mCurrImageFrame.setBitmap(r0);
            this.mCurrImageRectF.set(this.mRectF);
        }
        getConnectedOutputPort("image").pushFrame(this.mCurrImageFrame);
    }

    protected void onTearDown() {
        BitmapRegionDecoder bitmapRegionDecoder = this.mRegionDecoder;
        if (bitmapRegionDecoder != null) {
            bitmapRegionDecoder.recycle();
        }
        FrameImage2D frameImage2D = this.mCurrImageFrame;
        if (frameImage2D != null) {
            frameImage2D.release();
        }
    }
}
