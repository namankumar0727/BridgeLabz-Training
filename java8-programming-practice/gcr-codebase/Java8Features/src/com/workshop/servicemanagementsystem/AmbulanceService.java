package com.workshop.servicemanagementsystem;

public class AmbulanceService extends TaxiService implements EmergencyService {
    public AmbulanceService(String route, double fare, String departureTime) {
        super(route, fare, departureTime);
    }
}
