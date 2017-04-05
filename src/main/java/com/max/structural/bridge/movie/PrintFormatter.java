package com.max.structural.bridge.movie;

import java.util.List;

/**
*  Formats details for human-readable print (i.e. newspaper)
*/
public class PrintFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder sb = new StringBuilder();
        sb.append(header);
        sb.append("\n");

        for (Detail detail : details) {
            sb.append(detail.getLabel());
            sb.append(": ");
            sb.append(detail.getValue());
            sb.append("\n");

        }

        return sb.toString();
    }
}
