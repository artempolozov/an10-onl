package com.polozov.mainCourseJava.lesson07.addtionalPart;

public class HospitalApplication {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // потенциальные пацименты
        Patient p1 = new Patient("Пациент-1");
        Patient p2 = new Patient("Пациент-2");
        Patient p3 = new Patient("Пациент-3");
        Patient p4 = new Patient("Пациент-4");

        // создаем карточки пациентов
        hospital.createPatientCard(p1);
        hospital.createPatientCard(p2);
        hospital.createPatientCard(p3);

        // проходит какое-то время

        // пациент проходит первичный осмотр
        hospital.initialInspection(p1);
        hospital.initialInspection(p2);
        hospital.initialInspection(p3);
        hospital.initialInspection(p4);

        // назначение доктора
        hospital.doctorsAppointment(p1);
        hospital.doctorsAppointment(p2);
        hospital.doctorsAppointment(p3);
        hospital.doctorsAppointment(p4);
    }
}
