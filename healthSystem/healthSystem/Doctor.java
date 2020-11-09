

package healthSystem;

import java.util.ArrayList;

public class Doctor {
 private ArrayList<DiseaseCase> accessibleCases;   
 private ArrayList<Patient> accessiblePatient ; // بیمارانی که کل سوابق پزشکی آن ها می تواند در خاتیار پزشک قرار بگیرد
 // ارجاع به پزشک جدید
 
 void passToNewDoctor(Patient patient , Doctor doctor ){
     
 }

 
 void addCaseToAccessibleList(DiseaseCase diseaseCase){
     
 }
 
 
 void addPatientToAccessibleList(Patient p){
     
 }

 
 void sharePrescriptionWithPharmacist(Pharmacist pharmacist , DiseaseCase diseaseCase){
     
 }

    public ArrayList<DiseaseCase> getAccessibleCases() {
        return accessibleCases;
    }

    public void setAccessibleCases(ArrayList<DiseaseCase> accessibleCases) {
        this.accessibleCases = accessibleCases;
    }

    public ArrayList<Patient> getAccessiblePatient() {
        return accessiblePatient;
    }

    public void setAccessiblePatient(ArrayList<Patient> accessiblePatient) {
        this.accessiblePatient = accessiblePatient;
    }
 
 
 
}
