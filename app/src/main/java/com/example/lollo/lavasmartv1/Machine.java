package com.example.lollo.lavasmartv1;


import com.google.firebase.database.IgnoreExtraProperties;

// [START blog_user_class]
@IgnoreExtraProperties
public class Machine {

    public String name ;
    public String id ;
    public String location;
    public String status;
    public int start_time;
    public int stop_time;
    public String qr;

    public Machine() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }
    public Machine(String name, String location,String status)
    {
        this.location=location;
        this.name=name;
        this.status=status;
    }

    public Machine(String status, int start_time, int stop_time, String qr,String location) {
        this.status = status;
        this.start_time = start_time;
        this.stop_time = stop_time;
        this.location = location;
        this.qr = qr;
    }


    public Machine(String status, int start_time, int stop_time, String qr, String location, String id) {
        this.status = status;
        this.start_time = start_time;
        this.stop_time = stop_time;
        this.qr = qr;
        this.location = location;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }
}
// [END blog_user_class]
