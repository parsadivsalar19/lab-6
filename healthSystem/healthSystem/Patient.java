package healthSystem;

import java.util.ArrayList;
import java.util.Date;

public class Patient {

    private ArrayList<Doctor> TrustworthyDoctors;
    private DiseaseCase diseaseCase ;
    private Date birthDate;
    private char gender;
    private String insuranceType;
    private String supplementaryInsType;
    private String certificate;
    private String job;
    private String adress;
    private String region;

    public Patient(ArrayList<Doctor> TrustworthyDoctors, char gender,
                   String insuranceType,String supplementaryInsType, 
                   String certificate, String job, String adress, String region) 
    {
        this.TrustworthyDoctors = TrustworthyDoctors;
        this.gender = gender;
        this.insuranceType = insuranceType;
        this.supplementaryInsType = supplementaryInsType;
        this.certificate = certificate;
        this.job = job;
        this.adress = adress;
        this.region = region;
    }
    
    
    
    void allowCaseCreation(Doctor truthWorthyDoctor){
        
    }
    
    void addToTrustworthyList(Doctor doctor){
        
    }
    
    

    public ArrayList<Doctor> getTrustworthyDoctors() {
        return TrustworthyDoctors;
    }

    public void setTrustworthyDoctors(ArrayList<Doctor> TrustworthyDoctors) {
        this.TrustworthyDoctors = TrustworthyDoctors;
    }

    public DiseaseCase getDiseaseCase() {
        return diseaseCase;
    }

    public void setDiseaseCase(DiseaseCase diseaseCase) {
        this.diseaseCase = diseaseCase;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getSupplementaryInsType() {
        return supplementaryInsType;
    }

    public void setSupplementaryInsType(String supplementaryInsType) {
        this.supplementaryInsType = supplementaryInsType;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    
    

}
