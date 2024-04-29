package de.v_ens.map_pharmacy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pharmacy {

    Map<String, Medication> allMedications = new HashMap<>();

    public int getCount() {
        return allMedications.size();
    }

    public void save(Medication medication) {
        allMedications.put(medication.getName(), medication);
    }

    public String findMedication(String medicationName) {
        if (allMedications.containsKey(medicationName)) {
            return allMedications.get(medicationName).getName();
        } else {
            return null;
        }
    }

    public void delete(String medicationName) {
        allMedications.remove(medicationName);

    }

    public void printAllMedications() {
        for (Medication medication : allMedications.values()) {
//            System.out.println(medication.getName() + " " + medication.getPrice() + " " + medication.isAvailability());
            System.out.println(medication);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pharmacy pharmacy)) return false;
        return Objects.equals(allMedications, pharmacy.allMedications);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(allMedications);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "allMedications=" + allMedications +
                '}';
    }
}
