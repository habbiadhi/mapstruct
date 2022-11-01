package com.habbiadhi.mapstruct.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    private static Util INSTANCE;

    public static Util getInstance() {
        if (INSTANCE == null) {
           INSTANCE = new Util();
        }
        return INSTANCE;
    }

    public Date stringToDate(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy");
        return sdf.parse(str);
    }
}
