package accessapi.acessapi.adapter.dtos.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDtoReturnig {
    private Long user_id;
    private String user_email;
    private String person_name;
    private Boolean user_administrator;
}
