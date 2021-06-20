package com.example.demo;

import java.io.Serializable;
import java.util.Objects;

public class JobDto implements Serializable {

    private String vehicle;

    private String jobName;

    private String startDateTime;

    private String stopDateTime;

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getStopDateTime() {
        return stopDateTime;
    }

    public void setStopDateTime(String stopDateTime) {
        this.stopDateTime = stopDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobDto that = (JobDto) o;
        return Objects.equals(vehicle, that.vehicle) && Objects.equals(jobName, that.jobName) && Objects.equals(startDateTime, that.startDateTime) && Objects.equals(stopDateTime, that.stopDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicle, jobName, startDateTime, stopDateTime);
    }

    @Override
    public String toString() {
        return "JobRequestDto{" +
                "vehicle='" + vehicle + '\'' +
                ", jobName='" + jobName + '\'' +
                ", startDateTime='" + startDateTime + '\'' +
                ", stopDateTime='" + stopDateTime + '\'' +
                '}';
    }
}
