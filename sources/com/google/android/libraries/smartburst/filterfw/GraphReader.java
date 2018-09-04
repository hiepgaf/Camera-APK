package com.google.android.libraries.smartburst.filterfw;

import android.content.Context;
import android.support.v4.app.Person;
import android.text.TextUtils;
import com.google.android.libraries.smartburst.filterfw.FilterGraph.Builder;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.MetaFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* compiled from: PG */
public class GraphReader {

    /* compiled from: PG */
    interface Command {
        void compileToJava(MffContext mffContext, GraphFactorySource graphFactorySource);

        void execute(CommandStack commandStack);
    }

    /* compiled from: PG */
    class CommandStack {
        public Builder mBuilder;
        public final ArrayList mCommands = new ArrayList();
        public MffContext mContext;
        public FilterFactory mFactory;
        public FilterGraph mGraph;
        public final ArrayList mPostCommands = new ArrayList();

        public CommandStack(MffContext mffContext) {
            this.mContext = mffContext;
            this.mBuilder = new Builder(this.mContext);
            this.mFactory = new FilterFactory();
        }

        public void append(Command command) {
            this.mCommands.add(command);
        }

        public void compileToBuilder(GraphFactorySource graphFactorySource) {
            ArrayList arrayList = this.mCommands;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ((Command) arrayList.get(i)).compileToJava(this.mContext, graphFactorySource);
                i = i2;
            }
            ArrayList arrayList2 = this.mPostCommands;
            int size2 = arrayList2.size();
            i = 0;
            while (i < size2) {
                int i3 = i + 1;
                ((Command) arrayList2.get(i)).compileToJava(this.mContext, graphFactorySource);
                i = i3;
            }
        }

        public void compileToJava(String str, String str2, Writer writer) {
            JavaSource javaSource = new JavaSource(str2);
            compileToBuilder(javaSource.mainGraphFactory());
            javaSource.writeSourceCode(str, writer);
        }

