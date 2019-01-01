package com.sqli.vehicles;

public abstract class DoorStats {
    Door door;

    public abstract void open();

    public abstract void close();


    void doOpenDoor() {
        if (door.doorNumber() % 2 == 0)
            door.setContent("\\");
        else
            door.setContent("/");
    }

    void doCloseDoor() {
        door.setContent("|");
    }

    DoorStats(Door door) {
        this.door = door;
    }
}
