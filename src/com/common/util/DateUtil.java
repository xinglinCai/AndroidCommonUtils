
package com.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtil {

    public static final String TWELVE_FORMAT = "yyyy-MM-dd hh:mm:ss";
    public static final String TWENTYFOUR_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String formatDate(Date date, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.getDefault());
        return dateFormat.format(date);
    }

}
