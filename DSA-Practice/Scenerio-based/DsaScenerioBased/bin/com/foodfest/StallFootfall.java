package com.foodfest;
class StallFootfall {
    String stallName;
    int footfall;

    StallFootfall(String stallName, int footfall) {
        this.stallName = stallName;
        this.footfall = footfall;
    }

    @Override
    public String toString() {
        return stallName + " -> " + footfall + " customers";
    }
}
