package com.allandroidprojects.ecomsample.utility;


import android.content.Context;

public class UserData {

    public static String getPhoneNo(Context c) {

        return Preference.getString(c, "PhoneNumber");
    }

    public static void setPhoneNo(Context c, String phoneNo) {

        Preference.save(c, "PhoneNumber", phoneNo);
    }

    public static String getAddress(Context c) {

        return Preference.getString(c, "Address");
    }

    public static void setAddress(Context c, String address) {

        Preference.save(c, "Address", address);
    }


    /*Google Map Location*/
    public static String getGoogleLocation(Context c) {

        return Preference.getString(c, "GoogleLocation");
    }
    public static void setGoogleLocation(Context c, String googleLocation) {

        Preference.save(c, "GoogleLocation", googleLocation);
    }
    /**//**//**//**//**/



    /*Google Sign In Data*/
    public static String getGoogleName(Context c) {

        return Preference.getString(c, "GoogleName");
    }
    public static void setGoogleName(Context c, String googleName) {

        Preference.save(c, "GoogleName", googleName);
    }

    public static String getGoogleEmailAddress(Context c) {

        return Preference.getString(c, "GoogleEmailAddress");
    }
    public static void setGoogleEmailAddress(Context c, String googleEmailAddress) {

        Preference.save(c, "GoogleEmailAddress", googleEmailAddress);
    }

    public static String getGoogleProfilePic(Context c) {

        return Preference.getString(c, "GoogleProfilePic");
    }
    public static void setGoogleProfilePic(Context c, String googleProfilePic) {

        Preference.save(c, "GoogleProfilePic", googleProfilePic);
    }
    /**//**//**//**//**//**//**/



    /*Delivery Detail*/
    public static String getDeliveryName(Context c) {

        return Preference.getString(c, "DeliveryName");
    }
    public static void setDeliveryName(Context c, String deliveryName) {

        Preference.save(c, "DeliveryName", deliveryName);
    }
    public static String getDeliveryMobileNo(Context c) {

        return Preference.getString(c, "DeliveryMobileNo");
    }
    public static void setDeliveryMobileNo(Context c, String deliveryMobileNo) {

        Preference.save(c, "DeliveryMobileNo", deliveryMobileNo);
    }
    public static String getDeliveryAddress(Context c) {

        return Preference.getString(c, "DeliveryAddress");
    }
    public static void setDeliveryAddress(Context c, String deliveryAddress) {

        Preference.save(c, "DeliveryAddress", deliveryAddress);
    }

    public static String getDeliveryPincode(Context c) {

        return Preference.getString(c, "DeliveryPincode");
    }
    public static void setDeliveryPincode(Context c, String deliveryPinCode) {

        Preference.save(c, "DeliveryPincode", deliveryPinCode);
    }
     public static String getDeliveryLocation(Context c) {

        return Preference.getString(c, "DeliveryLocation");
    }
    public static void setDeliveryLocation(Context c, String deliveryLocation) {

        Preference.save(c, "DeliveryLocation", deliveryLocation);
    }
     public static String getDeliveryFlatno(Context c) {

        return Preference.getString(c, "DeliveryFlatno");
    }
    public static void setDeliveryFlatno(Context c, String deliveryFlatno) {

        Preference.save(c, "DeliveryFlstno", deliveryFlatno);
    }
    /**//**//**//**//**//**/
}

