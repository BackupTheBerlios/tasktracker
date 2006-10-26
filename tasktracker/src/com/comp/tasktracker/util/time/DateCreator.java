package com.comp.tasktracker.util.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

import com.comp.tasktracker.util.constants.Const;

public class DateCreator{

    protected SimpleDateFormat simpleDateFormat;
    protected int dateFormat;

    public DateCreator(int dateFormat){
        simpleDateFormat = createSimpleDateFormat(dateFormat);
        // Fix this - this must be set in another, nicer fashion!
        // Preferably with an outer mechanism just deciding about the date fashion
        this.dateFormat = dateFormat;
    }

    public void setDateFormat(int dateFormat){
        this.dateFormat = dateFormat;
        // also update the simple date format..
        simpleDateFormat = createSimpleDateFormat(dateFormat);
    }


    /* Swedish style:  2005-10-16, 23:27
     * yyyy.MM.dd G 'at' HH:mm:ss*/
    protected SimpleDateFormat createSimpleDateFormat(int dateMode){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.setTimeZone(new SimpleTimeZone(
                3600000,
                "Europe/Stockholm",
                Calendar.MARCH,
                -1,
                Calendar.SUNDAY,
                3600000,
                SimpleTimeZone.UTC_TIME,
                Calendar.OCTOBER,
                -1,
                Calendar.SUNDAY,
                3600000,
                SimpleTimeZone.UTC_TIME,
                3600000));


        switch(dateMode){
        case Const.DateMode.Dayfull_YYYY_MM_DD_HH_MM:   simpleDateFormat.applyPattern("EEEE yyyy-MM-dd, HH:mm");
                                                            return simpleDateFormat;

        case Const.DateMode.Day_YYYY_MM_DD_HH_MM:       simpleDateFormat.applyPattern("yyyy-MM-dd, HH:mm");
                                                            return simpleDateFormat;

        case Const.DateMode.day_YYYY_MM_DD_HH_MM:       simpleDateFormat.applyPattern("yyyy-MM-dd, HH:mm");
                                                            return simpleDateFormat;

        case Const.DateMode.YYYY_MM_DD_HH_MM:           simpleDateFormat.applyPattern("yyyy-MM-dd, HH:mm");
                                                            return simpleDateFormat;

        case Const.DateMode.YYYY_MM_DD:                 simpleDateFormat.applyPattern("yyyy-MM-dd");
                                                            return simpleDateFormat;

        default:                                            simpleDateFormat.applyPattern("yyyy-MM-dd, HH:mm");
                                                            return simpleDateFormat;
        }
    }

    public String formatDate(Date date){
        StringBuffer tmpDate;
        switch(dateFormat){
        case Const.DateMode.Day_YYYY_MM_DD_HH_MM:   tmpDate = new StringBuffer(decideWeekDayForADate(date));
                                                        tmpDate.append(Const.SPACE);
                                                        tmpDate.append(simpleDateFormat.format(date));
                                                        return tmpDate.toString();

        case Const.DateMode.day_YYYY_MM_DD_HH_MM:   tmpDate = new StringBuffer(decideWeekDayForADate(date));
                                                        tmpDate.append(Const.SPACE);
                                                        tmpDate.append(simpleDateFormat.format(date));
                                                        return tmpDate.toString();

        case Const.DateMode.day_YYYY_MM_DD:         tmpDate = new StringBuffer(decideWeekDayForADate(date));
                                                        tmpDate.append(Const.SPACE);
                                                        tmpDate.append(simpleDateFormat.format(date));
                                                        return tmpDate.toString();

        default:                                        return simpleDateFormat.format(date);
        }

    }

    /* to fix */
    public Date createDate(String date){
        try{
            return simpleDateFormat.parse(date);
        }
        catch(ParseException pe){
            System.out.println("Emil 1: " +pe.toString());
        }
        return new Date();
    }

    private String decideWeekDayForADate(Date date){
        Calendar calDate = new GregorianCalendar();
        calDate.setTime(date);

        switch(calDate.get(Calendar.DAY_OF_WEEK)){
            case 1: switch(dateFormat){
                        case Const.DateMode.Day_YYYY_MM_DD_HH_MM: return Const.DateMode.WeekDay.SON_CAPITAL;
                        default: return Const.DateMode.WeekDay.SON_VERSAL;
                    }

            case 2: switch(dateFormat){
                        case Const.DateMode.Day_YYYY_MM_DD_HH_MM: return Const.DateMode.WeekDay.MON_CAPITAL;
                        default: return Const.DateMode.WeekDay.MON_VERSAL;
                    }

            case 3: switch(dateFormat){
                        case Const.DateMode.Day_YYYY_MM_DD_HH_MM: return Const.DateMode.WeekDay.TIS_CAPITAL;
                        default: return Const.DateMode.WeekDay.TIS_VERSAL;
                    }

            case 4: switch(dateFormat){
                        case Const.DateMode.Day_YYYY_MM_DD_HH_MM: return Const.DateMode.WeekDay.ONS_CAPITAL;
                        default: return Const.DateMode.WeekDay.ONS_VERSAL;
                    }

            case 5: switch(dateFormat){
                        case Const.DateMode.Day_YYYY_MM_DD_HH_MM: return Const.DateMode.WeekDay.TOR_CAPITAL;
                        default: return Const.DateMode.WeekDay.TOR_VERSAL;
                    }

            case 6: switch(dateFormat){
                        case Const.DateMode.Day_YYYY_MM_DD_HH_MM: return Const.DateMode.WeekDay.FRE_CAPITAL;
                        default: return Const.DateMode.WeekDay.FRE_VERSAL;
                    }

            case 7: switch(dateFormat){
                        case Const.DateMode.Day_YYYY_MM_DD_HH_MM: return Const.DateMode.WeekDay.LOR_CAPITAL;
                        default: return Const.DateMode.WeekDay.LOR_VERSAL;
                    }

            default: switch(dateFormat){
                        case Const.DateMode.Day_YYYY_MM_DD_HH_MM: return Const.DateMode.WeekDay.MON_CAPITAL;
                        default: return Const.DateMode.WeekDay.MON_VERSAL;
                    }
        }
    }
}

