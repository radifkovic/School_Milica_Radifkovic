package course;

public class Course {

    public String name;
    public int numberOfClasses;
    public String codeName;

    public Course(){
        this.name = "QA";
        this.numberOfClasses = 34;
        this.codeName = "September 2018.";
    }
    
    public Course(String name, int numberOfClasses, String codeName) {
        this.name = name;
        this.numberOfClasses = numberOfClasses;
        this.codeName = codeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

}