        public FilterGraph execute(FilterGraph filterGraph) {
            ArrayList arrayList = this.mCommands;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ((Command) arrayList.get(i)).execute(this);
                i = i2;
            }
            if (filterGraph == null) {
                this.mGraph = this.mBuilder.build();
            } else {
                this.mGraph = this.mBuilder.buildSubGraph(filterGraph);
            }
            ArrayList arrayList2 = this.mPostCommands;
            int size2 = arrayList2.size();
            i = 0;
            while (i < size2) {
                int i3 = i + 1;
                ((Command) arrayList2.get(i)).execute(this);
                i = i3;
            }
            return this.mGraph;
        }

        protected Builder getBuilder() {
            return this.mBuilder;
        }

        public MffContext getContext() {
            return this.mContext;
        }

        public FilterFactory getFactory() {
            return this.mFactory;
        }

        public FilterGraph getGraph() {
            return this.mGraph;
        }

        public void postAppend(Command command) {
            this.mPostCommands.add(command);
        }
    }

    /* compiled from: PG */
    class GraphFactorySource {
        public static final String INDENT = "    ";
        public final int mBaseIndent;
        public final StringWriter mBuildCommands = new StringWriter();
        public final PrintWriter mBuildPrinter = new PrintWriter(this.mBuildCommands);
        public final String mGraphName;
        public final ImportSource mImports;
        public final String mParentName;
        public final StringWriter mPostBuildCommands = new StringWriter();
        public final PrintWriter mPostBuildPrinter = new PrintWriter(this.mPostBuildCommands);
        public final List mSubBuilders = new ArrayList();

        public GraphFactorySource(String str, String str2, ImportSource importSource, int i) {
            this.mGraphName = str;
            this.mParentName = str2;
            this.mImports = importSource;
            this.mBaseIndent = i;
        }

        public void addBuildCommand(String str) {
            writeLine(this.mBuildPrinter, this.mBaseIndent + 2, str);
        }

        public void addPostBuildCommand(String str) {
            writeLine(this.mPostBuildPrinter, this.mBaseIndent + 2, str);
        }

        public ImportSource imports() {
            return this.mImports;
        }

        public GraphFactorySource newSubBuilder(String str) {
            GraphFactorySource graphFactorySource = new GraphFactorySource(str, this.mGraphName, this.mImports, this.mBaseIndent + 1);
            this.mSubBuilders.add(graphFactorySource);
            return graphFactorySource;
        }

        private void writeLine(PrintWriter printWriter, int i, String str) {
            for (int i2 = 0; i2 < i; i2++) {
                printWriter.print(INDENT);
            }
            printWriter.println(str);
        }

        private void writeParentGraphConstructor(PrintWriter printWriter) {
            writeLine(printWriter, this.mBaseIndent + 1, "private final FilterGraph mParentGraph;");
            printWriter.println();
            writeLine(printWriter, this.mBaseIndent + 1, String.format("public %s(FilterGraph parentGraph) {", new Object[]{this.mGraphName}));
            writeLine(printWriter, this.mBaseIndent + 2, "mParentGraph = parentGraph;");
            writeLine(printWriter, this.mBaseIndent + 1, "}");
        }

        public void writeSourceCode(PrintWriter printWriter) {
            String str;
            writeLine(printWriter, this.mBaseIndent, String.format("public class %s implements GraphFactory {", new Object[]{this.mGraphName}));
            if (this.mParentName != null) {
                writeParentGraphConstructor(printWriter);
                printWriter.println();
            }
            writeLine(printWriter, this.mBaseIndent + 1, "@Override");
            writeLine(printWriter, this.mBaseIndent + 1, "public FilterGraph create(MffContext context) {");
            writeLine(printWriter, this.mBaseIndent + 2, "FilterGraph.Builder builder = new FilterGraph.Builder(context);");
            printWriter.print(this.mBuildCommands.toString());
            int i = this.mBaseIndent + 2;
            Object[] objArr = new Object[1];
            if (this.mParentName == null) {
                str = "build()";
            } else {
                str = "buildSubGraph(mParentGraph)";
            }
            objArr[0] = str;
            writeLine(printWriter, i, String.format("FilterGraph graph = builder.%s;", objArr));
            printWriter.print(this.mPostBuildCommands.toString());
            writeLine(printWriter, this.mBaseIndent + 2, "return graph;");
            writeLine(printWriter, this.mBaseIndent + 1, "}");
            for (GraphFactorySource graphFactorySource : this.mSubBuilders) {
                printWriter.println();
                graphFactorySource.writeSourceCode(printWriter);
            }
            writeLine(printWriter, this.mBaseIndent, "}");
        }
    }

    /* compiled from: PG */
    class ImportSource {
        public final PrintWriter mImportPrinter;
        public final StringWriter mImports;

        private ImportSource() {
            this.mImports = new StringWriter();
            this.mImportPrinter = new PrintWriter(this.mImports);
        }

        public void add(String str) {
            this.mImportPrinter.println(String.format("import %s.*;", new Object[]{str}));
        }

        public void writeSourceCode(PrintWriter printWriter) {
            printWriter.println("import com.google.android.libraries.smartburst.filterfw.Filter;");
            printWriter.println("import com.google.android.libraries.smartburst.filterfw.FilterGraph;");
            printWriter.println("import com.google.android.libraries.smartburst.filterfw.GraphFactory;");
            printWriter.println("import com.google.android.libraries.smartburst.filterfw.MffContext;");
            printWriter.println();
            printWriter.print(this.mImports.toString());
        }
    }

    /* compiled from: PG */
    class JavaSource {
        public final GraphFactorySource mBuilder;
        public final ImportSource mImports = new ImportSource();

        public JavaSource(String str) {
            this.mBuilder = new GraphFactorySource(str, null, this.mImports, 0);
        }

        private static String compileValue(Object obj) {
            if (obj == null) {
                return "null";
            }
            if (obj instanceof String) {
                String valueOf = String.valueOf(obj);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 2);
                stringBuilder.append("\"");
                stringBuilder.append(valueOf);
                stringBuilder.append("\"");
                return stringBuilder.toString();
            } else if (obj instanceof Integer) {
                return obj.toString();
            } else {
                if (obj instanceof Float) {
                    return String.valueOf(obj.toString()).concat("f");
                }
                if (obj instanceof Double) {
                    return obj.toString();
                }
                String valueOf2 = String.valueOf(obj.getClass());
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
                stringBuilder2.append("Cannot serialize value of type '");
                stringBuilder2.append(valueOf2);
                stringBuilder2.append("'!");
                throw new IOException(stringBuilder2.toString());
            }
        }

        public GraphFactorySource mainGraphFactory() {
            return this.mBuilder;
        }

        public void writeSourceCode(String str, Writer writer) {
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.println("// AUTO-GENERATED FILE: DO NOT MODIFY!");
            printWriter.println();
            printWriter.println(String.format("package %s;", new Object[]{str}));
            printWriter.println();
            this.mImports.writeSourceCode(printWriter);
            printWriter.println();
            this.mBuilder.writeSourceCode(printWriter);
        }
    }

    /* compiled from: PG */
    class Variable {
        public String name;

        public Variable(String str) {
            this.name = str;
        }
    }

    /* compiled from: PG */
    class XmlGraphReader {
        public SAXParserFactory mParserFactory = SAXParserFactory.newInstance();

        /* compiled from: PG */
        class GraphDataHandler extends DefaultHandler {
            public CommandStack mCommandStack;
            public String mCurFilterName = null;
            public boolean mInGraph = false;

            public GraphDataHandler(CommandStack commandStack) {
                this.mCommandStack = commandStack;
            }

            private void addConnectCommand(Attributes attributes) {
                String str;
                String str2;
                String value = attributes.getValue("source");
                if (value != null) {
                    String[] split = value.split(":");
                    if (split.length == 2) {
                        value = split[0];
                        str = split[1];
                    } else {
                        throw new RuntimeException("'source' tag needs to have format \"filter:port\"! Alternatively, you may use the form 'sourceFilter=\"filter\" sourcePort=\"port\"'.");
                    }
                }
                value = attributes.getValue("sourceFilter");
                str = attributes.getValue("sourcePort");
                String value2 = attributes.getValue("target");
                if (value2 != null) {
                    String[] split2 = value2.split(":");
                    if (split2.length == 2) {
                        value2 = split2[0];
                        str2 = split2[1];
                    } else {
                        throw new RuntimeException("'target' tag needs to have format \"filter:port\"! Alternatively, you may use the form 'targetFilter=\"filter\" targetPort=\"port\"'.");
                    }
                }
                value2 = attributes.getValue("targetFilter");
                str2 = attributes.getValue("targetPort");
                String value3 = attributes.getValue("sourceSlot");
                String value4 = attributes.getValue("targetSlot");
                if (value3 != null) {
                    value = String.valueOf(value3);
                    str = "sourceSlot_";
                    if (value.length() == 0) {
                        value = new String(str);
                    } else {
                        value = str.concat(value);
                    }
                    this.mCommandStack.append(new AddSourceSlotCommand(value, value3));
                    value3 = "frame";
                    str = value;
                } else {
                    value3 = str;
                    str = value;
                }
                if (value4 != null) {
                    value = String.valueOf(value4);
                    value2 = "targetSlot_";
                    if (value.length() == 0) {
                        value = new String(value2);
                    } else {
                        value = value2.concat(value);
                    }
                    this.mCommandStack.append(new AddTargetSlotCommand(value, value4));
                    str2 = "frame";
                } else {
                    value = value2;
                }
                assertValueNotNull("sourceFilter", str);
                assertValueNotNull("sourcePort", value3);
                assertValueNotNull("targetFilter", value);
                assertValueNotNull("targetPort", str2);
                this.mCommandStack.append(new ConnectCommand(str, value3, value, str2));
            }

            private void addFilterInput(Attributes attributes) {
                if (this.mCurFilterName == null) {
                    throw new SAXException("Found 'input' element outside of 'filter' element!");
                }
                String requiredAttribute = getRequiredAttribute(attributes, Person.NAME_KEY);
                Object assignmentValue = getAssignmentValue(attributes);
                if (assignmentValue == null) {
                    String str = this.mCurFilterName;
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(requiredAttribute).length() + 45) + String.valueOf(str).length());
                    stringBuilder.append("No value specified for input '");
                    stringBuilder.append(requiredAttribute);
                    stringBuilder.append("' of filter '");
                    stringBuilder.append(str);
                    stringBuilder.append("'!");
                    throw new SAXException(stringBuilder.toString());
                }
                this.mCommandStack.append(new SetFilterInputCommand(this.mCurFilterName, requiredAttribute, assignmentValue));
            }

            private void addImportCommand(Attributes attributes) {
                this.mCommandStack.append(new ImportPackageCommand(getRequiredAttribute(attributes, "package")));
            }

            private void addLibraryCommand(Attributes attributes) {
                this.mCommandStack.append(new AddLibraryCommand(getRequiredAttribute(attributes, Person.NAME_KEY)));
            }

            private void addVarCommand(Attributes attributes) {
                this.mCommandStack.append(new AddVariableCommand(getRequiredAttribute(attributes, Person.NAME_KEY), getAssignmentValue(attributes)));
            }

            private void assertInGraph(String str) {
                if (!this.mInGraph) {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 50);
                    stringBuilder.append("Encountered '");
                    stringBuilder.append(str);
                    stringBuilder.append("' element outside of 'graph' element!");
                    throw new SAXException(stringBuilder.toString());
                }
            }

            private static void assertValueNotNull(String str, Object obj) {
                if (obj == null) {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 32);
                    stringBuilder.append("Required value '");
                    stringBuilder.append(str);
                    stringBuilder.append("' not specified!");
                    throw new NullPointerException(stringBuilder.toString());
                }
            }

            private void beginFilter(Attributes attributes) {
                String requiredAttribute = getRequiredAttribute(attributes, "class");
                this.mCurFilterName = getRequiredAttribute(attributes, Person.NAME_KEY);
                this.mCommandStack.append(new AllocateFilterCommand(requiredAttribute, this.mCurFilterName));
            }

            private void beginGraph() {
                if (this.mInGraph) {
                    throw new SAXException("Found more than one graph element in XML!");
                }
                this.mInGraph = true;
            }

            private void beginMetaFilter(Attributes attributes) {
                beginFilter(attributes);
                String requiredAttribute = getRequiredAttribute(attributes, "graphResource");
                String value = attributes.getValue("resourceType");
                if (value == null) {
                    value = "raw";
                }
                this.mCommandStack.postAppend(new ConnectResourceSubGraphCommand(this.mCurFilterName, requiredAttribute, value));
            }

            public void endElement(String str, String str2, String str3) {
                if (str2.equals("graph")) {
                    endGraph();
                } else if (str2.equals("filter")) {
                    endFilter();
                }
            }

            private void endFilter() {
                this.mCurFilterName = null;
            }

            private void endGraph() {
                this.mInGraph = false;
            }

            private static Object getAssignmentValue(Attributes attributes) {
                String value = attributes.getValue("stringValue");
                if (value != null) {
                    return value;
                }
                value = attributes.getValue("booleanValue");
                if (value != null) {
                    return Boolean.valueOf(Boolean.parseBoolean(value));
                }
                value = attributes.getValue("intValue");
                if (value != null) {
                    return Integer.valueOf(Integer.parseInt(value));
                }
                value = attributes.getValue("floatValue");
                if (value != null) {
                    return Float.valueOf(Float.parseFloat(value));
                }
                value = attributes.getValue("floatsValue");
                if (value != null) {
                    String[] split = TextUtils.split(value, ",");
                    Object obj = new float[split.length];
                    for (int i = 0; i < split.length; i++) {
                        obj[i] = Float.parseFloat(split[i]);
                    }
                    return obj;
                }
                String value2 = attributes.getValue("varValue");
                return value2 != null ? new Variable(value2) : null;
            }

            private static String getRequiredAttribute(Attributes attributes, String str) {
                String value = attributes.getValue(str);
                if (value != null) {
                    return value;
                }
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 32);
                stringBuilder.append("Required attribute '");
                stringBuilder.append(str);
                stringBuilder.append("' not found!");
                throw new SAXException(stringBuilder.toString());
            }

            public void startElement(String str, String str2, String str3, Attributes attributes) {
                if (str2.equals("graph")) {
                    beginGraph();
                    return;
                }
                assertInGraph(str2);
                if (str2.equals("import")) {
                    addImportCommand(attributes);
                } else if (str2.equals("library")) {
                    addLibraryCommand(attributes);
                } else if (str2.equals("connect")) {
                    addConnectCommand(attributes);
                } else if (str2.equals("var")) {
                    addVarCommand(attributes);
                } else if (str2.equals("filter")) {
                    beginFilter(attributes);
                } else if (str2.equals("metafilter")) {
                    beginMetaFilter(attributes);
                } else if (str2.equals("input")) {
                    addFilterInput(attributes);
                } else {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 23);
                    stringBuilder.append("Unknown XML element '");
                    stringBuilder.append(str2);
                    stringBuilder.append("'!");
                    throw new SAXException(stringBuilder.toString());
                }
            }
        }

        private XMLReader getReaderForCommandStack(CommandStack commandStack) {
            try {
                XMLReader xMLReader = this.mParserFactory.newSAXParser().getXMLReader();
                xMLReader.setContentHandler(new GraphDataHandler(commandStack));
                return xMLReader;
            } catch (Throwable e) {
                throw new IOException("Error creating SAXParser for graph parsing!", e);
            } catch (Throwable e2) {
                throw new IOException("Error creating XMLReader for graph parsing!", e2);
            }
        }

        public void parseInput(InputStream inputStream, CommandStack commandStack) {
            try {
                getReaderForCommandStack(commandStack).parse(new InputSource(inputStream));
            } catch (Throwable e) {
                throw new IOException("XML parse error during graph parsing!", e);
            }
        }

        public void parseString(String str, CommandStack commandStack) {
            try {
                getReaderForCommandStack(commandStack).parse(new InputSource(new StringReader(str)));
            } catch (Throwable e) {
                throw new IOException("XML parse error during graph parsing!", e);
            }
        }
    }

    /* compiled from: PG */
    class AddLibraryCommand implements Command {
        public String mLibraryName;

        public AddLibraryCommand(String str) {
            this.mLibraryName = str;
        }

        public void compileToJava(MffContext mffContext, GraphFactorySource graphFactorySource) {
            throw new UnsupportedOperationException("Cannot compile library additions");
        }

        public void execute(CommandStack commandStack) {
            FilterFactory.addFilterLibrary(this.mLibraryName);
        }
    }

    /* compiled from: PG */
    class AddSourceSlotCommand implements Command {
        public String mName;
        public String mSlotName;

        public AddSourceSlotCommand(String str, String str2) {
            this.mName = str;
            this.mSlotName = str2;
        }

        public void compileToJava(MffContext mffContext, GraphFactorySource graphFactorySource) {
            graphFactorySource.addBuildCommand(String.format("builder.addFrameSlotSource(\"%s\", \"%s\")", new Object[]{this.mName, this.mSlotName}));
        }

        public void execute(CommandStack commandStack) {
            commandStack.getBuilder().addFrameSlotSource(this.mName, this.mSlotName);
        }
    }

    /* compiled from: PG */
    class AddTargetSlotCommand implements Command {
        public String mName;
        public String mSlotName;

        public AddTargetSlotCommand(String str, String str2) {
            this.mName = str;
            this.mSlotName = str2;
        }

        public void compileToJava(MffContext mffContext, GraphFactorySource graphFactorySource) {
            graphFactorySource.addBuildCommand(String.format("builder.addFrameSlotTarget(\"%s\", \"%s\")", new Object[]{this.mName, this.mSlotName}));
        }

        public void execute(CommandStack commandStack) {
            commandStack.getBuilder().addFrameSlotTarget(this.mName, this.mSlotName);
        }
    }

    /* compiled from: PG */
    class AddVariableCommand implements Command {
        public String mName;
        public Object mValue;

        public AddVariableCommand(String str, Object obj) {
            this.mName = str;
            this.mValue = obj;
        }

        public void compileToJava(MffContext mffContext, GraphFactorySource graphFactorySource) {
            graphFactorySource.addBuildCommand(String.format("builder.addVariable(\"%s\", %s);", new Object[]{this.mName, JavaSource.compileValue(this.mValue)}));
        }

        public void execute(CommandStack commandStack) {
            commandStack.getBuilder().addVariable(this.mName, this.mValue);
        }
    }

    /* compiled from: PG */
    class AllocateFilterCommand implements Command {
        public String mClassName;
        public String mFilterName;

        public AllocateFilterCommand(String str, String str2) {
            this.mClassName = str;
            this.mFilterName = str2;
        }

        public void compileToJava(MffContext mffContext, GraphFactorySource graphFactorySource) {
            r0 = new Object[3];
            String str = this.mFilterName;
            r0[0] = str;
            r0[1] = this.mClassName;
            r0[2] = str;
            graphFactorySource.addBuildCommand(String.format("Filter %s = new %s(context, \"%s\");", r0));
            graphFactorySource.addBuildCommand(String.format("builder.addFilter(%s);", new Object[]{this.mFilterName}));
        }

        public void execute(CommandStack commandStack) {
            try {
                commandStack.getBuilder().addFilter(commandStack.getFactory().createFilterByClassName(this.mClassName, this.mFilterName, commandStack.getContext()));
            } catch (Throwable e) {
                String str = this.mFilterName;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
                stringBuilder.append("Error creating filter ");
                stringBuilder.append(str);
                stringBuilder.append("!");
                throw new RuntimeException(stringBuilder.toString(), e);
            }
        }
    }

    /* compiled from: PG */
    class ConnectCommand implements Command {
        public String mSourceFilter;
        public String mSourcePort;
        public String mTargetFilter;
        public String mTargetPort;

        public ConnectCommand(String str, String str2, String str3, String str4) {
            this.mSourceFilter = str;
            this.mSourcePort = str2;
            this.mTargetFilter = str3;
            this.mTargetPort = str4;
        }

        public void compileToJava(MffContext mffContext, GraphFactorySource graphFactorySource) {
            graphFactorySource.addBuildCommand(String.format("builder.connect(%s, \"%s\", %s, \"%s\");", new Object[]{this.mSourceFilter, this.mSourcePort, this.mTargetFilter, this.mTargetPort}));
        }

        public void execute(CommandStack commandStack) {
            commandStack.getBuilder().connect(this.mSourceFilter, this.mSourcePort, this.mTargetFilter, this.mTargetPort);
        }
    }

    /* compiled from: PG */
    class ConnectResourceSubGraphCommand implements Command {
        public final String mFilterName;
        public final String mResourceName;
        public final String mResourceType;

        public ConnectResourceSubGraphCommand(String str, String str2, String str3) {
            this.mFilterName = str;
            this.mResourceName = str2;
            this.mResourceType = str3;
        }

        public void compileToJava(MffContext mffContext, GraphFactorySource graphFactorySource) {
            try {
                GraphReader.getCommandForXmlResource(mffContext, resourceIdForName(mffContext, this.mResourceName)).compileToBuilder(graphFactorySource.newSubBuilder(toCamelCase(this.mResourceName)));
                graphFactorySource.addPostBuildCommand(String.format("((MetaFilter) %s).setGraph(new %s(graph).create(context));", new Object[]{this.mFilterName, toCamelCase(this.mResourceName)}));
            } catch (Throwable e) {
                String str = this.mResourceName;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 28);
                stringBuilder.append("Could not load sub-graph '");
                stringBuilder.append(str);
                stringBuilder.append("'!");
                throw new RuntimeException(stringBuilder.toString(), e);
            }
        }

        public void execute(CommandStack commandStack) {
            try {
                FilterGraph readXmlSubGraphResource = GraphReader.readXmlSubGraphResource(commandStack.getContext(), resourceIdForName(commandStack.getContext(), this.mResourceName), commandStack.getGraph());
                Filter filter = commandStack.getGraph().getFilter(this.mFilterName);
                if (filter instanceof MetaFilter) {
                    ((MetaFilter) filter).setGraph(readXmlSubGraphResource);
                    return;
                }
                String str = this.mFilterName;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 52);
                stringBuilder.append("Attempting to load sub-graph into non-MetaFilter '");
                stringBuilder.append(str);
                stringBuilder.append("'!");
                throw new RuntimeException(stringBuilder.toString());
            } catch (Throwable e) {
                String str2 = this.mResourceName;
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str2).length() + 28);
                stringBuilder2.append("Could not load sub-graph '");
                stringBuilder2.append(str2);
                stringBuilder2.append("'!");
                throw new RuntimeException(stringBuilder2.toString(), e);
            }
        }

        private int resourceIdForName(MffContext mffContext, String str) {
            Context applicationContext = mffContext.getApplicationContext();
            String resourcePackageName = applicationContext.getResources().getResourcePackageName(C0073R.id.used_for_subgraph_package_name_retrieval);
            int identifier = applicationContext.getResources().getIdentifier(this.mResourceName, this.mResourceType, resourcePackageName);
            if (identifier != 0) {
                return identifier;
            }
            String str2 = this.mResourceName;
            String str3 = this.mResourceType;
            int length = String.valueOf(str2).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 47) + String.valueOf(str3).length()) + String.valueOf(resourcePackageName).length());
            stringBuilder.append("Unknown graph resource '");
            stringBuilder.append(str2);
            stringBuilder.append("' of type '");
            stringBuilder.append(str3);
            stringBuilder.append(" package: ");
            stringBuilder.append(resourcePackageName);
            stringBuilder.append("'!");
            throw new RuntimeException(stringBuilder.toString());
        }

        private static String toCamelCase(String str) {
            String[] split = str.split("_");
            for (int i = 0; i < split.length; i++) {
                if (split[i].length() > 0) {
                    String valueOf = String.valueOf(Character.toString(split[i].charAt(0)).toUpperCase());
                    String valueOf2 = String.valueOf(split[i].substring(1));
                    if (valueOf2.length() == 0) {
                        valueOf2 = new String(valueOf);
                    } else {
                        valueOf2 = valueOf.concat(valueOf2);
                    }
                    split[i] = valueOf2;
                }
            }
            return TextUtils.join("", split);
        }
    }

    /* compiled from: PG */
    class ImportPackageCommand implements Command {
        public String mPackageName;

        public ImportPackageCommand(String str) {
            this.mPackageName = str;
        }

        public void compileToJava(MffContext mffContext, GraphFactorySource graphFactorySource) {
            graphFactorySource.imports().add(this.mPackageName);
        }

        public void execute(CommandStack commandStack) {
            try {
                commandStack.getFactory().addPackage(this.mPackageName);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }

    /* compiled from: PG */
    class SetFilterInputCommand implements Command {
        public String mFilterInput;
        public String mFilterName;
        public Object mValue;

        public SetFilterInputCommand(String str, String str2, Object obj) {
            this.mFilterName = str;
            this.mFilterInput = str2;
            this.mValue = obj;
        }

        public void compileToJava(MffContext mffContext, GraphFactorySource graphFactorySource) {
            if (this.mValue instanceof Variable) {
                graphFactorySource.addBuildCommand(String.format("builder.assignVariableToFilterInput(\"%s\", \"%s\", \"%s\");", new Object[]{((Variable) this.mValue).name, this.mFilterName, this.mFilterInput}));
                return;
            }
            graphFactorySource.addBuildCommand(String.format("builder.assignValueToFilterInput(%s, \"%s\", \"%s\");", new Object[]{JavaSource.compileValue(this.mValue), this.mFilterName, this.mFilterInput}));
        }

        public void execute(CommandStack commandStack) {
            Object obj = this.mValue;
            if (obj instanceof Variable) {
                commandStack.getBuilder().assignVariableToFilterInput(((Variable) obj).name, this.mFilterName, this.mFilterInput);
                return;
            }
            commandStack.getBuilder().assignValueToFilterInput(this.mValue, this.mFilterName, this.mFilterInput);
        }
    }

    public static void compileXmlGraphResource(MffContext mffContext, int i, String str, String str2, Writer writer) {
        getCommandForXmlResource(mffContext, i).compileToJava(str, str2, writer);
    }

    public static void compileXmlGraphStream(MffContext mffContext, InputStream inputStream, String str, String str2, Writer writer) {
        getCommandForXmlStream(mffContext, inputStream).compileToJava(str, str2, writer);
    }

    private static CommandStack getCommandForXmlResource(MffContext mffContext, int i) {
        return getCommandForXmlStream(mffContext, mffContext.getApplicationContext().getResources().openRawResource(i));
    }

    private static CommandStack getCommandForXmlStream(MffContext mffContext, InputStream inputStream) {
        XmlGraphReader xmlGraphReader = new XmlGraphReader();
        CommandStack commandStack = new CommandStack(mffContext);
        xmlGraphReader.parseInput(inputStream, commandStack);
        return commandStack;
    }

    public static FilterGraph readXmlGraph(MffContext mffContext, InputStream inputStream) {
        return getCommandForXmlStream(mffContext, inputStream).execute(null);
    }

    public static FilterGraph readXmlGraphResource(MffContext mffContext, int i) {
        return getCommandForXmlResource(mffContext, i).execute(null);
    }

    public static FilterGraph readXmlSubGraph(MffContext mffContext, InputStream inputStream, FilterGraph filterGraph) {
        return getCommandForXmlStream(mffContext, inputStream).execute(filterGraph);
    }

    public static FilterGraph readXmlSubGraphResource(MffContext mffContext, int i, FilterGraph filterGraph) {
        return getCommandForXmlResource(mffContext, i).execute(filterGraph);
    }
}
