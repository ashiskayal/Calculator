package com.kayalprints.calculator.unitConvertor.roomDB;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.kayalprints.calculator.Unit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Unit.class}, version = 1)
public abstract class UnitDatabase extends RoomDatabase {

    public static UnitDatabase instance;
    // Dao & Database Linking
    public abstract UnitDAO getDao();

    public static synchronized UnitDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext()
                            , UnitDatabase.class,"unit_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(callback)
                    .build();
        }
        return instance;
    }

    private static RoomDatabase.Callback callback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            UnitDAO dao = instance.getDao();
            ExecutorService executorService = Executors.newSingleThreadExecutor();

            executorService.execute(() -> {
                dao.insert(new Unit("sq-m","Square Meter", 1, "Area"));
                dao.insert(new Unit("sq-km","Square Kilometer", 0.000001, "Area"));
                dao.insert(new Unit("sq-mile","Square Mile", 0.0000003861, "Area"));
                dao.insert(new Unit("sq-y","Square Yard", 1.19599, "Area"));
                dao.insert(new Unit("sq-ft","Square Foot", 10.7639, "Area"));
                dao.insert(new Unit("sq-i","Square Inch", 1550, "Area"));
                dao.insert(new Unit("Hec","Hectare", 0.0001, "Area"));
                dao.insert(new Unit("Acre","Acre", 0.000247105, "Area"));

                dao.insert(new Unit("MB","Megabyte", 1, "Digital Storage - Decimal"));
                dao.insert(new Unit("b","Bit", 8000000, "Digital Storage - Decimal"));
                dao.insert(new Unit("Kb","Kilobit", 8000, "Digital Storage - Decimal"));
                dao.insert(new Unit("Mb","Megabit", 8, "Digital Storage - Decimal"));
                dao.insert(new Unit("Gb","Gegabit", .008, "Digital Storage - Decimal"));
                dao.insert(new Unit("Tb","Terabit", .000008, "Digital Storage - Decimal"));
                dao.insert(new Unit("Pb","Petabit", .000000008, "Digital Storage - Decimal"));
                dao.insert(new Unit("B","Byte", 1000000, "Digital Storage - Decimal"));
                dao.insert(new Unit("KB","Kilobyte", 1000, "Digital Storage - Decimal"));
                dao.insert(new Unit("GB","Gegabyte", .001, "Digital Storage - Decimal"));
                dao.insert(new Unit("TB","Terabyte", .000001, "Digital Storage - Decimal"));
                dao.insert(new Unit("PB","Petabyte", .000000001, "Digital Storage - Decimal"));

                dao.insert(new Unit("MiB","Mebibyte", 1, "Digital Storage - Binary"));
                dao.insert(new Unit("b","Bit", 8388608, "Digital Storage - Binary"));
                dao.insert(new Unit("Kib","Kibibit", 8192, "Digital Storage - Binary"));
                dao.insert(new Unit("Mib","Mebibit", 8, "Digital Storage - Binary"));
                dao.insert(new Unit("Gib","Gibibit", .0078125, "Digital Storage - Binary"));
                dao.insert(new Unit("Tib","Tebibit", .00000762939, "Digital Storage - Binary"));
                dao.insert(new Unit("Pib","Pebibit", .00000000745, "Digital Storage - Binary"));
                dao.insert(new Unit("B","Byte", 1048576, "Digital Storage - Binary"));
                dao.insert(new Unit("KiB","Kibibyte", 1024, "Digital Storage - Binary"));
                dao.insert(new Unit("GiB","Gibibyte", .0009765625, "Digital Storage - Binary"));
                dao.insert(new Unit("TiB","Tebibyte", .00000095367, "Digital Storage - Binary"));
                dao.insert(new Unit("PiB","Pebibyte", .00000000093132, "Digital Storage - Binary"));

                dao.insert(new Unit("m","Meter",1,"Length"));
                dao.insert(new Unit("cm","Centimeter",100,"Length"));
                dao.insert(new Unit("km","Kilometre",.001,"Length"));
                dao.insert(new Unit("mm","Millimetre",1000,"Length"));
                dao.insert(new Unit("micro-m","Micrometre",1000000,"Length"));
                dao.insert(new Unit("nano-m","Nanometre",1000000000,"Length"));
                dao.insert(new Unit("mi","Mile",.000621371,"Length"));
                dao.insert(new Unit("y","Yard",1.09361,"Length"));
                dao.insert(new Unit("ft","Foot",3.28084,"Length"));
                dao.insert(new Unit("in","Inch",39.3701,"Length"));
                dao.insert(new Unit("N-mi","Nautical Mile",.000539957,"Length"));

                dao.insert(new Unit("j","Joule",1,"Energy"));
                dao.insert(new Unit("kj","Kilojoule",.001,"Energy"));
                dao.insert(new Unit("g-cal","Gram Calorie",.239006,"Energy"));
                dao.insert(new Unit("k-cal","Kilo Calorie",.000239006,"Energy"));
                dao.insert(new Unit("Wh","Watt Hour",.000277778,"Energy"));
                dao.insert(new Unit("KWh","Kilo Watt Hour",.000000277778,"Energy"));
                dao.insert(new Unit("ft-p","Foot-Pound",.737562,"Energy"));
//                dao.insert(new Unit("Ev","Electronvolt",6242000000000000000,"Energy"));

                dao.insert(new Unit("Hz","Hertz",1,"Frequency"));
                dao.insert(new Unit("KHz","Kilohertz",.001,"Frequency"));
                dao.insert(new Unit("MHz","Megahertz",.000001,"Frequency"));
                dao.insert(new Unit("GHz","Gegahertz",.000000001,"Frequency"));

                dao.insert(new Unit("Kg","Kilogram",1,"Weight"));
                dao.insert(new Unit("T","Tonne",.001,"Weight"));
                dao.insert(new Unit("g","Gram",1000,"Weight"));
                dao.insert(new Unit("mg","Milligram",1000000,"Weight"));
                dao.insert(new Unit("micro-g","Microgram",1000000000,"Weight"));
                dao.insert(new Unit("p","Pound",2.20462,"Weight"));
                dao.insert(new Unit("stone","Stone",.157473,"Weight"));
                dao.insert(new Unit("ounce","Ounce",35.274,"Weight"));

                dao.insert(new Unit("degree","Degree",1,"Angle"));
                dao.insert(new Unit("arc-s","Arcsecond",3600,"Angle"));
                dao.insert(new Unit("Grad","Gradian",1.111111,"Angle"));
                dao.insert(new Unit("mRad","Milliradian",17.4533,"Angle"));
                dao.insert(new Unit("minute-arc","Minute of Arc",60,"Angle"));
                dao.insert(new Unit("Rad","Radian",.0174533,"Angle"));

                dao.insert(new Unit("bar","Bar",1,"Pressure"));
                dao.insert(new Unit("P","Pascal",100000,"Pressure"));
                dao.insert(new Unit("P/sqr-in","Pound per Square inch",14.5038,"Pressure"));
                dao.insert(new Unit("atm","Standard Atmosphere",.986923,"Pressure"));
                dao.insert(new Unit("torr","Torr",750.062,"Pressure"));


                dao.insert(new Unit("km/hr","Kilometer/Hour",1,"Speed"));
                dao.insert(new Unit("km/s","Kilometer/Second",.000277778,"Speed"));
                dao.insert(new Unit("m/hr","Meter/Hour",1000,"Speed"));
                dao.insert(new Unit("m/s","Meter/Second",.277778,"Speed"));
                dao.insert(new Unit("mi/hr","Mile/Hour",.621371,"Speed"));
                dao.insert(new Unit("mi/s","Mile/Second",.00017260306,"Speed"));
                dao.insert(new Unit("ft/s","Foot/Second",.911344,"Speed"));
                dao.insert(new Unit("ft/hr","Foot/Hour",3280.8384,"Speed"));
                dao.insert(new Unit("knot","Knot",.539957,"Speed"));

                dao.insert(new Unit("s","Second",1,"Time"));
                dao.insert(new Unit("ns","Nanosecond",1000000000,"Time"));
                dao.insert(new Unit("micro-s","Microsecond",1000000,"Time"));
                dao.insert(new Unit("ms","Millisecond",1000,"Time"));
                dao.insert(new Unit("m","Minute",.01666667,"Time"));
                dao.insert(new Unit("hr","Hour",.0002777778,"Time"));
                dao.insert(new Unit("D","Day",.000011574,"Time"));
                dao.insert(new Unit("W","Week",.0000016534,"Time"));
                dao.insert(new Unit("M","Month",.00000038052,"Time"));
                dao.insert(new Unit("yr","Year",.00000003171,"Time"));
                dao.insert(new Unit("decade","Decade",.000000003171,"Time"));
                dao.insert(new Unit("century","Century",.0000000003171,"Time"));

                dao.insert(new Unit("l","Liter",1,"Volume"));
                dao.insert(new Unit("fluid-ounce","Fluid Ounce",35.1951,"Volume"));
                dao.insert(new Unit("cu-m","Cubic Meter",.001,"Volume"));
                dao.insert(new Unit("ml","Milliliter",1000,"Volume"));
                dao.insert(new Unit("gallon","Gallon",.21997,"Volume"));
                dao.insert(new Unit("quart","Quart",.879877,"Volume"));
                dao.insert(new Unit("pint","Pint",1.75975,"Volume"));
                dao.insert(new Unit("cup","Cup",3.51951,"Volume"));
                dao.insert(new Unit("tablespoon","Tablespoon",56.3121,"Volume"));
                dao.insert(new Unit("teaspoon","Teaspoon",168.936,"Volume"));
                dao.insert(new Unit("cu-ft","Cubic-Foot",.0353147,"Volume"));
                dao.insert(new Unit("cu-in","Cubic-Inch",61.0237,"Volume"));

//                dao.insert(new Unit("C","Celsius",0,"Temperature"));
//                dao.insert(new Unit("F","Fahrenheit","(C*9/5)+32","Temperature"));
//                dao.insert(new Unit("K","Kelvin","C+273.15","Temperature"));

            });

        }
    };

}
