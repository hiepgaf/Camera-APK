package com.google.android.libraries.smartburst.filterpacks.face;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import com.google.android.libraries.smartburst.utils.FloatArray;
import com.google.android.vision.face.Face;
import com.google.android.vision.face.Landmark;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.jqo;
import p000.jqp;
import p000.jqr;
import p000.jri;
import p000.kag;

/* compiled from: PG */
public class FaceEditor {
    public static final boolean DEBUG = false;
    public static final float IS_LEFT_EYE_OPEN_SCORE_WEIGHT = 0.25f;
    public static final float IS_RIGHT_EYE_OPEN_SCORE_WEIGHT = 0.25f;
    public static final float IS_SMILING_SCORE_WEIGHT = 0.5f;
    public static final String TAG = "FaceEditor";
    public jqr mBestInputBitmap;
    public long mBestInputBitmapTimestampNs;
    public float mBestInputJoyScore;
    public final boolean mConfiguredForAnimation;
    public final boolean mConfiguredForPittPatt;
    public final ByteBuffer mContextBuffer;
    public final int mHeight;
    public final Map mIndexTimestampMap;
    public final int mWidth;

    /* compiled from: PG */
    public class Builder {
        public boolean mCreateAnimation = false;
        public int mHeight = 0;
        public ByteBuffer mLandmarkModels;
        public int mWidth = 0;

        public FaceEditor build() {
            boolean z;
            boolean z2 = true;
            if (this.mWidth > 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13154b(z, (Object) "Width must be positive.");
            if (this.mHeight <= 0) {
                z2 = false;
            }
            jri.m13154b(z2, (Object) "Height must be positive.");
            return new FaceEditor(this.mWidth, this.mHeight, this.mLandmarkModels, this.mCreateAnimation);
        }

        public Builder setAllSmilesAsOutput() {
            this.mCreateAnimation = false;
            return this;
        }

        public Builder setAnimationAsOutput() {
            this.mCreateAnimation = true;
            return this;
        }

        public Builder setFrameDimensions(int i, int i2) {
            boolean z;
            boolean z2 = true;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13144a(z, (Object) "Width must be positive");
            if (i2 <= 0) {
                z2 = false;
            }
            jri.m13144a(z2, (Object) "Height must be positive");
            this.mWidth = i;
            this.mHeight = i2;
            return this;
        }

        public Builder setNevenAsDetector() {
            this.mLandmarkModels = null;
            return this;
        }

        public Builder setPittPattAsDetector(ByteBuffer byteBuffer) {
            jri.m13152b((Object) byteBuffer);
            this.mLandmarkModels = byteBuffer;
            return this;
        }
    }

    /* compiled from: PG */
    public class FaceData {
        public final RectF boundingBox;
        public final float isLeftEyeOpenScore;
        public final float isRightEyeOpenScore;
        public final float isSmilingScore;
        public final List landmarks;
        public final float rollDegrees;
        public final int trackId;
        public final float yawDegrees;

        public FaceData(Rect rect, Rect rect2, Face face, float f) {
            this.boundingBox = FaceUtils.getScaledBoundingBoxF(face, f);
            this.boundingBox.offset((float) ((-rect.left) + rect2.left), (float) ((-rect.top) + rect2.top));
            this.landmarks = new ArrayList();
            for (Landmark landmark : face.getLandmarks()) {
                PointF scaledLandmarkPosition = FaceUtils.getScaledLandmarkPosition(landmark, f);
                scaledLandmarkPosition.offset((float) ((-rect.left) + rect2.left), (float) ((-rect.top) + rect2.top));
                this.landmarks.add(Pair.create(scaledLandmarkPosition, Integer.valueOf(landmark.getCategory())));
            }
            this.isSmilingScore = face.getIsSmilingScore();
            this.isLeftEyeOpenScore = face.getIsLeftEyeOpenScore();
            this.isRightEyeOpenScore = face.getIsRightEyeOpenScore();
            this.rollDegrees = face.getRollDegrees();
            this.yawDegrees = face.getYawDegrees();
            this.trackId = face.getTrackId();
        }

        public FaceData(Face face, float f) {
            this(new Rect(0, 0, 0, 0), new Rect(0, 0, 0, 0), face, f);
        }
    }

    static {
        System.loadLibrary("smartburst-jni");
    }

    private native void faceEditingAddPhoto(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2);

    private native void faceEditingAddPhotoWithFaces(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, float[] fArr, int i, int i2);

    private native byte[] faceEditingCreateAllSmiles(ByteBuffer byteBuffer, boolean z);

