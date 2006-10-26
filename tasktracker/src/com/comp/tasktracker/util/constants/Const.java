package com.comp.tasktracker.util.constants;


public class Const {

    public static String NEW_LINE = "\n";
    public static String SPACE = " ";
    public static final Integer TITLE = new Integer(0);

    /*
     * Utility Constants
     */
    public static final String FORWARD_SLASH = "/";
    public static final String BACKWARD_SLASH = "\\";
    public static final String FILE_SEPARATOR = "file.separator";
    public static final String NO_VALUE_STR = "no_value";

    public class DateMode{
        /* Item */
        public static final int Dayfull_YYYY_MM_DD_HH_MM = 0;

        public static final int Day_YYYY_MM_DD_HH_MM = 1;

        public static final int day_YYYY_MM_DD_HH_MM = 2;

        public static final int day_YYYY_MM_DD = 3;

        public static final int YYYY_MM_DD_HH_MM = 4;

        public static final int YYYY_MM_DD = 5;

        public class WeekDay{
            /* Item */
            public static final String MON_VERSAL = "mån";

            public static final String TIS_VERSAL = "tis";

            public static final String ONS_VERSAL = "ons";

            public static final String TOR_VERSAL = "tor";

            public static final String FRE_VERSAL = "fre";

            public static final String LOR_VERSAL = "lör";

            public static final String SON_VERSAL = "sön";

            public static final String MON_CAPITAL = "Mån";

            public static final String TIS_CAPITAL = "Tis";

            public static final String ONS_CAPITAL = "Ons";

            public static final String TOR_CAPITAL = "Tor";

            public static final String FRE_CAPITAL = "Fre";

            public static final String LOR_CAPITAL = "Lör";

            public static final String SON_CAPITAL = "Sön";
        }
    }

    public class DateHelper{
        public static final String DATE_PART_SEPARATOR = "-";

        public static final String DATE_DATE_PART_TIME_SEPARATOR = ", ";

        public static final String DATE_TIME_SEPARATOR = ":";
    }

}

