package com.example.travelmantics;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FirebaseUtil {
    public static FirebaseDatabase mFireBaseDatabase;
    public static DatabaseReference mDatabaseReference;
    private static FirebaseUtil firebaseUtil;
    public static ArrayList<TravelDeal> mDeals;

    private FirebaseUtil(){}

    public static void openFbreference(String ref){
        if (firebaseUtil == null){
            firebaseUtil = new FirebaseUtil();
            mFireBaseDatabase = FirebaseDatabase.getInstance();

        }
        mDeals = new ArrayList<TravelDeal>();
        mDatabaseReference = mFireBaseDatabase.getReference().child(ref);
    }

}
