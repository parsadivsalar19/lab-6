package healthSystem;

// سابقه پزشکی
public class DiseaseCase {

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    enum DiseaseType {
        HEART, ORTHOPEDICS, KIDNEY, WOMEN, DIGESTION;
    }
    
    private String description ;
    private Prescription prescription ;
      
    enum privacyLevel{
        HIGH , MEDIUM , LOW 
    }
    
    
  
    
}
