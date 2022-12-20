import java.io.FileWriter;
import java.io.IOException;

public class Unemployed {
    private String name;
    private String profession;
    private String education;
    private String lastWorkPlace;
    private String dismissalCause;
    private String maritalStatus;
    private String housingCond;
    private String contacts;
    private String requirements;

    private int idHuman;

    private static int counter;


    public static boolean textCorrect(String text){return text.matches("[А-я]{2,15}");}
    public static boolean nameCorrect(String nameText){return nameText.matches("[А-Я].[А-Я].[А-Я ].+");}

    public static boolean contactCorrect(String contactsText){
        return contactsText.matches("[+]\\d{11}");
    }

    public Unemployed (String name, String profession, String education, String lastWorkPlace, String dismissalCause, String maritalStatus, String housingCond, String contacts, String requirements) {
        this.name=name;
        this.profession=profession;
        this.education=education;
        this.lastWorkPlace=lastWorkPlace;
        this.dismissalCause=dismissalCause;
        this.maritalStatus=maritalStatus;
        this.housingCond=housingCond;
        this.contacts=contacts;
        this.requirements=requirements;

    }
    public void SetInf() throws IOException
        {
        FileWriter fw= new FileWriter("DBusers.txt",true);
        fw.write("Имя: "+this.name + "\n");
        fw.write("Профессия: "+this.profession+ "\n");
        fw.write("Образование: "+this.education+ "\n");
        fw.write("последнее рабочее место: "+this.lastWorkPlace+ "\n");
        fw.write("Причина увольнения: "+this.dismissalCause+ "\n");
        fw.write("семейный статус: "+this.maritalStatus+ "\n");
        fw.write("Жилье: "+this.housingCond+ "\n");
        fw.write("Контакты: "+this.contacts+ "\n");
        fw.write("требования: "+this.requirements+ "\n");
        fw.write("");

        fw.close();
    }

    public Unemployed(){}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getProfession() {return profession;}
    public void setProfession(String profession) {this.profession = profession;}

    public String getEducation() {return education;}
    public void setEducation(String education) {this.education = education;}

    public String getLastWorkPlace() {return lastWorkPlace;}
    public void setLastWorkPlace(String lastWorkPlace) {this.lastWorkPlace = lastWorkPlace;}

    public String getDismissalCause() {return dismissalCause;}
    public void setDismissalCause(String dismissalCause) {this.dismissalCause = dismissalCause;}

    public String getMaritalStatus() {return maritalStatus;}
    public void setMaritalStatus(String maritalStatus) {this.maritalStatus = maritalStatus;}

    public String getHousingCond() {return housingCond;}
    public void setHousingCond(String housingCond) {this.housingCond = housingCond;}

    public String getContacts() {return contacts;}
    public void setContacts(String contacts) {this.contacts = contacts;}

    public String getRequirements() {return requirements;}
    public void setRequirements(String requirements) {this.requirements = requirements;}



    @Override
    public String toString() {
        return  name +"\n" +
                profession+"\n" +
                education+"\n" +
                lastWorkPlace+"\n" +
                dismissalCause+"\n"  +
                maritalStatus+"\n" +
                housingCond  +"\n"   +
                contacts+"\n"+
                requirements +"\n" ;
    }
}

