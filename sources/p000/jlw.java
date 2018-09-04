package p000;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FilterGraph;
import com.google.android.libraries.smartburst.filterfw.FilterGraph.Builder;
import com.google.android.libraries.smartburst.filterfw.GraphFactory;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.GraphInputSource;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.GraphOutputTarget;
import com.google.android.libraries.smartburst.filterpacks.analysis.FloatArrayFeatureBuilder;
import com.google.android.libraries.smartburst.filterpacks.analysis.FloatFeatureBuilder;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionAnalysisFilter;

/* compiled from: PG */
/* renamed from: jlw */
public final class jlw implements GraphFactory {
    /* renamed from: a */
    private final FilterGraph f18932a;

    public jlw(FilterGraph filterGraph) {
        this.f18932a = filterGraph;
    }

    public final FilterGraph create(MffContext mffContext) {
        Builder builder = new Builder(mffContext);
        Filter graphInputSource = new GraphInputSource(mffContext, "image");
        builder.addFilter(graphInputSource);
        Filter graphOutputTarget = new GraphOutputTarget(mffContext, "motionSaliencyOutput");
        builder.addFilter(graphOutputTarget);
        Filter graphOutputTarget2 = new GraphOutputTarget(mffContext, "motionEstimationSaliencyOutput");
        builder.addFilter(graphOutputTarget2);
        Filter graphOutputTarget3 = new GraphOutputTarget(mffContext, "interFrameHomographyOutput");
        builder.addFilter(graphOutputTarget3);
        Filter graphOutputTarget4 = new GraphOutputTarget(mffContext, "cameraMotionOutput");
        builder.addFilter(graphOutputTarget4);
        Filter motionAnalysisFilter = new MotionAnalysisFilter(mffContext, "motionAnalyzer");
        builder.addFilter(motionAnalysisFilter);
        builder.assignValueToFilterInput(Float.valueOf(0.825f), "motionAnalyzer", MotionAnalysisFilter.SALIENCY_DOWNSAMPLING_RATIO);
        Filter floatFeatureBuilder = new FloatFeatureBuilder(mffContext, "motionSaliencyFeatureFilter");
        builder.addFilter(floatFeatureBuilder);
        builder.assignValueToFilterInput("MOTION_SALIENCY", "motionSaliencyFeatureFilter", "featureType");
        Filter floatArrayFeatureBuilder = new FloatArrayFeatureBuilder(mffContext, "motionEstimationSaliencyFeatureFilter");
        builder.addFilter(floatArrayFeatureBuilder);
        builder.assignValueToFilterInput("MOTION_ESTIMATION_SALIENCY", "motionEstimationSaliencyFeatureFilter", "featureType");
        Filter floatArrayFeatureBuilder2 = new FloatArrayFeatureBuilder(mffContext, "interFrameHomographyFeatureFilter");
        builder.addFilter(floatArrayFeatureBuilder2);
        builder.assignValueToFilterInput("INTERFRAME_HOMOGRAPHY", "interFrameHomographyFeatureFilter", "featureType");
        Filter floatArrayFeatureBuilder3 = new FloatArrayFeatureBuilder(mffContext, "cameraMotionFeatureFilter");
        builder.addFilter(floatArrayFeatureBuilder3);
        builder.assignValueToFilterInput("CAMERA_MOTION", "cameraMotionFeatureFilter", "featureType");
        builder.connect(graphInputSource, "frame", motionAnalysisFilter, "image");
        builder.connect(motionAnalysisFilter, MotionAnalysisFilter.SCORE, floatFeatureBuilder, FloatFeatureBuilder.PORT_FEATURE_VALUE);
        builder.connect(floatFeatureBuilder, "feature", graphOutputTarget, "frame");
        builder.connect(motionAnalysisFilter, MotionAnalysisFilter.SALIENCY, floatArrayFeatureBuilder, "featureValues");
        builder.connect(floatArrayFeatureBuilder, "feature", graphOutputTarget2, "frame");
        builder.connect(motionAnalysisFilter, MotionAnalysisFilter.INTERFRAME_TRANSFORM, floatArrayFeatureBuilder2, "featureValues");
        builder.connect(floatArrayFeatureBuilder2, "feature", graphOutputTarget3, "frame");
        builder.connect(motionAnalysisFilter, MotionAnalysisFilter.CAMERA_MOTION, floatArrayFeatureBuilder3, "featureValues");
        builder.connect(floatArrayFeatureBuilder3, "feature", graphOutputTarget4, "frame");
        return builder.buildSubGraph(this.f18932a);
    }
}
