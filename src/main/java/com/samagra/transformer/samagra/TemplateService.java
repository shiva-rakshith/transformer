package com.samagra.transformer.samagra;

public class TemplateService {

    public static String getTemplate(String managerName, String employeeName, String startDate, String endDate, String numberOfDays, String reasonForLeave){
        String template =  "Hi %s, this is to inform you that %s from your team has applied for a " +
                "leave from %s to %s for %s working days with reason being %s.\n" +
                "\n" +
                "Please choose one of the following options:\n" +
                "1. Approve \n" + "2. Reject \n";
        return String.format(template, managerName, employeeName, startDate, endDate, numberOfDays, reasonForLeave);
    }

    public static String getApprovalStatusMessage(String employeeName, String status, String ownerName){
        String template = "Hi %s! This is to inform you that your leave has been %s by your manager."
                + "Your program owner %s has also been apprised about your leave. Thanks!";
        return String.format(template, employeeName, status, ownerName);
    }

    public static String getManagerAcknowledgementMessage(String managerName){
        String template = "Thanks %s! Your action has been recorded. The team member and program owner will receive the relevant update.";
        return String.format(template, managerName);
    }

    public static String getPOReportMessage(String ownerName, String employeeName, String teamName, String startDate, String endDate, String numberOfDays){
        String template = "Hi %s, this is to inform you that %s from team %s will be on leave from %s to %s for %s working days, as approved by the manager.";
        return String.format(template, ownerName, employeeName, teamName, startDate, endDate, numberOfDays);
    }

    public static String getOneWayTripMessage(String employeeName, String travelDate, String startCity, String destinationCity, String flightNumber){
        String template = "%s has submitted an air travel request for %s from %s to %s for %s";
        return String.format(template, employeeName, travelDate, startCity, destinationCity, flightNumber);
    }

    public static String getTwoWayTripMessage(String employeeName, String travelDate, String returnDate, String startCity, String destinationCity, String flightNumber, String returnFlightNumber){
        String template = "%s has submitted an air travel request for %s to %s from %s to %s on %s and %s";
        return String.format(template, employeeName, travelDate, returnDate, startCity, destinationCity, flightNumber, returnFlightNumber);
    }

    public static String getTicketCancellationMesssage(String employeeName, String pnr){
        String template = "Hi Sanchita. %s has submitted a cancellation request for %s";
        return String.format(template, employeeName, pnr);
    }

    public static String getMissedFlightMessage(String employeeName, String pnr){
        String template = "Kindly note that %s was unsuccessful in boarding the flight booked under %s.";
        return String.format(template, employeeName, pnr);
    }
}
