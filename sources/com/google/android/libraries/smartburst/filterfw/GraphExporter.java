package com.google.android.libraries.smartburst.filterfw;

import android.content.Context;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
public class GraphExporter {
    public static void exportAsDot(FilterGraph filterGraph, String str, boolean z) {
        int i;
        Context applicationContext = filterGraph.getContext().getApplicationContext();
        Filter[] filters = filterGraph.getFilters();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(applicationContext.openFileOutput(str, 0));
        outputStreamWriter.write("digraph graphname {\n");
        outputStreamWriter.write("  node [shape=record];\n");
        for (Filter filter : filters) {
            int i2;
            String valueOf = String.valueOf(filter.getName());
            String str2 = "  ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            outputStreamWriter.write(String.valueOf(getDotName(valueOf)).concat(" [label=\"{"));
            Set<String> inputPorts = getInputPorts(filter, z);
            if (inputPorts.size() > 0) {
                outputStreamWriter.write(" { ");
                i2 = 0;
                for (String valueOf2 : inputPorts) {
                    String dotName = getDotName(valueOf2);
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(dotName).length() + 5) + String.valueOf(valueOf2).length());
                    stringBuilder.append("<");
                    stringBuilder.append(dotName);
                    stringBuilder.append("_IN>");
                    stringBuilder.append(valueOf2);
                    outputStreamWriter.write(stringBuilder.toString());
                    i = i2 + 1;
                    if (i != inputPorts.size()) {
                        outputStreamWriter.write(" | ");
                        i2 = i;
                    } else {
                        i2 = i;
                    }
                }
                outputStreamWriter.write(" } | ");
            }
            outputStreamWriter.write(filter.getName());
            Set<String> outputPorts = getOutputPorts(filter, z);
            if (outputPorts.size() > 0) {
                outputStreamWriter.write(" | { ");
                i2 = 0;
                for (String valueOf22 : outputPorts) {
                    String dotName2 = getDotName(valueOf22);
                    StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(dotName2).length() + 6) + String.valueOf(valueOf22).length());
                    stringBuilder2.append("<");
                    stringBuilder2.append(dotName2);
                    stringBuilder2.append("_OUT>");
                    stringBuilder2.append(valueOf22);
                    outputStreamWriter.write(stringBuilder2.toString());
                    i = i2 + 1;
                    if (i != outputPorts.size()) {
                        outputStreamWriter.write(" | ");
                        i2 = i;
                    } else {
                        i2 = i;
                    }
                }
                outputStreamWriter.write(" } ");
            }
            outputStreamWriter.write("}\"];\n");
        }
        outputStreamWriter.write("\n");
        int length = filters.length;
        int i3 = 0;
        i = 0;
        while (i3 < length) {
            String dotName3;
            Filter filter2 = filters[i3];
            i2 = i;
            for (String valueOf222 : getOutputPorts(filter2, z)) {
                OutputPort connectedOutputPort = filter2.getConnectedOutputPort(valueOf222);
                if (connectedOutputPort != null) {
                    InputPort target = connectedOutputPort.getTarget();
                    dotName = getDotName(connectedOutputPort.getFilter().getName());
                    dotName3 = getDotName(connectedOutputPort.getName());
                    String dotName4 = getDotName(target.getFilter().getName());
                    valueOf222 = getDotName(target.getName());
                    int length2 = String.valueOf(dotName).length();
                    StringBuilder stringBuilder3 = new StringBuilder((((length2 + 17) + String.valueOf(dotName3).length()) + String.valueOf(dotName4).length()) + String.valueOf(valueOf222).length());
                    stringBuilder3.append("  ");
                    stringBuilder3.append(dotName);
                    stringBuilder3.append(":");
                    stringBuilder3.append(dotName3);
                    stringBuilder3.append("_OUT -> ");
                    stringBuilder3.append(dotName4);
                    stringBuilder3.append(":");
                    stringBuilder3.append(valueOf222);
                    stringBuilder3.append("_IN;\n");
                    outputStreamWriter.write(stringBuilder3.toString());
                } else {
                    if (filter2.getSignature().getOutputPortInfo(valueOf222).isRequired()) {
                        dotName3 = "red";
                    } else {
                        dotName3 = "blue";
                    }
                    i2++;
                    dotName = getDotName(filter2.getName());
                    valueOf222 = getDotName(valueOf222);
                    int length3 = String.valueOf(dotName3).length();
                    StringBuilder stringBuilder4 = new StringBuilder((((length3 + 88) + String.valueOf(dotName).length()) + String.valueOf(valueOf222).length()) + String.valueOf(dotName3).length());
                    stringBuilder4.append("  dummy");
                    stringBuilder4.append(i2);
                    stringBuilder4.append(" [shape=point,label=\"\",color=");
                    stringBuilder4.append(dotName3);
                    stringBuilder4.append("];\n  ");
                    stringBuilder4.append(dotName);
                    stringBuilder4.append(":");
                    stringBuilder4.append(valueOf222);
                    stringBuilder4.append("_OUT -> dummy");
                    stringBuilder4.append(i2);
                    stringBuilder4.append(" [color=");
                    stringBuilder4.append(dotName3);
                    stringBuilder4.append("];\n");
                    outputStreamWriter.write(stringBuilder4.toString());
                }
            }
            for (String valueOf2222 : getInputPorts(filter2, z)) {
                if (filter2.getConnectedInputPort(valueOf2222) == null) {
                    if (filter2.getSignature().getInputPortInfo(valueOf2222).isRequired()) {
                        dotName3 = "red";
                    } else {
                        dotName3 = "blue";
                    }
                    i2++;
                    dotName = getDotName(filter2.getName());
                    valueOf2222 = getDotName(valueOf2222);
                    length3 = String.valueOf(dotName3).length();
                    stringBuilder4 = new StringBuilder((((length3 + 87) + String.valueOf(dotName).length()) + String.valueOf(valueOf2222).length()) + String.valueOf(dotName3).length());
                    stringBuilder4.append("  dummy");
                    stringBuilder4.append(i2);
                    stringBuilder4.append(" [shape=point,label=\"\",color=");
                    stringBuilder4.append(dotName3);
                    stringBuilder4.append("];\n  dummy");
                    stringBuilder4.append(i2);
                    stringBuilder4.append(" -> ");
                    stringBuilder4.append(dotName);
                    stringBuilder4.append(":");
                    stringBuilder4.append(valueOf2222);
                    stringBuilder4.append("_IN [color=");
                    stringBuilder4.append(dotName3);
                    stringBuilder4.append("];\n");
                    outputStreamWriter.write(stringBuilder4.toString());
                }
            }
            i3++;
            i = i2;
        }
        outputStreamWriter.write("}\n");
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }

    private static String getDotName(String str) {
        return str.replaceAll("\\.", "___");
    }

    private static Set getInputPorts(Filter filter, boolean z) {
        Set hashSet = new HashSet();
        hashSet.addAll(filter.getConnectedInputPortMap().keySet());
        HashMap inputPorts = filter.getSignature().getInputPorts();
        if (inputPorts != null) {
            for (Entry entry : inputPorts.entrySet()) {
                if (z || ((PortInfo) entry.getValue()).isRequired()) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }

    private static Set getOutputPorts(Filter filter, boolean z) {
        Set hashSet = new HashSet();
        hashSet.addAll(filter.getConnectedOutputPortMap().keySet());
        HashMap outputPorts = filter.getSignature().getOutputPorts();
        if (outputPorts != null) {
            for (Entry entry : outputPorts.entrySet()) {
                if (z || ((PortInfo) entry.getValue()).isRequired()) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }
}
