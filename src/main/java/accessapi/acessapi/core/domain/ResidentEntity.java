package accessapi.acessapi.core.domain;

import java.sql.Timestamp;

public class ResidentEntity {
    Long resident_id;
    String resident_cpf;
    String resident_address;
    String resident_phone_number;
    Long resident_fk_person_id;
    Timestamp resident_created_at;


    public ResidentEntity () {

    }

    public ResidentEntity(Long resident_id, String resident_cpf, String resident_address, String resident_phone_number, Long resident_fk_person_id, Timestamp resident_created_at ) {
        this.resident_id = resident_id;
        this.resident_cpf = resident_cpf;
        this.resident_address = resident_address;
        this.resident_phone_number = resident_phone_number;
        this.resident_fk_person_id = resident_fk_person_id;
        this.resident_created_at = resident_created_at;
    }

    public String getResident_address() {
        return resident_address;
    }
    public String getResident_cpf() {
        return resident_cpf;
    }
    public Timestamp getResident_created_at() {
        return resident_created_at;
    }
    public Long getResident_fk_person_id() {
        return resident_fk_person_id;
    }
    public Long getResident_id() {
        return resident_id;
    }
    public String getResident_phone_number() {
        return resident_phone_number;
    }
    

    public void setResident_address(String resident_address) {
        this.resident_address = resident_address;
    }
    public void setResident_cpf(String resident_cpf) {
        this.resident_cpf = resident_cpf;
    }
    public void setResident_created_at(Timestamp resident_created_at) {
        this.resident_created_at = resident_created_at;
    }
    public void setResident_fk_person_id(Long resident_fk_person_id) {
        this.resident_fk_person_id = resident_fk_person_id;
    }
    public void setResident_id(Long resident_id) {
        this.resident_id = resident_id;
    }
    public void setResident_phone_number(String resident_phone_number) {
        this.resident_phone_number = resident_phone_number;
    }
}