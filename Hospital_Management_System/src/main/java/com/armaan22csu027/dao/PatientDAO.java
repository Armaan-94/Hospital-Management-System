package com.armaan22csu027.dao;

import java.util.List;
import com.armaan22csu027.model.Patient;

public interface PatientDAO {
    int save(Patient patient);
    int update(Patient patient, int patient_id);
    int delete(int patient_id);
    List<Patient> getAll();
    Patient getById(int patient_id);
}