    private native byte[] faceEditingCreateAnimation(ByteBuffer byteBuffer, boolean z);

    private native int faceEditingReferenceIndex(ByteBuffer byteBuffer);

    private native void faceEditingSetUp(ByteBuffer byteBuffer, int i, int i2);

    private native void faceEditingSetUpWithModels(ByteBuffer byteBuffer, int i, int i2, float[] fArr);

    private native void faceEditingTearDown(ByteBuffer byteBuffer);

    private native int getContextLength();

    private FaceEditor(int i, int i2, ByteBuffer byteBuffer, boolean z) {
        boolean z2;
        this.mContextBuffer = ByteBuffer.allocateDirect(getContextLength());
        this.mIndexTimestampMap = new HashMap();
        this.mBestInputBitmap = null;
        this.mBestInputBitmapTimestampNs = -1;
        this.mWidth = i;
        this.mHeight = i2;
        this.mBestInputJoyScore = 0.0f;
        if (byteBuffer != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mConfiguredForPittPatt = z2;
        this.mConfiguredForAnimation = z;
        if (this.mConfiguredForPittPatt) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.rewind();
            FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
            float[] fArr = new float[asFloatBuffer.limit()];
            asFloatBuffer.get(fArr);
            faceEditingSetUpWithModels(this.mContextBuffer, this.mWidth, this.mHeight, fArr);
            return;
        }
        faceEditingSetUp(this.mContextBuffer, this.mWidth, this.mHeight);
    }

    public synchronized void addPhoto(jqr jqr, List list, long j) {
        jri.m13152b((Object) jqr);
        jri.m13152b((Object) list);
        try {
            jqr jqr2;
            if (this.mIndexTimestampMap.isEmpty() || this.mBestInputBitmap == null) {
                jqr2 = this.mBestInputBitmap;
                this.mBestInputBitmap = jqr;
                this.mBestInputBitmapTimestampNs = j;
                if (jqr2 != null) {
                    jqr2.close();
                }
            }
            Map map = this.mIndexTimestampMap;
            map.put(Integer.valueOf(map.size()), Long.valueOf(j));
            Buffer allocateDirect = ByteBuffer.allocateDirect(((Bitmap) jqr.mo3191e()).getByteCount());
            ((Bitmap) jqr.mo3191e()).copyPixelsToBuffer(allocateDirect);
            if (list.isEmpty()) {
                if (this.mConfiguredForPittPatt) {
                    throw new RuntimeException("Editor configured for PittPatt. Must input PittPatt faces.");
                }
                faceEditingAddPhoto(this.mContextBuffer, allocateDirect, this.mWidth, this.mHeight);
            } else if (this.mConfiguredForPittPatt) {
                FloatArray floatArray = new FloatArray();
                floatArray.add((float) list.size());
                float f = 0.0f;
                for (FaceData faceData : list) {
                    floatArray.add(faceData.boundingBox.centerX());
                    floatArray.add(faceData.boundingBox.centerY());
                    floatArray.add(faceData.boundingBox.width());
                    floatArray.add(faceData.boundingBox.height());
                    List<Pair> list2 = faceData.landmarks;
                    floatArray.add((float) list2.size());
                    for (Pair pair : list2) {
                        floatArray.add((float) ((Integer) pair.second).intValue());
                        floatArray.add(((PointF) pair.first).x);
                        floatArray.add(((PointF) pair.first).y);
                    }
                    floatArray.add(faceData.isSmilingScore);
                    floatArray.add(faceData.isLeftEyeOpenScore);
                    floatArray.add(faceData.isRightEyeOpenScore);
                    floatArray.add(faceData.rollDegrees);
                    floatArray.add(faceData.yawDegrees);
                    floatArray.add((float) faceData.trackId);
                    f = FaceUtils.getJoyScore(faceData.isLeftEyeOpenScore, faceData.isRightEyeOpenScore, faceData.isSmilingScore, 0.25f, 0.25f, 0.5f) + f;
                }
                Buffer buffer = allocateDirect;
                faceEditingAddPhotoWithFaces(this.mContextBuffer, buffer, floatArray.toArray(), this.mWidth, this.mHeight);
                if (f > this.mBestInputJoyScore) {
                    jqr2 = this.mBestInputBitmap;
                    this.mBestInputJoyScore = f;
                    this.mBestInputBitmap = jqr;
                    this.mBestInputBitmapTimestampNs = j;
                    if (jqr2 != this.mBestInputBitmap) {
                        jqr2.close();
                    }
                }
            } else {
                throw new RuntimeException("Editor configured for Neven. Cannot input PittPatt faces.");
            }
            if (this.mBestInputBitmap != jqr) {
                jqr.close();
            }
        } catch (Throwable th) {
            if (this.mBestInputBitmap != jqr) {
                jqr.close();
            }
        }
    }

