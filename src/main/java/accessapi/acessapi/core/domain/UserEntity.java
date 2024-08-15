package accessapi.acessapi.core.domain;

public class UserEntity {
    private Long user_id;
    private String user_email;
    private String user_password;
    private Long user_fk_person_id;
    private Boolean user_administrator;

    public UserEntity(Long user_id, String user_email,String user_password,Boolean user_administrator) {
        this.user_id = user_id;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_administrator = user_administrator;
    }

    public UserEntity() {
        
    }

    public Boolean getUser_administrator() {
        return user_administrator;
    }
    public String getUser_emai() {
        return user_email;
    }
    public Long getUser_fk_person_id() {
        return user_fk_person_id;
    }
    public Long getUser_id() {
        return user_id;
    }
    public String getUser_password() {
        return user_password;
    }


    public void setUser_administrator(Boolean user_administrator) {
        this.user_administrator = user_administrator;
    }
    public void setUser_emai(String user_email) {
        this.user_email = user_email;
    }
    public void setUser_fk_person_id(Long user_fk_person_id) {
        this.user_fk_person_id = user_fk_person_id;
    }
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}
