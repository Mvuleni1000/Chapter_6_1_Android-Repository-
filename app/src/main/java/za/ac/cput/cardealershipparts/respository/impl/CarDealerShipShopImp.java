package za.ac.cput.cardealershipparts.respository.impl;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.HashSet;
import java.util.Set;

import za.ac.cput.cardealershipparts.Domain.CarDealerShipShop;
import za.ac.cput.cardealershipparts.conf.Database.DatabaseConstants;
import za.ac.cput.cardealershipparts.respository.CarDealerShipShopRepo;

public class CarDealerShipShopImp extends SQLiteOpenHelper implements CarDealerShipShopRepo
{

    public static final String TABLE_NAME = "carDealershipShop";
    private SQLiteDatabase db;


    public static final String COLUMN_ID = "id";
    public static final String COLUMN_DEALERSHOPNAME = "dearlshopname";
    public static final String COLUMN_LOCATION = "location";
    public static final String COLUMN_CARSAVAILABLE = "available";

    // Database creation sql statement
    private static final String DATABASE_CREATE = " CREATE TABLE "
            + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER  PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_DEALERSHOPNAME + " TEXT UNIQUE NOT NULL , "
            + COLUMN_LOCATION + " TEXT NOT NULL , "
            + COLUMN_CARSAVAILABLE + " TEXT NOT NULL );";



    public CarDealerShipShopImp(Context context) {
        super(context, DatabaseConstants.DATABASE_NAME, null, DatabaseConstants.DATABASE_VERSION);
    }

    public void open() throws SQLException {
        db = this.getWritableDatabase();
    }

    public void close() {
        this.close();
    }

    @Override
    public CarDealerShipShop findById(Long id) {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(
                TABLE_NAME,
                new String[]{
                        COLUMN_ID,
                        COLUMN_DEALERSHOPNAME,
                        COLUMN_LOCATION,
                        COLUMN_CARSAVAILABLE,},
                COLUMN_ID + " =? ",
                new String[]{String.valueOf(id)},
                null,
                null,
                null);
        if (cursor.moveToFirst()) {
            final CarDealerShipShop candidate = new CarDealerShipShop.Builder((cursor.getString(cursor.getColumnIndex(COLUMN_DEALERSHOPNAME))))
                    .id(cursor.getLong(cursor.getColumnIndex(COLUMN_ID)))
                   // .copy(cursor.getString(cursor.getColumnIndex(COLUMN_DEALERSHOPNAME)))
                    .location(cursor.getString(cursor.getColumnIndex(COLUMN_LOCATION)))
                    .carAvailable(cursor.getString(cursor.getColumnIndex(COLUMN_CARSAVAILABLE)))
                    .build();

            return candidate;
        } else {
            return null;
        }
    }

    @Override   //Must Re-vist this method
    public CarDealerShipShop save(CarDealerShipShop entity) {
        open();
        ContentValues values = new ContentValues();
        values.put(COLUMN_ID, entity.getId());
        values.put(COLUMN_DEALERSHOPNAME, entity.getDealerShopName());
        values.put(COLUMN_CARSAVAILABLE, entity.getCarAvailable());
        values.put(COLUMN_LOCATION, entity.getLocation());

        long id = db.insertOrThrow(TABLE_NAME, null, values);
        CarDealerShipShop insertedEntity = new CarDealerShipShop.Builder(COLUMN_DEALERSHOPNAME)
                .copy(entity)
                .id(new Long(id))
                .build();
        return insertedEntity;
    }

    @Override
    public CarDealerShipShop update(CarDealerShipShop entity) {
        open();
        ContentValues values = new ContentValues();
        values.put(COLUMN_ID, entity.getId());
        values.put(COLUMN_DEALERSHOPNAME, entity.getDealerShopName());
        values.put(COLUMN_CARSAVAILABLE, entity.getCarAvailable());
        values.put(COLUMN_LOCATION, entity.getLocation());
        db.update(
                TABLE_NAME,
                values,
                COLUMN_ID + " =? ",
                new String[]{String.valueOf(entity.getId())}
        );
        return entity;
    }

    @Override
    public CarDealerShipShop delete(CarDealerShipShop entity) {
        open();
        db.delete(
                TABLE_NAME,
                COLUMN_ID + " =? ",
                new String[]{String.valueOf(entity.getId())});
        return entity;
    }

    @Override
    public Set<CarDealerShipShop> findAll() {
        SQLiteDatabase db = this.getReadableDatabase();
        Set<CarDealerShipShop> candidates = new HashSet<>();
        open();
        Cursor cursor = db.query(TABLE_NAME, null,null,null,null,null,null);
        if (cursor.moveToFirst()) {
            do {
                final CarDealerShipShop candidate = new CarDealerShipShop.Builder((cursor.getString(cursor.getColumnIndex(COLUMN_DEALERSHOPNAME))))
                        .id(cursor.getLong(cursor.getColumnIndex(COLUMN_ID)))
                        .location(cursor.getString(cursor.getColumnIndex(COLUMN_LOCATION)))
                        .carAvailable(cursor.getString(cursor.getColumnIndex(COLUMN_CARSAVAILABLE)))
                        .build();
                candidates.add(candidate);
            } while (cursor.moveToNext());
        }
        return candidates;
    }

    @Override
    public int deleteAll() {
        open();
        int rowsDeleted = db.delete(TABLE_NAME,null,null);
        close();
        return rowsDeleted;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(this.getClass().getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }









}