    private synchronized void closeInputBitmap() {
        jqr jqr = this.mBestInputBitmap;
        if (jqr != null) {
            jqr.close();
            this.mBestInputBitmap = null;
        }
    }

    public synchronized jqr createAllSmiles(jqo jqo, boolean z) {
        jqr jqr;
        boolean z2;
        jri.m13154b(this.mConfiguredForAnimation ^ 1, (Object) "Editor is configured for animation. Cannot create all-smiles.");
        if (this.mIndexTimestampMap.size() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        jri.m13153b(z2);
        jri.m13152b((Object) jqo);
        jri.m13152b(this.mBestInputBitmap);
        try {
            byte[] faceEditingCreateAllSmiles = faceEditingCreateAllSmiles(this.mContextBuffer, z);
            if (faceEditingCreateAllSmiles == null) {
                jqr = this.mBestInputBitmap;
                this.mBestInputBitmap = null;
            } else {
                closeInputBitmap();
                Long l = (Long) this.mIndexTimestampMap.get(Integer.valueOf(faceEditingReferenceIndex(this.mContextBuffer)));
                if (l != null) {
                    this.mBestInputBitmapTimestampNs = l.longValue();
                }
                jqr = jqp.m4610a(jqo, "all-smiles", ByteBuffer.wrap(faceEditingCreateAllSmiles), this.mWidth, this.mHeight);
                closeInputBitmap();
            }
        } finally {
            closeInputBitmap();
        }
        return jqr;
    }

    public synchronized List createAnimation(jqo jqo, boolean z, int i) {
        List arrayList;
        boolean z2 = true;
        synchronized (this) {
            boolean z3;
            jri.m13154b(this.mConfiguredForAnimation, (Object) "Editor is configured for all-smiles. Cannot create animation.");
            if (this.mIndexTimestampMap.size() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            jri.m13153b(z3);
            jri.m13152b((Object) jqo);
            if (i <= 0) {
                z2 = false;
            }
            jri.m13143a(z2);
            arrayList = new ArrayList();
            try {
                byte[] faceEditingCreateAnimation = faceEditingCreateAnimation(this.mContextBuffer, z);
                if (faceEditingCreateAnimation == null) {
                    arrayList.add(this.mBestInputBitmap);
                    this.mBestInputBitmap = null;
                } else {
                    closeInputBitmap();
                    Long l = (Long) this.mIndexTimestampMap.get(Integer.valueOf(faceEditingReferenceIndex(this.mContextBuffer)));
                    if (l != null) {
                        this.mBestInputBitmapTimestampNs = l.longValue();
                    }
                    int i2 = (this.mWidth * this.mHeight) << 2;
                    int length = faceEditingCreateAnimation.length / i2;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
                    for (int i3 = 0; i3 < length; i3++) {
                        allocateDirect.rewind();
                        allocateDirect.put(faceEditingCreateAnimation, i3 * i2, i2);
                        allocateDirect.rewind();
                        StringBuilder stringBuilder = new StringBuilder(32);
                        stringBuilder.append("face-animation-frame-");
                        stringBuilder.append(i3);
                        arrayList.add(jqp.m4610a(jqo, stringBuilder.toString(), allocateDirect, this.mWidth, this.mHeight));
                    }
                }
                if (!arrayList.isEmpty() && arrayList.size() < i) {
                    kag kag = new kag((jqr) arrayList.remove(arrayList.size() - 1));
                    arrayList.add(kag);
                    while (arrayList.size() < i) {
                        arrayList.add(new kag(kag, (byte) 0));
                    }
                }
            } finally {
                closeInputBitmap();
            }
        }
        return arrayList;
    }

    public synchronized void dispose() {
        faceEditingTearDown(this.mContextBuffer);
        closeInputBitmap();
    }

    public synchronized long getBestInputBitmapTimestamp() {
        return this.mBestInputBitmapTimestampNs;
    }

    public static List getCroppedFaceData(List list, List list2, float f) {
        boolean z;
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        List arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Pair pair = (Pair) list2.get(i);
            arrayList.add(new FaceData((Rect) pair.first, (Rect) pair.second, (Face) list.get(i), f));
        }
        return arrayList;
    }

    public static List getUncroppedFaceData(List list, float f) {
        List arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new FaceData((Face) list.get(i), f));
        }
        return arrayList;
    }
}
