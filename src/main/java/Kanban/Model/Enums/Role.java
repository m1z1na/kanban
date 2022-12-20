package Kanban.Model.Enums;


import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_DEVELOPER, ROLE_TEAMLEAD;

    @Override
    public String getAuthority() {
        return name();
    }
}