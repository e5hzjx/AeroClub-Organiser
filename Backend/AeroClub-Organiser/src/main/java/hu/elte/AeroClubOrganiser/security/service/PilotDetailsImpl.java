package hu.elte.AeroClubOrganiser.security.service;

import hu.elte.AeroClubOrganiser.model.Pilot;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class PilotDetailsImpl implements UserDetails {
    private static final long serialVersionUID = 1L;

    private Pilot pilot;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ADMIN"));
        return authorities;
    }

    public PilotDetailsImpl(Pilot pilot) {
        this.pilot = pilot;
    }

    public static PilotDetailsImpl build(Pilot pilot) {
        return new PilotDetailsImpl(pilot);
    }


    public String getEmail(){ return pilot.getPilotEmail();}

    public long getId(){ return pilot.getId();}

    @Override
    public String getPassword() {
        return pilot.getPassword();
    }

    @Override
    public String getUsername() {
        return pilot.getPilotName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PilotDetailsImpl that = (PilotDetailsImpl) o;
        return pilot.equals(that.pilot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pilot);
    }
}
