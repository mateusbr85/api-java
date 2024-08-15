package accessapi.acessapi.core.domain;

public class PersonEntity {
    
    private Integer person_id;
    private String person_name;

    public PersonEntity () {

    }

    public PersonEntity (Integer person_id, String person_name) {
        this.person_id = person_id;
        this.person_name = person_name;
    }

    public Integer getPerson_id() {
        return person_id;
    }
    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }
    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }
}
