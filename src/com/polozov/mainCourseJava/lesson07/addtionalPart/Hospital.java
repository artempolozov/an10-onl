package com.polozov.mainCourseJava.lesson07.addtionalPart;

public class Hospital {
    private PatientCard[] cards;

    public Hospital() {
        this.cards = new PatientCard[1000];
    }

    public void doctorsAppointment(Patient patient) {
        PatientCard card = findPatientCardByPatient(patient);
        if (card == null) {
            showInformation("Карта пациента " + patient.getName() + "не найдена");
            return;
        }
        Doctor doctor;
        switch (card.getPatient().getPlan().getCode()) {
            case "1":
                doctor = new SurgeonDoctor();
                break;
            case "2":
                doctor = new DentistDoctor();
                break;
            default:
                doctor = new TherapistDoctor();
        }
        card.setDoctor(doctor);
        invokeCure(card);
    }

    private void invokeCure(PatientCard card) {
        getInformBeforeTherapy(card);
        card.getDoctor().treating();
    }

    private void getInformBeforeTherapy(PatientCard card) {
        showInformation(String.format("\nПациент: %s\n\tНазначен врач: %s\n\tЛечение: ",
                card.getPatient().getName(),
                card.getDoctor().getSpecialization()));
    }

    public void createPatientCard(Patient patient) {
        addPatientCard(new PatientCard(patient));
    }

    private void addPatientCard(PatientCard card) {
        for (int i = 0; i < this.cards.length; i++) {
            if (this.cards[i] == null) {
                this.cards[i] = card;
                break;
            }
        }
    }

    public void initialInspection(Patient patient) {
        PatientCard card = findPatientCardByPatient(patient);
        if (card == null) {
            showInformation("\nПациент " + patient.getName() + " еще не зарегистрирова в системе\n");
            return;
        }
        card.getPatient().getPlan().setCode(String.valueOf((int) (Math.random() * 3)));
    }

    private void showInformation(String s) {
        System.out.print(s);
    }

    private PatientCard findPatientCardByPatient(Patient patient) {
        for (PatientCard card : this.cards) {
            if (card != null && card.getPatient().equals(patient)) {
                return card;
            }
        }
        return null;
    }
}
