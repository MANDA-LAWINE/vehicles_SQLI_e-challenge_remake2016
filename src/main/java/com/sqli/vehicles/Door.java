package com.sqli.vehicles;

class Door {
    private DoorStats doorStat;
    private Integer doorNumber;
    private String content;

    Door(Integer doorNum) {
        doorStat = new DoorClosed(this);
        doorNumber = doorNum;
    }

    void open() {
        doorStat.open();
    }

    void close() {
        doorStat.close();
    }

    public void setDoorStat(DoorStats doorStat) {
        this.doorStat = doorStat;
    }

    public Integer doorNumber() {
        return doorNumber;
    }

    String getContent() {
        return content;
    }

    void setContent(String content) {
        this.content = content;
    }

}
