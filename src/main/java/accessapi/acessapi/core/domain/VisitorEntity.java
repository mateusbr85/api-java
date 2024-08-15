package accessapi.acessapi.core.domain;

import java.sql.Timestamp;

public class VisitorEntity {
    Integer visitor_id;
    String visitor_rg;
    Long visitor_fk_person_id;
    Timestamp visitor_created_at;

    public VisitorEntity() {

    }

    public VisitorEntity( Integer visitor_id, String visitor_rg, Long visitor_fk_person_id, Timestamp visitor_created_at) {
        this.visitor_id = visitor_id;
        this.visitor_rg = visitor_rg;
        this.visitor_fk_person_id = visitor_fk_person_id;
        this.visitor_created_at = visitor_created_at;
    }

    public Timestamp getVisitor_created_at() {
        return visitor_created_at;
    }
    public Long getVisitor_fk_person_id() {
        return visitor_fk_person_id;
    }
    public Integer getVisitor_id() {
        return visitor_id;
    }
    public String getVisitor_rg() {
        return visitor_rg;
    }

    public void setVisitor_created_at(Timestamp visitor_created_at) {
        this.visitor_created_at = visitor_created_at;
    }
    public void setVisitor_fk_person_id(Long visitor_fk_person_id) {
        this.visitor_fk_person_id = visitor_fk_person_id;
    }
    public void setVisitor_id(Integer visitor_id) {
        this.visitor_id = visitor_id;
    }
    public void setVisitor_rg(String visitor_rg) {
        this.visitor_rg = visitor_rg;
    }
}
