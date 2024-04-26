package de.v_ens.map_pharmacy;

/*
Step 1: Create a class 'Medication' with the methods 'getName', 'getPrice', and 'getAvailability'.

Step 2: Create a Java class 'Pharmacy' that uses a Java Map to store the Medication name as the key and its information as the value.

Step 3: Create a method 'int getCount()' in the class Pharmacy. This method should return the number of Medications in the pharmacy.

Step 4: Create a method 'void save(Medication medication)' in the class Pharmacy. This method should insert the Medication indexed by its name into the pharmacy.

Step 5: Create a method 'Medication find(String medicationName)' in the class Pharmacy. This method should return the requested Medication with this name. If no Medication with this name is found, the method should return null.

Step 6: Create a method 'void delete(String medicationName)' in the class Pharmacy. This method should delete the Medication with this name.

Step 7: Implement a method to print all Medications in the map, including their name, price, and availability.
 */
public class Main {

    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();

        pharmacy.save(new Medication("Paracetamol", 5, true));
        pharmacy.save(new Medication("Ibuprofen", 10, false));
        System.out.println("Count" + pharmacy.getCount());
        pharmacy.printAllMedications();
        System.out.println(pharmacy.findMedication("Ibuprofen"));
        System.out.println(pharmacy.findMedication("Ibu"));
        pharmacy.delete("Paracetamol");
        System.out.println("Count" + pharmacy.getCount());
        System.out.println(pharmacy.allMedications);
    }
}
