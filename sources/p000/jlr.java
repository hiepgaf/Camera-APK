package p000;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FilterGraph;
import com.google.android.libraries.smartburst.filterfw.FilterGraph.Builder;
import com.google.android.libraries.smartburst.filterfw.GraphFactory;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.BranchFilter;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.GraphInputSource;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.GraphOutputTarget;
import com.google.android.libraries.smartburst.filterpacks.analysis.FloatFeatureBuilder;
import com.google.android.libraries.smartburst.filterpacks.base.ArrayLengthFilter;
import com.google.android.libraries.smartburst.filterpacks.face.PittPattFaceDetectorFilter;
import com.google.android.libraries.smartburst.filterpacks.face.PittPattFaceFeaturesFilter;
import com.google.android.libraries.smartburst.filterpacks.face.PittPattFaceSharpnessFilter;

/* compiled from: PG */
/* renamed from: jlr */
public final class jlr implements GraphFactory {
    /* renamed from: a */
    private final FilterGraph f18931a;

    public jlr(FilterGraph filterGraph) {
        this.f18931a = filterGraph;
    }

    public final FilterGraph create(MffContext mffContext) {
        Builder builder = new Builder(mffContext);
        Filter graphInputSource = new GraphInputSource(mffContext, "grayImage");
        builder.addFilter(graphInputSource);
        Filter graphInputSource2 = new GraphInputSource(mffContext, "rgbImage");
        builder.addFilter(graphInputSource2);
        Filter graphOutputTarget = new GraphOutputTarget(mffContext, "faceCountOutput");
        builder.addFilter(graphOutputTarget);
        Filter graphOutputTarget2 = new GraphOutputTarget(mffContext, "faceIsSmilingOutput");
        builder.addFilter(graphOutputTarget2);
        Filter graphOutputTarget3 = new GraphOutputTarget(mffContext, "faceIsLeftEyeOpenOutput");
        builder.addFilter(graphOutputTarget3);
        Filter graphOutputTarget4 = new GraphOutputTarget(mffContext, "faceIsRightEyeOpenOutput");
        builder.addFilter(graphOutputTarget4);
        Filter graphOutputTarget5 = new GraphOutputTarget(mffContext, "faceSharpnessOutput");
        builder.addFilter(graphOutputTarget5);
        Filter floatFeatureBuilder = new FloatFeatureBuilder(mffContext, "faceCountFeatureFilter");
        builder.addFilter(floatFeatureBuilder);
        builder.assignValueToFilterInput("FACE_COUNT", "faceCountFeatureFilter", "featureType");
        Filter arrayLengthFilter = new ArrayLengthFilter(mffContext, "faceCountFilter");
        builder.addFilter(arrayLengthFilter);
        Filter pittPattFaceDetectorFilter = new PittPattFaceDetectorFilter(mffContext, "pittPattFaceDetector");
        builder.addFilter(pittPattFaceDetectorFilter);
        Filter pittPattFaceFeaturesFilter = new PittPattFaceFeaturesFilter(mffContext, "pittpattFaceFeatures");
        builder.addFilter(pittPattFaceFeaturesFilter);
        Filter floatFeatureBuilder2 = new FloatFeatureBuilder(mffContext, "faceIsSmilingFeatureFilter");
        builder.addFilter(floatFeatureBuilder2);
        builder.assignValueToFilterInput("FACE_IS_SMILING_AGGREGATE_SCORE", "faceIsSmilingFeatureFilter", "featureType");
        Filter floatFeatureBuilder3 = new FloatFeatureBuilder(mffContext, "faceIsLeftEyeOpenFeatureFilter");
        builder.addFilter(floatFeatureBuilder3);
        builder.assignValueToFilterInput("FACE_IS_LEFT_EYE_OPEN_AGGREGATE_SCORE", "faceIsLeftEyeOpenFeatureFilter", "featureType");
        floatFeatureBuilder3 = new FloatFeatureBuilder(mffContext, "faceIsRightEyeOpenFeatureFilter");
        builder.addFilter(floatFeatureBuilder3);
        builder.assignValueToFilterInput("FACE_IS_RIGHT_EYE_OPEN_AGGREGATE_SCORE", "faceIsRightEyeOpenFeatureFilter", "featureType");
        floatFeatureBuilder3 = new PittPattFaceSharpnessFilter(mffContext, "faceSharpnessFilter");
        builder.addFilter(floatFeatureBuilder3);
        floatFeatureBuilder3 = new BranchFilter(mffContext, "facesBranch");
        builder.addFilter(floatFeatureBuilder3);
        builder.connect(graphInputSource, "frame", pittPattFaceDetectorFilter, PittPattFaceDetectorFilter.INPUT_PORT_IMAGE);
        builder.connect(pittPattFaceDetectorFilter, "faces", floatFeatureBuilder3, "input");
        builder.connect(floatFeatureBuilder3, "toFaceCount", arrayLengthFilter, ArrayLengthFilter.INPUT_PORT_ARRAY);
        builder.connect(arrayLengthFilter, ArrayLengthFilter.OUTPUT_PORT_ARRAY_LENGTH, floatFeatureBuilder, FloatFeatureBuilder.PORT_FEATURE_VALUE);
        builder.connect(floatFeatureBuilder, "feature", graphOutputTarget, "frame");
        builder.connect(floatFeatureBuilder3, "toFaceFeatures", pittPattFaceFeaturesFilter, "faces");
        builder.connect(pittPattFaceFeaturesFilter, PittPattFaceFeaturesFilter.OUTPUT_PORT_SMILING_SCORE, floatFeatureBuilder2, FloatFeatureBuilder.PORT_FEATURE_VALUE);
        builder.connect(floatFeatureBuilder2, "feature", graphOutputTarget2, "frame");
        builder.connect(pittPattFaceFeaturesFilter, PittPattFaceFeaturesFilter.OUTPUT_PORT_LEFT_EYE_OPEN_SCORE, floatFeatureBuilder3, FloatFeatureBuilder.PORT_FEATURE_VALUE);
        builder.connect(floatFeatureBuilder3, "feature", graphOutputTarget3, "frame");
        builder.connect(pittPattFaceFeaturesFilter, PittPattFaceFeaturesFilter.OUTPUT_PORT_RIGHT_EYE_OPEN_SCORE, floatFeatureBuilder3, FloatFeatureBuilder.PORT_FEATURE_VALUE);
        builder.connect(floatFeatureBuilder3, "feature", graphOutputTarget4, "frame");
        builder.connect(floatFeatureBuilder3, "toPittPattFaceSharpness", floatFeatureBuilder3, "faces");
        builder.connect(graphInputSource2, "frame", floatFeatureBuilder3, "image");
        builder.connect(floatFeatureBuilder3, PittPattFaceSharpnessFilter.OUTPUT_PORT_FACE_SHARPNESS, graphOutputTarget5, "frame");
        return builder.buildSubGraph(this.f18931a);
    }
}
