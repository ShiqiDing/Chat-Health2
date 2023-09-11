package com.example.hospital.api.service;

import com.example.hospital.api.db.pojo.DoctorWorkPlanScheduleEntity;

import java.util.ArrayList;
import java.util.Map;

public interface DoctorWorkPlanScheduleService {
    public void insert(ArrayList<DoctorWorkPlanScheduleEntity> list);
    public ArrayList searchDeptSubSchedule(Map param);
}
