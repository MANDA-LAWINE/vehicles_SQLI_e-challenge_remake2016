package com.sqli.vehicles;

public abstract class DoorStats {
    protected Door door;

    public abstract void open();

    public abstract void close();


    protected void doOpenDoor() {
        if (door.doorNumber() % 2 == 0)
            door.setContent("\\");
        else
            door.setContent("/");
    }

    protected void doCloseDoor() {
        door.setContent("|");
    }

    DoorStats(Door door) {
        this.door = door;
    }
}
