package za.ac.cput.cardealershipparts.respository.impl;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import za.ac.cput.cardealershipparts.Domain.CarDealerShipShop;
import za.ac.cput.cardealershipparts.Domain.Cars;
import za.ac.cput.cardealershipparts.conf.Database.DatabaseConstants;
import za.ac.cput.cardealershipparts.respository.CarFactoryRepo;

public class CarImpl // extends SQLiteOpenHelper implements CarFactoryRepo
{

//    public static final String TABLE_NAME = "car";
//    private SQLiteDatabase db;
//
//    private Long id;
//    private String Make;
//    private String Model;
//    private String Colour;
//    private String year;
//    private String RegistrationNumber;
//
//    public static final String COLUMN_ID = "id";
//    public static final String COLUMN_MAKE = "make";
//    public static final String COLUMN_MODEL= "model";
//    public static final String COLUMN_COLOUR = "colour";
//    public static final String COLUMN_YEAR = "year";
//    public static final String COLUMN_REGISTRATIONNUMBER= "registrationnumber";
//
//
//    // Database creation sql statement
//    private static final String DATABASE_CREATE = " CREATE TABLE "
//            + TABLE_NAME + "("
//            + COLUMN_ID + " INTEGER  PRIMARY KEY AUTOINCREMENT, "
//            + COLUMN_MAKE + " TEXT UNIQUE NOT NULL , "
//            + COLUMN_MODEL + " TEXT NOT NULL , "
//            + COLUMN_COLOUR + " TEXT NOT NULL , "
//            + COLUMN_YEAR + " TEXT NOT NULL , "
//            + COLUMN_REGISTRATIONNUMBER + " TEXT NOT NULL );";
//
//    public CarImpl(Context context) {
//        super(context, DatabaseConstants.DATABASE_NAME, null, DatabaseConstants.DATABASE_VERSION);
//    }
//
//    public void open() throws SQLException {
//        db = this.getWritableDatabase();
//    }
//
//    public void close() {
//        this.close();
//    }
//
//    @Override
//    public Cars findById(Long id) {
//
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor cursor = db.query(
//                TABLE_NAME,
//                new String[]{
//                        COLUMN_ID,
//                        COLUMN_MAKE,
//                        COLUMN_MODEL,
//                        COLUMN_COLOUR,
//                        COLUMN_YEAR,
//                        COLUMN_REGISTRATIONNUMBER},
//                COLUMN_ID + " =? ",
//                new String[]{String.valueOf(id)},
//                null,
//                null,
//                null,
//                null);
//        if (cursor.moveToFirst()) {
//            final Cars candidate = new Cars
//                    .Builder((cursor.getString(cursor.getColumnIndex(COLUMN_REGISTRATIONNUMBER))))
//                    .id(cursor.getLong(cursor.getColumnIndex(COLUMN_ID)))
//                    .Make(cursor.getString(cursor.getColumnIndex(COLUMN_MAKE)))
//                    .Model(cursor.getString(cursor.getColumnIndex(COLUMN_MODEL)))
//                    .Colour(cursor.getString(cursor.getColumnIndex(COLUMN_COLOUR)))
//                    .year((cursor.getString(cursor.getColumnIndex(COLUMN_YEAR)))
//                    .build();
//
//            return candidate;
//        } else {
//            return null;
//        }
//    }
//
//    @Override   //Must Re-vist this method
//    public Cars save(CarDealerShipShop entity) {
//        open();
//        ContentValues values = new ContentValues();
//        values.put(COLUMN_ID, entity.getId());
//        values.put(COLUMN_DEALERSHOPNAME, entity.getDealerShopName());
//        values.put(COLUMN_CARSAVAILABLE, entity.getCarAvailable());
//        values.put(COLUMN_LOCATION, entity.getLocation());
//
//        long id = db.insertOrThrow(TABLE_NAME, null, values);
//        CarDealerShipShop insertedEntity = new CarDealerShipShop.Builder(COLUMN_DEALERSHOPNAME)
//                .copy(entity)
//                .id(new Long(id))
//                .build();
//        return insertedEntity;
//    }
//
//
//
//
//
//
//
}
