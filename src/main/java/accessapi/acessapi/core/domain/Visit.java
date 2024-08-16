package accessapi.acessapi.core.domain;

import java.sql.Timestamp;

public class Visit {
    Long visit_id;
    Timestamp visit_created_at;
    Long visit_fk_resident_id;
    Long visit_fk_visitor_id;

    public Visit() {

    }

    public Visit(Long visit_id, Timestamp visit_created_at, Long visit_fk_resident_id, Long visit_fk_visitor_id) {

    }


    public Timestamp getVisit_created_at() {
        return visit_created_at;
    }
    public Long getVisit_fk_resident_id() {
        return visit_fk_resident_id;
    }
    public Long getVisit_fk_visitor_id() {
        return visit_fk_visitor_id;
    }
    public Long getVisit_id() {
        return visit_id;
    }

    public void setVisit_created_at(Timestamp visit_created_at) {
        this.visit_created_at = visit_created_at;
    }
    public void setVisit_fk_resident_id(Long visit_fk_resident_id) {
        this.visit_fk_resident_id = visit_fk_resident_id;
    }
    public void setVisit_fk_visitor_id(Long visit_fk_visitor_id) {
        this.visit_fk_visitor_id = visit_fk_visitor_id;
    }
    public void setVisit_id(Long visit_id) {
        this.visit_id = visit_id;
    }
}
