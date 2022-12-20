package Kanban.Model;

import Kanban.Model.Enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "employees")
public class Employee  {

        @Id
        @Column(name = "id")
        @GeneratedValue
        private Long id;
        private String surname;
        private String name;
        private String login;
        private String email;



//        @Column(name = "password", length = 1000)
        private String password;
//        @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
//        @CollectionTable(name = "employee_role",
//                joinColumns = @JoinColumn(name = "employee_id"))
//        @Enumerated(EnumType.STRING)
//        private Set<Role> roles = new HashSet<>();
//        private LocalDateTime dateOfCreated;
        public Employee( ) {

        }

        public Employee(Long id, String surname, String name, String login, String email, String password) {
                this.id = id;
                this.surname = surname;
                this.name = name;
                this.login = login;
                this.email = email;
                this.password = password;
        }


        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getSurname() {
                return surname;
        }

        public void setSurname(String surname) {
                this.surname = surname;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getLogin() {
                return login;
        }

        public void setLogin(String login) {
                this.login = login;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }


        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

//        @Override
//        public Collection<? extends GrantedAuthority> getAuthorities() {
//                return roles;
//        }

//        @Override
//        public Collection<? extends GrantedAuthority> getAuthorities() {
//                return roles;
//        }
//
//        @Override
//        public String getUsername() {
//                return email;
//        }
//
//        @Override
//        public boolean isAccountNonExpired() {
//                return true;
//        }
//
//        @Override
//        public boolean isAccountNonLocked() {
//                return true;
//        }
//
//        @Override
//        public boolean isCredentialsNonExpired() {
//                return true;
//        }
//
//        @Override
//        public boolean isEnabled() {
//                return active;
//        }
}
